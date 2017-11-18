package com.nepxion.aquarius.limit.delegate;

/**
 * <p>Title: Nepxion Aquarius</p>
 * <p>Description: Nepxion Aquarius</p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @email 1394997@qq.com
 * @version 1.0
 */

import org.aopalliance.intercept.MethodInvocation;

public interface LimitDelegate {
    // 初始锁上下文
    void initialize();

    // 销毁锁上下文
    void destroy();

    // 方法调用
    Object invoke(MethodInvocation invocation, String key, int limitPeriod, int limitCount) throws Throwable;
}