package com.liu.day03.zhujie;

public class UserAdminTest {
    public static void main(String[] args) {
        UserService us = new UserServiceImpl();
        us.login();
        us.delete();
        us.query();
    }
}
