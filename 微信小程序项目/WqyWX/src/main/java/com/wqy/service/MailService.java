package com.wqy.service;

import com.wqy.pojo.IdeaDO;
import com.wqy.util.JsonResult;
import com.wqy.vo.IdeaVO;
import com.wqy.vo.MailVO;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

/**
 * @Auther: 王秋叶
 * @author: WangQiuYe
 * @Date: 2018/8/17 11:01
 * @Description: MailService
 */
@Service("mailService")
public interface MailService {

    /**
     * 根据查询条件导出数据
     *
     * @param mailVO
     * @return
     */
    List<IdeaDO> export(MailVO mailVO) throws ParseException;

    /**
     * 显示数据列表
     *
     * @param page
     * @param rows
     */
    void list(int page, int rows);

    /**
     * 显示数据列表
     *
     * @param mailVO
     * @param page
     * @param rows
     */
    void list(MailVO mailVO, int page, int rows);

    /**
     * 新增
     *
     * @param mailVO
     * @return
     */
    JsonResult add(MailVO mailVO);

    /**
     * 更新
     *
     * @param mailVO
     */
    void save(MailVO mailVO);

    /**
     * 查询
     */
    void find();
}
