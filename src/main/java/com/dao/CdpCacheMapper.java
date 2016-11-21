package com.dao;

import com.pojo.CdpCache;
import com.pojo.CdpCacheExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CdpCacheMapper {
    int countByExample(CdpCacheExample example);

    int deleteByExample(CdpCacheExample example);

    List<CdpCache> selectByExample(CdpCacheExample example);

    int updateByExampleSelective(@Param("record") CdpCache record, @Param("example") CdpCacheExample example);

    int updateByExample(@Param("record") CdpCache record, @Param("example") CdpCacheExample example);

    List<CdpCache> selectByExampleAndPage(CdpCacheExample example, RowBounds rowBound);

    int insert(CdpCache record);

    int insertSelective(CdpCache record);
}