package com.wqy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.wqy.dao.mapper.IdeaMapper;
import com.wqy.dao.mapper.WxinfoMapper;
import com.wqy.dao.mapper.WxtemplateMapper;
import com.wqy.dao.mapper.WxuserMapper;
import com.wqy.entity.*;
import com.wqy.pojo.IdeaDO;
import com.wqy.service.IdeaService;
import com.wqy.util.JsonResult;
import com.wqy.util.WeiXinUtil;
import com.wqy.vo.IdeaVO;
import com.wqy.vo.MailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author 王秋叶
 * @create 2018-08-08 10:01
 * @desc 意见/建议 ServiceImpl
 **/

@Service("ideaServiceImpl")
public class IdeaServiceImpl implements IdeaService {

    /**
     *
     */
    @Autowired
    private WxtemplateMapper wxtemplateMapper;

    /**
     *  注入意见/建议 Dao
     */
    @Autowired
    private IdeaMapper ideaMapper;
    /**
     * 注入微信公众号信息 Dao
     */
    @Autowired
    private WxinfoMapper wxinfoMapper;

    /**
     * 注入微信公众号用户信息 Dao
     */
    @Autowired
    private WxuserMapper wxuserMapper;

    /**
     * 网页端查询idea数据列表
     * @param page
     * @param rows
     */
    @Override
    public Map list(int page,int rows) {
        int pageNum = page;
        int pageSize = rows;
        //设置分页查询，一点要再查询的前面设置
        PageHelper.startPage(pageNum, pageSize);

        List<IdeaDO> ideas = ideaMapper.listEX(new IdeaDO());
        for(IdeaDO i : ideas){
            System.out.println("打印数据"+i);
        }
        //获取分页的数据
        PageInfo<IdeaDO> pageInfo = new PageInfo<>(ideas);
        Map map = new HashMap();
        //获取查询的总数据
        map.put("rows", ideas);
        //数据总数
        map.put("total", pageInfo.getTotal());
        return map;
    }

    /**
     * 网页端查询idea数据列表
     * @param page
     * @param rows
     */
    @Override
    public Map list(MailVO mailVO ,int page, int rows) throws ParseException {
        int pageNum = page;
        int pageSize = rows;
        //设置分页查询，一点要再查询的前面设置
        PageHelper.startPage(pageNum, pageSize);

        IdeaDO ideaDO = new IdeaDO();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        ideaDO.setSort(mailVO.getSort());
        ideaDO.setUserName(mailVO.getUsername());
        ideaDO.setDepartment(mailVO.getDepartment());

        if(mailVO.getCreateDateStart()!=null&mailVO.getCreateDateStart()!=""){
            ideaDO.setCreateDateStart(sdf.parse(mailVO.getCreateDateStart()));
        }
        if(mailVO.getCreateDateEnd()!=null&mailVO.getCreateDateEnd()!=""){
            ideaDO.setCreateDateEnd(sdf.parse(mailVO.getCreateDateEnd()));
        }

        List<IdeaDO> ideas = ideaMapper.listEX(ideaDO);

        for(IdeaDO i : ideas){
            System.out.println("打印数据"+i);
        }
        //获取分页的数据
        PageInfo<IdeaDO> pageInfo = new PageInfo<>(ideas);
        Map map = new HashMap();
        //获取查询的总数据
        map.put("rows", ideas);
        //数据总数
        map.put("total", pageInfo.getTotal());
        return map;
    }

    /**
     * 微信端接收新增idea数据
     * @param ideaVO
     * @return
     */
    @Override
    public JsonResult add(IdeaVO ideaVO) {
        List<IdeaDO> lists = ideaMapper.selectByNickName(ideaVO.getNickName());
        System.out.println("根据昵称查询数据数量： "+lists.size());
        if(lists.size()==-1){
            Idea idea = new Idea();
            //设置ID
            idea.settId(UUID.randomUUID().toString());
            //设置姓名
            idea.settUsername(ideaVO.getUserName());
            //设置微信昵称
            idea.settNickname(ideaVO.getNickName());
            //设置部门
            idea.settDepartment(ideaVO.getDepartment());
            //设置联系方式
            idea.settTelphone(ideaVO.getTelPhone());
            //设置建议，意见
            idea.settQuestion(ideaVO.getQuestion());
            //设置创建时间
            idea.settCreatedate(new Date());
            //设置类别
            idea.settSort(ideaVO.getSort());

            int i = ideaMapper.insertSelective(idea);
            JsonResult result = new JsonResult();
            result.setMsg("提交成功");
            result.setState(true);

            /**
             * 设置微信公众号发送模板消息
             * {{first.DATA}}
             * 反馈类型：{{keyword1.DATA}}
             * 反馈名称：{{keyword2.DATA}}
             * 反馈人姓名：{{keyword3.DATA}}
             * 反馈人手机号：{{keyword4.DATA}}
             * {{remark.DATA}}
             */
            Map map = new HashMap();
            //头
            Map first = new HashMap();
            first.put("value","反馈部门："+ideaVO.getDepartment());
            first.put("color","#FF1010");
            map.put("first",first);
            //分类 反馈类型
            Map sort = new HashMap();
            sort.put("value",ideaVO.getSort());
            sort.put("color","#0000FF");
            map.put("keyword1",sort);
            //姓名 反馈名称
            Map username = new HashMap();
            username.put("value","意见反馈");
            username.put("color","#0000FF");
            map.put("keyword2",username);
            //部门 反馈人姓名
            Map department = new HashMap();
            department.put("value",ideaVO.getUserName());
            department.put("color","#0000FF");
            map.put("keyword3",department);
            //联系方式 反馈人手机号
            Map telPhone = new HashMap();
            telPhone.put("value",ideaVO.getTelPhone());
            telPhone.put("color","#0000FF");
            map.put("keyword4",telPhone);
            //反馈意见/建议

            //尾

            Map remark = new HashMap();
            remark.put("value","反馈意见："+ideaVO.getQuestion());
            remark.put("color","#FF1010");
            map.put("remark",remark);

            /**
             * 获取模板数据
             */
            Wxtemplate template1 = wxtemplateMapper.selectByPrimaryKey("template1");

            //发送模板消息
            List<Wxinfo> wxinfos = wxinfoMapper.selectByExample(new WxinfoExample());
            Wxinfo wxinfo = wxinfos.get(0);
            List<Wxuser> wxusers = wxuserMapper.selectByExample(new WxuserExample());
            for(Wxuser wxuser :wxusers){
                try {
                    WeiXinUtil.sendTemplateMessage(wxinfo.gettAccessToken(),wxuser.gettTouser(),template1.getTemplateId(),map);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


            return  result;
        }

        JsonResult result = new JsonResult();
        result.setMsg("已提交，请勿重复提交！");
        result.setState(false);
        return  result;
    }

    @Override
    public void save(IdeaVO ideaVO) {

    }

    @Override
    public void find() {

    }

    /**
     * 根据昵称查询 是否存在数据
     * @param nickName
     * @return
     */
    @Override
    public int findByNickName(String nickName) {
        List<IdeaDO> lists = ideaMapper.selectByNickName(nickName);
        System.out.println("根据昵称查询数据数量： "+lists.size());
        return lists.size();
    }
}
