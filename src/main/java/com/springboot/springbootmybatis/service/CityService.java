package com.springboot.springbootmybatis.service;

import com.springboot.springbootmybatis.domain.City;
import org.apache.ibatis.annotations.Param;

/**
 *城市业务逻辑接口
 */
public interface CityService {

    /**
     * 根据城市名查询城市信息
     * @param cityName
     * @return
     */
    City findCityByName(String cityName);

}
