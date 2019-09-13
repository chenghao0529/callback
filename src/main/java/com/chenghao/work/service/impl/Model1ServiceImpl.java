package com.chenghao.work.service.impl;

import com.chenghao.work.repository.Model1Dao;
import com.chenghao.work.service.Model1Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author chenghao
 * @date 2019/9/13
 */
@Service
@Slf4j
public class Model1ServiceImpl implements Model1Service {
    @Resource
    private Model1Dao model1Dao;

    @Override
    public Integer countVersion(String version) {
        Integer model1Version = model1Dao.countByModel1Version(version);
        log.info("model1 number={}",model1Version);
        return model1Version;
    }
}
