package com.wqy.controller.base;

import com.wqy.dao.mapper.BrandMapper;
import com.wqy.dao.mapper.PatentMapper;
import com.wqy.entity.Brand;
import com.wqy.entity.Patent;
import com.wqy.util.Results;
import com.wqy.util.Upload;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * 文件上传Controller 支持多文件
 */
@Controller
public class UploadController {
    /**
     * 测试webUpload 文件上传
     * @return
     */
    @RequestMapping("/WebUpload.do")
    @ResponseBody
    public Results webUpload(HttpServletRequest request, HttpServletResponse response, String index) throws IOException {
        System.out.println("test文件上传"+index);
        MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
        Map<String,MultipartFile> files = multipartHttpServletRequest.getFileMap();
        //上传到的位置
        String realpath;
        if(index.equals("1")||index.equals("4")){
            realpath = request.getSession().getServletContext().getRealPath("/upload/images/");
        }else {
            realpath = request.getSession().getServletContext().getRealPath("/upload/files/");
        }
        //实例化文件夹
        File dir = new File(realpath);
        //如果不存在该文件夹就进行创建
        if(!dir.exists()){
            dir.mkdir();
        }
        String fileNames = "";
        //进行文件的上传操作 数据转换
        for(MultipartFile file : files.values()) {
            //获取文件名
            String oname = file.getOriginalFilename();
//            String suffix = oname.substring(oname.lastIndexOf("."),oname.length());
//            String fileName = UUID.randomUUID()+suffix;
//            fileNames = ","+fileName;
            fileNames = ","+oname;
            //创建上传的文件
            File f = new File(realpath, oname);
            //设置bytes
            byte[] buffer = file.getBytes();
            FileUtils.writeByteArrayToFile(f, buffer);
        }

        Results results = new Results();
        results.setResult(true);
        results.setMsg(fileNames);
        results.setObj(index);
        return results;
    }


    @Autowired
    private PatentMapper patentMapper;//专利库Dao
    @Autowired
    private BrandMapper brandMapper;//商标库Dao
    /**
     * 测试图片编辑上传
     * @return
     */
    @RequestMapping("/editImage.do")
    @ResponseBody
    public Results editImage(MultipartFile multipartFile, HttpServletRequest request, String pid) throws IOException {
        System.out.println("editImage上传"+pid);
        Upload.uploadImages(multipartFile,request,"1");//上传文件

        if(pid.startsWith("p")||pid.startsWith("testp")){
            //修改专利库
            Patent patent = new Patent();
            patent.setId(pid);//设置id
            patent.setImage(multipartFile.getOriginalFilename());//修改图片
            patentMapper.updateByPrimaryKeySelective(patent);//修改专利库
        }
        if(pid.startsWith("b")||pid.startsWith("test")){
            //修改商标库
            Brand brand = new Brand();
            brand.setId(pid);//设置id
            brand.setBrandStyle(multipartFile.getOriginalFilename());//修改商标标样
            brandMapper.updateByPrimaryKeySelective(brand);//修改商标库
        }

        //发送返回前端数据
        Results results = new Results();
        results.setResult(true);
        results.setMsg("editImage");
        return results;
    }
}
