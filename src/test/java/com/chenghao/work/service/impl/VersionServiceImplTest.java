package com.chenghao.work.service.impl;

import com.chenghao.work.domain.Version;
import com.chenghao.work.repository.VersionDao;
import com.chenghao.work.service.VersionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VersionServiceImplTest {
    @Resource
    private VersionService versionService;
    @Resource
    private VersionDao versionDao;

    @Test
    public void save(){
        Version version1 = new Version("1.0.0", LocalDateTime.now());
        Version version2 = new Version("1.0.1", LocalDateTime.now());
        List<Version> versions = Arrays.asList(version1, version2);
        versionDao.saveAll(versions);
    }

    @Test
    public void countVersion() {

        Integer integer = versionService.countVersion("1.0.0");
        System.out.println(integer);
    }
}