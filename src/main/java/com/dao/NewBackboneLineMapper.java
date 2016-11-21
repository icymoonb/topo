package com.dao;

import com.pojo.NewBackboneLine;
import com.pojo.NewBackboneLineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface NewBackboneLineMapper {
    int countByExample(NewBackboneLineExample example);

    int deleteByExample(NewBackboneLineExample example);

    List<NewBackboneLine> selectByExample(NewBackboneLineExample example);

    int updateByExampleSelective(@Param("record") NewBackboneLine record, @Param("example") NewBackboneLineExample example);

    int updateByExample(@Param("record") NewBackboneLine record, @Param("example") NewBackboneLineExample example);

    List<NewBackboneLine> selectByExampleAndPage(NewBackboneLineExample example, RowBounds rowBound);

    int insert(NewBackboneLine record);

    int insertSelective(NewBackboneLine record);
}