package com.wqy.service;

import com.wqy.util.JsonResult;
import com.wqy.vo.IdeaVO;
import com.wqy.vo.MailVO;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Map;

/**
 * @author 王秋叶
 * @create 2018-08-08 10:00
 * @desc 意见/建议 Service
 **/
@Service("ideaService")
public interface IdeaService {

    /**
     * 显示数据列表
     * @param page
     * @param rows
     * @return
     */
    Map list(int page, int rows);

    /**
     * 显示数据列表
     * @param page
     * @param rows
     * @return
     */
    Map list(MailVO mailVO ,int page, int rows) throws ParseException;

    /**
     * 新增
     * @param ideaVO
     * @return
     */
    JsonResult add(IdeaVO ideaVO);

    /**
     * 更新
     * @param ideaVO
     */
    void save(IdeaVO ideaVO);

    /**
     * 查询
     */
    void find();


    /**
     * 根据昵称查询
     * @param nickName
     */
    int findByNickName(String nickName);

}
