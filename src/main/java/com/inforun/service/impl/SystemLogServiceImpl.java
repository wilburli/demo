package com.inforun.service.impl;

import com.inforun.dao.SystemLogMapper;
import com.inforun.model.SystemLog;
import com.inforun.service.SystemLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SystemLogServiceImpl implements SystemLogService {
    @Autowired
    SystemLogMapper systemLogDao;

    @Override
    public SystemLog byId(Integer id) {
        return systemLogDao.selectByPrimaryKey(Long.valueOf(id));
    }
}
