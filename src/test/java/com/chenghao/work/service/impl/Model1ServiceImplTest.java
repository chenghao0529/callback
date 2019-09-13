package com.chenghao.work.service.impl;

import com.chenghao.work.domain.Model1;
import com.chenghao.work.repository.Model1Dao;
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
public class Model1ServiceImplTest {
    @Resource
    private Model1Dao model1Dao;
    @Test
    public void save(){
        Model1 model1 = new Model1("模块1.0", "1.0.0", LocalDateTime.now());
        Model1 model2 =new Model1("模块1.1", "1.0.0", LocalDateTime.now());
        Model1 model3 =new Model1("模块1.2", "1.0.1", LocalDateTime.now());
        Model1 model4 =new Model1("模块1.3", "1.0.1", LocalDateTime.now());
        Model1 model5 =new Model1("模块1.4", "1.0.1", LocalDateTime.now());
        List<Model1> model1s = Arrays.asList(model1, model2, model3, model4, model5);
        model1Dao.saveAll(model1s);
    }
}