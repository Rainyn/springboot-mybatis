package com.springboot.springbootmybatis.controller;

import com.springboot.springbootmybatis.domain.City;
import com.springboot.springbootmybatis.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;
    //http://localhost:8080/api/city?cityName=%E6%9D%AD%E5%B7%9E
@RequestMapping(value = "api/city",method = RequestMethod.GET)
    public City findOneCity(String cityName){
        return cityService.findCityByName(cityName);
    }

}
