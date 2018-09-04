package com.will.springboot.mapper;

import com.will.springboot.domain.City;

/**
 * ClassName:CityMapper
 * Description:
 *
 * @Author Will Wu
 * @Email willwu618@gmail.com
 * @Date 2018/9/4
 */
public interface CityMapper {
    /**
     * 根据城市名查找城市
     *
     * @param cityName
     * @return
     */
    City findByName(String cityName);
}
