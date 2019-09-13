package com.chenghao.work.repository;

import com.chenghao.work.domain.Model2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author chenghao
 * @date 2019/9/13
 */
@Repository
public interface Model2Dao extends JpaRepository<Model2,Long> {
    /**
     *  该引用该版本号资源的个数
     *  @param version 版本号名称
     *  @return 该引用该版本号资源的个数
     */
    Integer countByModel2Version(String version);
}
