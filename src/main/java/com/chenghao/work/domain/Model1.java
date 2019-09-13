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
public class Model1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 模块名称
     */
    private String name;
    /**
     * 版本号
     */
    private String model1Version;
    /**
     * 创建时间
     */
    private LocalDateTime gmt_create;
    /**
     * 修改时间
     */
    private LocalDateTime gmt_modified;
    public Model1(){}

    /**
     * 三个参数的构造器
     * @param name 模块1名称
     * @param model1Version 模块1版本
     * @param gmt_create 创建时间
     */
    public Model1(String name,String model1Version, LocalDateTime gmt_create){
        this.name=name;
        this.model1Version=model1Version;
        this.gmt_create=gmt_create;
    }
}
