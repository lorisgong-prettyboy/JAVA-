package com.atguigu.springboot.bean;

public class Dog {
    private String Name;
    private Integer age;

    @Override
    public String toString() {
        return "Dog{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
