package com.chenghao.work.callback;

/**
 * @author chenghao
 * @date 2019/9/13
 */
public interface VersionCallback {
    /**
     * 回调接口，供引用了版本号的模块引用
     * @param version 版本名称
     * @return 该版本被使用的数量
     */
     Integer countVersion(String version);
}
