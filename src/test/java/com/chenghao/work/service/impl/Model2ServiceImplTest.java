package com.chenghao.work.service.impl;

import com.chenghao.work.domain.Model2;
import com.chenghao.work.repository.Model2Dao;
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
public class Model2ServiceImplTest {
    @Resource
    private Model2Dao Model2Dao;
    @Test
    public void save(){
        Model2 Model1 = new Model2("模块2.5", "1.0.0", LocalDateTime.now());
        Model2 model2 =new Model2("模块2.6", "1.0.0", LocalDateTime.now());
        Model2 model3 =new Model2("模块2.7", "1.0.1", LocalDateTime.now());
        List<Model2> Model2s = Arrays.asList(Model1, model2, model3);
        Model2Dao.saveAll(Model2s);
    }
}