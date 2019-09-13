package com.chenghao.work.domain;

import lombok.Data;
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
public class Version {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 版本号
     */
    private String version;
    /**
     * 创建时间
     */
    private LocalDateTime gmt_create;
    /**
     * 修改时间
     */
    private LocalDateTime gmt_modified;
    public Version(){}
    /**
     * 两个参数的构造器
     * @param version 版本名称
     * @param gmt_create 创建时间
     */
    public Version(String version, LocalDateTime gmt_create){
        this.version=version;
        this.gmt_create=gmt_create;
    }


}
