package com.dao;

import com.pojo.Node;
import com.pojo.NodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface NodeMapper {
    int countByExample(NodeExample example);

    int deleteByExample(NodeExample example);

    List<Node> selectByExample(NodeExample example);

    int updateByExampleSelective(@Param("record") Node record, @Param("example") NodeExample example);

    int updateByExample(@Param("record") Node record, @Param("example") NodeExample example);

    List<Node> selectByExampleAndPage(NodeExample example, RowBounds rowBound);

    int deleteByPrimaryKey(Long nodeId);

    int insert(Node record);

    int insertSelective(Node record);

    Node selectByPrimaryKey(Long nodeId);

    int updateByPrimaryKeySelective(Node record);

    int updateByPrimaryKey(Node record);
}