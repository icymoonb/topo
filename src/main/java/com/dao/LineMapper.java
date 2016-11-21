package com.dao;

import com.pojo.Line;
import com.pojo.LineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface LineMapper {
    int countByExample(LineExample example);

    int deleteByExample(LineExample example);

    List<Line> selectByExample(LineExample example);

    int updateByExampleSelective(@Param("record") Line record, @Param("example") LineExample example);

    int updateByExample(@Param("record") Line record, @Param("example") LineExample example);

    List<Line> selectByExampleAndPage(LineExample example, RowBounds rowBound);

    int deleteByPrimaryKey(Long lineId);

    int insert(Line record);

    int insertSelective(Line record);

    Line selectByPrimaryKey(Long lineId);

    int updateByPrimaryKeySelective(Line record);

    int updateByPrimaryKey(Line record);
}