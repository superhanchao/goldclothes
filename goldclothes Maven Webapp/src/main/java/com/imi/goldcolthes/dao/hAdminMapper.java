package com.imi.goldcolthes.dao;

import com.imi.goldcolthes.entity.hAdmin;

public interface hAdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(hAdmin record);

    int insertSelective(hAdmin record);

    hAdmin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(hAdmin record);

    int updateByPrimaryKeyWithBLOBs(hAdmin record);

    int updateByPrimaryKey(hAdmin record);
}