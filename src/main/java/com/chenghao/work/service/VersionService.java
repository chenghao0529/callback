package com.chenghao.work.service;

/**
 * @author chenghao
 * @date 2019/9/13
 */
public interface VersionService {
    /**
     * 统计引用该版本号的总个数
     * @param version 版本号
     * @return 该版本号总数
     */
    Integer countVersion(String version);
}
