package com.cskaoyan.service;


import com.cskaoyan.bean.Passenger;

import java.util.ArrayList;

public interface RegisterService {


    int deleteByPrimaryKey(Integer id);

    int insert(Passenger record);

    int insertSelective(Passenger record);

    Passenger selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Passenger record);

    int updateByPrimaryKey(Passenger record);

    ArrayList<Passenger> findAllPassenger();

    ArrayList<Passenger> findPassengerByName(String txtname);

}
