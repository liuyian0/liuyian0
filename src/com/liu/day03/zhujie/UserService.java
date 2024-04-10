package com.liu.day03.zhujie;

/*
需求：
模拟企业用户管理业务，包括用户登录，用户删除，用户查询功能，并统计每个功能耗时
 */
//定义用户业务接口，完成用户登录，删除，查询功能
public interface UserService {
    void login();
    void delete();
    void query();
}
