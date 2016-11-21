package com.dao;

import com.pojo.Link;
import com.pojo.LinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface LinkMapper {
    int countByExample(LinkExample example);

    int deleteByExample(LinkExample example);

    List<Link> selectByExample(LinkExample example);

    int updateByExampleSelective(@Param("record") Link record, @Param("example") LinkExample example);

    int updateByExample(@Param("record") Link record, @Param("example") LinkExample example);

    List<Link> selectByExampleAndPage(LinkExample example, RowBounds rowBound);

    int insert(Link record);

    int insertSelective(Link record);
}