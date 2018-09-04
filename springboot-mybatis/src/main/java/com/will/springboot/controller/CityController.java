package com.will.springboot.controller;

import com.will.springboot.domain.City;
import com.will.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:CityController
 * Description:
 *
 * @Author Will Wu
 * @Email willwu618@gmail.com
 * @Date 2018/9/4
 */
@RestController
public class CityController {
    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public City findOneCity(@RequestParam(value = "cityName") String cityName) {
        return cityService.findCityByName(cityName);
    }
}
