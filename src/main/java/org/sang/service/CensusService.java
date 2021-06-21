package org.sang.service;


import org.sang.bean.Census;
import org.sang.mapper.CensusMapper;
import org.sang.mapper.ComLikesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by albert on 2019/12/19.
 */
@Service
@Transactional
public class CensusService {
    @Autowired(required = false)
    CensusMapper censusMapper;

    public List<Census> getAll() {
        return censusMapper.getAllCensus();
    }

}
