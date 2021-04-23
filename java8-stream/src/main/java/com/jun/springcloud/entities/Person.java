package com.jun.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author jun
 * @date 2021年04月23日 9:37
 */
@Data
@AllArgsConstructor
public class Person {
    private String name; // 姓名
    private int salary; // 薪资
    private int age; // 年龄
    private String sex; //性别
    private String area; // 地区

    public Person(String name, int salary, String sex, String area) {
        this.name = name;
        this.salary = salary;
        this.sex = sex;
        this.area = area;
    }
    // 省略了get和set，请自行添加

}
