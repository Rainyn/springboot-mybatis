package com.springboot.springbootmybatis.dao;
import org.apache.ibatis.annotations.Param;
import com.springboot.springbootmybatis.domain.City;

public interface CityDao {
    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);

    City findByName(@Param("cityName") String cityName);
}