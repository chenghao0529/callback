package com.chenghao.work.repository;

import com.chenghao.work.domain.Version;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author chenghao
 * @date 2019/9/13
 */
@Repository
public interface VersionDao extends JpaRepository<Version,Long> {
}
