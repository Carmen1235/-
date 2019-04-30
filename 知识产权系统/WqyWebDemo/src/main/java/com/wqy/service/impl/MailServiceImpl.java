package com.wqy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wqy.dao.mapper.MailMapper;
import com.wqy.entity.Brand;
import com.wqy.entity.Mail;
import com.wqy.entity.MailExample;
import com.wqy.model.easyui.EasyUIDataGrid;
import com.wqy.model.WebMailInfo;
import com.wqy.service.MailService;
import com.wqy.util.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author WordK 王秋叶
 * @create 2018-07-04 15:23
 * @desc 邮件ServiceImpl
 **/
@Service
public class MailServiceImpl implements MailService{
    @Autowired
    private MailMapper mailMapper;

    /**
     * 查询邮件数据
     *
     * @return
     */
    @Override
    public Map list(EasyUIDataGrid easyUIgDataGrid) {
        //设置分页，一定要再查询之前
        PageHelper.startPage(easyUIgDataGrid.getPage(), easyUIgDataGrid.getRows());
        //查询数据
        List<Mail> mails = mailMapper.selectByExample(new MailExample());

        //设置查询分页数据 为了获取数据总数
        PageInfo<Brand> pageInfo = new PageInfo(mails);
        Map map = new HashMap();
        map.put("rows", mails);
        map.put("total", pageInfo.getTotal());

        return map;
    }

    /**
     * 修改邮件数据
     * @param web
     * @return
     * @throws ParseException
     */
    @Override
    public Results update(WebMailInfo web) throws ParseException {
        Mail mail = new Mail();

        mail.setId(web.getId());
        mail.setToMail(web.getToMail());
        mail.setFromMail(web.getFromMail());
        mail.setSubject(web.getSubject());
        mail.setContent(web.getContent());
        mail.setMailUser(web.getMailUser());
        mail.setMailPassword(web.getMailPassword());
        mail.setSmtpAddress(web.getSmtpAddress());

        mailMapper.updateByPrimaryKeySelective(mail);
        Results results = new Results();
        results.setMsg("更新了邮件设置");
        return results;
    }
}
