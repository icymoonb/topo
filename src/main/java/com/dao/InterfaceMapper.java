package com.dao;

import com.pojo.Interface;
import com.pojo.InterfaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface InterfaceMapper {
    int countByExample(InterfaceExample example);

    int deleteByExample(InterfaceExample example);

    List<Interface> selectByExample(InterfaceExample example);

    int updateByExampleSelective(@Param("record") Interface record, @Param("example") InterfaceExample example);

    int updateByExample(@Param("record") Interface record, @Param("example") InterfaceExample example);

    List<Interface> selectByExampleAndPage(InterfaceExample example, RowBounds rowBound);

    int deleteByPrimaryKey(Long ifId);

    int insert(Interface record);

    int insertSelective(Interface record);

    Interface selectByPrimaryKey(Long ifId);

    int updateByPrimaryKeySelective(Interface record);

    int updateByPrimaryKey(Interface record);
}