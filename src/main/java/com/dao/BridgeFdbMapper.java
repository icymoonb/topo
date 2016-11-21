package com.dao;

import com.pojo.BridgeFdb;
import com.pojo.BridgeFdbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BridgeFdbMapper {
    int countByExample(BridgeFdbExample example);

    int deleteByExample(BridgeFdbExample example);

    List<BridgeFdb> selectByExample(BridgeFdbExample example);

    int updateByExampleSelective(@Param("record") BridgeFdb record, @Param("example") BridgeFdbExample example);

    int updateByExample(@Param("record") BridgeFdb record, @Param("example") BridgeFdbExample example);

    List<BridgeFdb> selectByExampleAndPage(BridgeFdbExample example, RowBounds rowBound);

    int insert(BridgeFdb record);

    int insertSelective(BridgeFdb record);
}