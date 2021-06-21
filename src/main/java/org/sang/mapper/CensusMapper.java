package org.sang.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.sang.bean.Category;
import org.sang.bean.Census;

import java.util.List;

/**
 * Created by albert on 2019/12/19.
 */
@Mapper
public interface CensusMapper {
    List<Census> getAllCensus();
}
