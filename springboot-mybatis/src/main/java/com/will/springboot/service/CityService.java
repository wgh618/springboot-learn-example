package com.will.springboot.service;

import com.will.springboot.domain.City;

/**
 * ClassName:CityService
 * Description:城市业务逻辑接口类
 *
 * @Author Will Wu
 * @Email willwu618@gmail.com
 * @Date 2018/9/4
 */
public interface CityService {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName
     * @return
     */
    City findCityByName(String cityName);
}
