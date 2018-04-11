package com.cskaoyan.service.impl;

import com.cskaoyan.bean.Room;
import com.cskaoyan.utils.RoomVO;
import com.cskaoyan.dao.RoomMapper;
import com.cskaoyan.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class RoomServiceImpl implements RoomService {


    @Autowired
    RoomMapper dao;


    //查找所有房间
    @Override
    public ArrayList<Room> findAllRoom(RoomVO vo) {


        return dao.findAllRoom(vo);
    }

    @Override
    public ArrayList<Room> findRoomByRoomNumber(RoomVO vo) {


        return dao.findRoomByRoomNumber(vo);
    }

    @Override
    public int insertSelective(Room record) {


        return dao.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Room record) {

        return dao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return dao.deleteByPrimaryKey(id);
    }

}
