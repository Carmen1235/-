package com.wqy.service;

import com.wqy.model.easyui.EasyUIDataGrid;
import com.wqy.model.WebZLXZ;
import com.wqy.util.Results;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface PatentRenewalsService {
    public Map selectList(EasyUIDataGrid easyUIgDataGrid);
    public Results add(WebZLXZ webZLXZ);
    public Results del(String ids);
    public Results select(WebZLXZ webZLXZ);
}
