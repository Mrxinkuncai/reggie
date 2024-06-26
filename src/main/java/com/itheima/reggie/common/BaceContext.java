package com.itheima.reggie.common;

/**
 * 基于threadLocal封装的工具类，用于保存和获取当前用户的id
 */
public class BaceContext {
    private static ThreadLocal<Long> threadLocal=new ThreadLocal<>();

    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }
    public static Long getCurrentId(){
        return threadLocal.get();
    }
}
