package com.will.springboot.service.impl;

import com.will.springboot.domain.City;
import com.will.springboot.mapper.CityMapper;
import com.will.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * ClassName:CityServiceImpl
 * Description:城市业务逻辑实现类
 *
 * @Author Will Wu
 * @Email willwu618@gmail.com
 * @Date 2018/9/4
 */
@Service
public class CityServiceImpl implements CityService {
    @Autowired
    public CityMapper cityMapper;

    @Override
    public City findCityByName(String cityName) {
        if (!StringUtils.isEmpty(cityName)) {
            return cityMapper.findByName(cityName);
        }
        return null;
    }
}
