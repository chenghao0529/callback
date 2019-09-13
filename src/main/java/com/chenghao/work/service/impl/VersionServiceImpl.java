package com.chenghao.work.service.impl;

import com.chenghao.work.callback.VersionCallback;
import com.chenghao.work.service.VersionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author chenghao
 * @date 2019/9/13
 */
@Service
@Slf4j
public class VersionServiceImpl implements VersionService {
    @Resource
    public ApplicationContext applicationContext;

    @Override
    public Integer countVersion(String version){
        Map<String, VersionCallback> beansOfType = applicationContext.getBeansOfType(VersionCallback.class);
        Integer count=0;
        if(!CollectionUtils.isEmpty(beansOfType)){
            for(String key:beansOfType.keySet()){
                VersionCallback versionCallback = beansOfType.get(key);
                Integer integer = versionCallback.countVersion(version);
                count+=integer;
            }
        }
        log.info("version sum={}",count);
        return count;
    }
}
