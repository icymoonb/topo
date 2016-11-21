package com.dao;

import com.pojo.BridgePortTable;
import com.pojo.BridgePortTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BridgePortTableMapper {
    int countByExample(BridgePortTableExample example);

    int deleteByExample(BridgePortTableExample example);

    List<BridgePortTable> selectByExample(BridgePortTableExample example);

    int updateByExampleSelective(@Param("record") BridgePortTable record, @Param("example") BridgePortTableExample example);

    int updateByExample(@Param("record") BridgePortTable record, @Param("example") BridgePortTableExample example);

    List<BridgePortTable> selectByExampleAndPage(BridgePortTableExample example, RowBounds rowBound);

    int insert(BridgePortTable record);

    int insertSelective(BridgePortTable record);
}