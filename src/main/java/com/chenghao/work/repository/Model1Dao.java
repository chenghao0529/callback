package com.chenghao.work.repository;

import com.chenghao.work.domain.Model1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author chenghao
 * @date 2019/9/13
 */
@Repository
public interface Model1Dao extends JpaRepository<Model1,Long> {
    /**
     * 该引用该版本号资源的个数
     * @param version 版本号名称
     * @return 该引用该版本号资源的个数
     */
    Integer countByModel1Version(String version);
}
