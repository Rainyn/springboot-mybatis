package com.springboot.springbootmybatis.service.impl;

import com.springboot.springbootmybatis.dao.CityDao;
import com.springboot.springbootmybatis.domain.City;
import com.springboot.springbootmybatis.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService{

    @Autowired
    private CityDao cityDao;

    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }
}
