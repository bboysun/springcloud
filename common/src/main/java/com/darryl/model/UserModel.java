package com.darryl.model;

/**
 * @Auther: Darryl
 * @Description: 公共model bean
 * 如果想要在spring cloud中该bean能够被正常RPC调用，必须要有默认的构造函数
 * 不然会报错找不到服务提供者，
 * @Date: created in 2020/4/4 12:20
 */
public class UserModel {
    private String name;
    private int age;

    public UserModel(){
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
