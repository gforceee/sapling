package com.gforce.route.sapling.designPattern.iterator;

import lombok.Data;

/**
 * @author tianyuan14
 * @create 2019/11/3 9:01 PM
 */
@Data
public class Student {
    private String name;
    private Integer number;

    public Student(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public void count() {
        System.out.println(String.format("我是 %d 号 %s", this.number, this.name));
    }
}
