package com.will.springboot.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * ClassName:HomeProperties
 * Description:家乡属性
 *
 * @Author Will Wu
 * @Email willwu618@gmail.com
 * @Date 2018-01-03
 */
@Component
public class HomeProperties {
    /**
     * 省份
     */
    @Value("${home.province}")
    private String province;

    /**
     * 城市
     */
    @Value("${home.city}")
    private String city;

    /**
     * 描述
     */
    @Value("${home.desc}")
    private String desc;

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public String getDesc() {
        return desc;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "HomeProperties{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
