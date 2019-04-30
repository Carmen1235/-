package com.wqy.service.impl;

import com.wqy.dao.mapper.IdeaMapper;
import com.wqy.pojo.IdeaDO;
import com.wqy.service.MailService;
import com.wqy.util.JsonResult;
import com.wqy.vo.IdeaVO;
import com.wqy.vo.MailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @author
 * @Auther: 王秋叶
 * @Date: 2018/8/17 11:04
 * @Description: MailServiceImpl
 */
@Service
public class MailServiceImpl implements MailService {

    @Autowired
    private IdeaMapper ideaMapper;

    /**
     * 根据查询条件导出数据
     *
     * @param mailVO
     * @return
     */
    @Override
    public List<IdeaDO> export(MailVO mailVO) throws ParseException {
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
        return ideas;
    }

    @Override
    public void list(int page, int rows) {

    }

    @Override
    public void list(MailVO mailVO, int page, int rows) {

    }

    @Override
    public JsonResult add(MailVO mailVO) {
        return null;
    }

    @Override
    public void save(MailVO mailVO) {

    }

    @Override
    public void find() {

    }
}
