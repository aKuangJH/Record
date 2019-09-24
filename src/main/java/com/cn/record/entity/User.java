package com.cn.record.entity;

import com.cn.record.entity.ext.People;

/**
 * @description:
 * @author: JiaHao.Kuang
 * @create: 2019-09-23 14:50
 **/
public class User implements People {

    private String username;
    private String status;

    public User(String username, String status) {
        this.username = username;
        this.status = status;
    }

    @Override
    public void toExcute() {
        System.out.println(this.username +" excute something");
    }

    @Override
    public void getStatus() {
        System.out.println(this.username +"'s status is " + this.status);
    }


}
