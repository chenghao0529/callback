package com.chenghao.work.service.impl;

import com.chenghao.work.repository.Model2Dao;
import com.chenghao.work.service.Model2Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author chenghao
 * @date 2019/9/13
 */
@Service
@Slf4j
public class Model2ServiceImpl implements Model2Service {
    @Resource
    private Model2Dao model2Dao;

    @Override
    public Integer countVersion(String version) {
        Integer model2Version = model2Dao.countByModel2Version(version);
        log.info("model2 number={}",model2Version);
        return model2Version;
    }
}
