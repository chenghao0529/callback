package com.chenghao.work.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * @author chenghao
 * @date 2019/9/13
 */
@Entity
@Getter
@Setter
public class Model2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 版本号
     */
    private String model2Version;
    /**
     * 模块名称
     */
    private String name;
    /**
     * 创建时间
     */
    private LocalDateTime gmt_create;
    /**
     * 修改时间
     */
    private LocalDateTime gmt_modified;

    public Model2(){}

    /**
     * 三个参数的构造器
     * @param name 模块2名称
     * @param model1Version 模块2版本号
     * @param gmt_create 创建时间
     */
    public Model2(String name,String model1Version, LocalDateTime gmt_create){
        this.name=name;
        this.model2Version=model1Version;
        this.gmt_create=gmt_create;
    }
}
