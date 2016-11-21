package com.dao;

import com.pojo.BridgeStpPort;
import com.pojo.BridgeStpPortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BridgeStpPortMapper {
    int countByExample(BridgeStpPortExample example);

    int deleteByExample(BridgeStpPortExample example);

    List<BridgeStpPort> selectByExample(BridgeStpPortExample example);

    int updateByExampleSelective(@Param("record") BridgeStpPort record, @Param("example") BridgeStpPortExample example);

    int updateByExample(@Param("record") BridgeStpPort record, @Param("example") BridgeStpPortExample example);

    List<BridgeStpPort> selectByExampleAndPage(BridgeStpPortExample example, RowBounds rowBound);

    int insert(BridgeStpPort record);

    int insertSelective(BridgeStpPort record);
}