package com.wqy.hr.core.service.impl;

import com.wqy.hr.core.dao.primary.JobDao;
import com.wqy.hr.core.entity.primary.Job;
import com.wqy.hr.core.service.inf.IJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 王秋叶
 * @create 2019-02-19 16:29
 * @desc
 **/
@Service
public class JobImpl implements IJob {

    @Autowired
    private JobDao jobDao;

    @Override
    public Job getOne(String jobId) {
        return jobDao.getByJobId(jobId);
    }
}
