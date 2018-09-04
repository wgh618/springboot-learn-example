package com.will.springboot.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName:City
 * Description:
 *
 * @Author Will Wu
 * @Email willwu618@gmail.com
 * @Date 2018/9/4
 */
@Data
public class City implements Serializable {
    /**
     * 城市编号
     */
    private Long id;

    /**
     * 省份编号
     */
    private Long provinceId;

    /**
     * 城市名称
     */
    private String cityName;

    /**
     * 描述
     */
    private String description;
}
