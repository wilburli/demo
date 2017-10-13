package com.inforun.dao;


import com.inforun.model.SystemLog;
public interface SystemLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SystemLog record);

    int insertSelective(SystemLog record);

    SystemLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SystemLog record);

    int updateByPrimaryKey(SystemLog record);
}