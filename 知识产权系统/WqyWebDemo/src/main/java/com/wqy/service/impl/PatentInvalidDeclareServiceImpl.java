package com.wqy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wqy.dao.mapper.*;
import com.wqy.entity.*;
import com.wqy.model.patent.WebPatentInvalidDeclareInfo;
import com.wqy.pojo.patent.PatentInvalidDeclareInfo;
import com.wqy.service.PatentInvalidDeclareService;
import com.wqy.util.Results;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 专利无效宣告ServiceImpl
 */
@Service
public class PatentInvalidDeclareServiceImpl implements PatentInvalidDeclareService {
    @Autowired
    private PatentRenewalsNewMapper patentRenewalsNewMapper;//专利续展
    @Autowired
    private PatentMapper patentMapper;//专利
    @Autowired
    private PatentInvalidDeclareMapper patentInvalidDeclareMapper;//专利无效宣告
    @Autowired
    private PatentAcceptMapper patentAcceptMapper;//专利转让
    @Autowired
    private PatentLawsuitMapper patentLawsuitMapper;//专利诉讼

    /**
     * 根据条件查询专利无效宣告数据/显示数据list
     * @param webPatentInvalidDeclareInfo
     * @param page
     * @param rows
     * @return
     */
    @Override
    public Map listEX(WebPatentInvalidDeclareInfo webPatentInvalidDeclareInfo, int page, int rows) {

        String str = webPatentInvalidDeclareInfo.getHid_value_address();
        String[] strs = str.split(",");
        webPatentInvalidDeclareInfo.setAdds(Arrays.asList(strs));

        PageHelper.startPage(page,rows);

        List<PatentInvalidDeclareInfo> lists = patentInvalidDeclareMapper.listEX(webPatentInvalidDeclareInfo);

        PageInfo<PatentInvalidDeclareInfo> pageInfo = new PageInfo<>(lists);

        Map map = new HashMap();
        map.put("total",pageInfo.getTotal());
        map.put("rows",lists);

        return map;
    }



    /**
     * 新增无效宣告数据
     * @param web
     * @return
     */
    @Override
    public Results add(WebPatentInvalidDeclareInfo web) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//设置转换Date规则
        String id = "wx-"+ UUID.randomUUID();//获取ID
        String  pid = "p-"+UUID.randomUUID();//获取PID

        //新增专利库
        Patent p = new Patent();
        p.setId(pid);//设置id
        p.setTechnicalClassification(web.getTechnical_classification());//设置技术分类
        p.setPatentname(web.getPatentName());//设置专利名称
        if(!web.getImage().equals("")){
            p.setImage(web.getImage().substring(1,web.getImage().length()));//图示 去掉逗号
        }
        p.setPatentProduct(web.getPatent_product());//专利产品
        p.setApplyType(web.getApply_type());//申请类型
        p.setProtectedAreas(web.getProtected_areas());//设置保护地域
        p.setPatentType(web.getPatent_type());//设置专利类型
        if(!web.getApply_date().equals("")){
            p.setApplyDate(sdf.parse(web.getApply_date()));//设置申请日
        }
        p.setApplyName(web.getApply_name());//设置申请人

        if(!web.getAccredit_date().equals("")){
            p.setAccreditDate(sdf.parse(web.getAccredit_date()));//设置授权公告日
        }
        p.setPatentNumber(web.getPatent_number());//设置专利号


        //新增专利续展
        PatentRenewalsNew patentRenewalsNew = new PatentRenewalsNew();
        patentRenewalsNew.setId("xz-"+ UUID.randomUUID());//设置id
        patentRenewalsNew.setPid(pid);//设置pid

        //新增专利无效宣告
        PatentInvalidDeclare patentInvalidDeclare = new PatentInvalidDeclare();
        patentInvalidDeclare.setId(id);//设置id
        patentInvalidDeclare.setPid(pid);//设置pid
        patentInvalidDeclare.setInvalidOwer(web.getInvalid_ower());//设置提无效公司/人
        if(web.getInvalid_files()!=null){
            patentInvalidDeclare.setInvalidFiles(web.getInvalid_files().substring(1,web.getInvalid_files().length()));//设置无效申请/答辩文件
        }
        if(web.getResults()!=null){
            patentInvalidDeclare.setResults(web.getResults().substring(1,web.getResults().length()));//设置裁判结果
        }

        //新增专利转让
        PatentAccept patentAccept = new PatentAccept();
        patentAccept.setId("zr-"+UUID.randomUUID());//设置id
        patentAccept.setPid(pid);//设置pid


        //新增专利诉讼
        PatentLawsuit patentLawsuit = new PatentLawsuit();
        patentLawsuit.setId("ss-"+UUID.randomUUID());//设置id
        patentLawsuit.setPid(pid);//设置pid

        //进行新增操作
        patentMapper.insertSelective(p);
        patentRenewalsNewMapper.insertSelective(patentRenewalsNew);
        int i = patentInvalidDeclareMapper.insertSelective(patentInvalidDeclare);
        patentAcceptMapper.insertSelective(patentAccept);
        patentLawsuitMapper.insertSelective(patentLawsuit);

        Results results = new Results();
        results.setResult(true);
        results.setMsg("新增"+i+"条数据");
        return results;
    }

    /**
     * 删除专利无效宣告数据
     * @param web
     * @return
     */
    @Override
    public Results del(WebPatentInvalidDeclareInfo web) {
        //删除专利库 进行关联删除其他表对应数据
        int i= patentMapper.deleteByPrimaryKey(web.getPid());

        Results results = new Results();
        results.setMsg("删除了"+i+"条数据");
        return  results;
    }

    /**
     * 更新专利无效宣言数据
     * @param web
     * @return
     */
    @Override
    public Results update(WebPatentInvalidDeclareInfo web) throws ParseException {
        //设置日期转换规则
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //设置专利库
        Patent patent = new Patent();
        patent.setId(web.getPid());//设置id
        patent.setTechnicalClassification(web.getTechnical_classification());//设置技术分类
        patent.setPatentname(web.getPatentName());//设置技术名称
        patent.setImage(web.getImage());//设置图示
        patent.setPatentProduct(web.getPatent_product());//专利产品
        patent.setApplyType(web.getApply_type());//申请类型
        patent.setProtectedAreas(web.getProtected_areas());//设置保护地域
        patent.setPatentType(web.getPatent_type());//设置专利类型
        if(!web.getApply_date().equals("")){
            patent.setApplyDate(sdf.parse(web.getApply_date()));//设置申请日
        }
        patent.setApplyName(web.getApply_name());//设置申请人

        if(!web.getAccredit_date().equals("")){
            patent.setAccreditDate(sdf.parse(web.getAccredit_date()));//设置授权公告日
        }
        patent.setPatentNumber(web.getPatent_number());//设置专利号



        //设置专利无效宣言库
        PatentInvalidDeclare patentInvalidDeclare = new PatentInvalidDeclare();
        patentInvalidDeclare.setId(web.getId());//设置专利无效宣言的ID
        patentInvalidDeclare.setPid(web.getPid());//设置pid
        patentInvalidDeclare.setInvalidOwer(web.getInvalid_ower());//设置提无效公司/人
        patentInvalidDeclare.setInvalidFiles(web.getInvalid_files());//设置无效申请/答辩文件
        patentInvalidDeclare.setResults(web.getResults());//设置裁定结果

        //更新专利库
        int i = patentMapper.updateByPrimaryKeySelective(patent);
        //更新专利无效宣言库
        int j = patentInvalidDeclareMapper.updateByPrimaryKeySelective(patentInvalidDeclare);
        //设置发送给页面数据结果
        Results results = new Results();
        results.setResult(true);
        results.setMsg("更新了"+i+"条数据");
        return results;
    }

    /**
     * 导出excel
     * @param request
     * @param response
     * @return
     */
    @Override
    public void export(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //创建工作簿
        HSSFWorkbook workbook = new HSSFWorkbook();
        //创建Sheet
        HSSFSheet sheet = workbook.createSheet();
        //设置图片列列宽
        sheet.setColumnWidth(2, 10 * 512);
        //设置表头
        String[] header = {"技术分类","专利名称","图示","专利产品","申请类型","保护地域","专利类型","申请日","申请人","授权公告日","专利号","提无效公司/人","裁定结果"};
        HSSFRow row0 = sheet.createRow(0);
        for(int i =0;i<header.length;i++){
            HSSFCell cell = row0.createCell(i);
            cell.setCellValue(header[i]);
        }

        //设置图片工具
        HSSFPatriarch drawingPatriarch = sheet.createDrawingPatriarch();

        //设置数据
        //获取数据源
        List<PatentInvalidDeclareInfo> lists = patentInvalidDeclareMapper.exportAll();
        for(int i=1;i<lists.size()+1;i++){
            HSSFRow row = sheet.createRow(i);

            for(int j=0;j<header.length;j++){
                HSSFCell cell = row.createCell(j);

                //设置技术分类
                if(j==0){
                    cell.setCellValue(lists.get(i-1).getTechnical_classification());
                }
                //设置专利名称
                if(j==1){
                    cell.setCellValue(lists.get(i-1).getPatentName());
                }
                //设置图示
                if(j==2){
                    //设置图片
                    if(lists.get(i-1).getImage()!=null){
                        String  filePath = request.getSession().getServletContext().getRealPath("/upload/images/"+lists.get(i-1).getImage());
                        System.out.println("图片路径："+filePath);
                        //设置图片来源
                        BufferedImage bufferedImage = ImageIO.read(new File(filePath));
                        //设置图片输出
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        //输入转换到输出
                        ImageIO.write(bufferedImage,"png",byteArrayOutputStream);

                        //设置图片存放位置
                        HSSFClientAnchor anchor = new HSSFClientAnchor(0,0,0,0,(short)j,i,(short)(j+1),(i+1));

                        //打开图片工具导入图片
                        drawingPatriarch.createPicture(anchor,workbook.addPicture(byteArrayOutputStream.toByteArray(), HSSFWorkbook.PICTURE_TYPE_PNG));
                    }

                }
                //设置专利产品
                if(j==3){
                    cell.setCellValue(lists.get(i-1).getPatent_product());
                }
                //设置申请类型
                if(j==4){
                    cell.setCellValue(lists.get(i-1).getApply_type());
                }
                //设置保护地域
                if(j==5){
                    cell.setCellValue(lists.get(i-1).getProtected_areas());
                }
                //设置专利类型
                if(j==6){
                    cell.setCellValue(lists.get(i-1).getPatent_type());
                }
                //设置申请日
                if(j==7){
                    if(lists.get(i-1).getApply_date()!=null){
                        cell.setCellValue(lists.get(i-1).getApply_date());
                    }
                }
                //设置申请人
                if(j==8){
                    cell.setCellValue(lists.get(i-1).getApply_name());
                }
                //设置授权公告日
                if(j==9){
                    if(lists.get(i-1).getAccredit_date()!=null){
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        System.out.println("ggr:"+sdf.format(lists.get(i-1).getAccredit_date()));
                        cell.setCellValue(sdf.format(lists.get(i-1).getAccredit_date()));
                    }
                }
                //设置专利号
                if(j==10){
                    cell.setCellValue(lists.get(i-1).getPatent_number());
                }
                //设置提无效公司/人
                if(j==11){
                    cell.setCellValue(lists.get(i-1).getInvalid_ower());
                }
                //设置无效申请/答辩文件
                //设置裁定结果
            }
        }











        //设置发送求头//设置发送文件附件名
        response.setHeader("Content-Disposition","attachment; filename=test.xls");


        ServletOutputStream os = response.getOutputStream();
        //输出
        workbook.write(os);
        //推送
        os.flush();
        //关闭
        os.close();

    }
}
