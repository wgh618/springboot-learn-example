package com.will.springboot.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * ClassName:User
 * Description:
 *
 * @Author Will Wu
 * @Email willwu618@gmail.com
 * @Date 2018-01-03
 */
@Component
public class User {
    @Value("${user.id}")
    private long id;

    @Value("${user.age}")
    private int age;

    @Value("${user.high}")
    private int high;

    @Value("${user.desc}")
    private String desc;

    @Value("${user.uuid}")
    private String uuid;

    @Value("${user.number}")
    private String number;

    public long getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getHigh() {
        return high;
    }

    public String getDesc() {
        return desc;
    }

    public String getUuid() {
        return uuid;
    }

    public String getNumber() {
        return number;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", high=" + high +
                ", desc='" + desc + '\'' +
                ", uuid='" + uuid + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
