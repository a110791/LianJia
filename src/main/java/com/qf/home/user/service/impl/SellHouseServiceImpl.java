package com.qf.home.user.service.impl;

import com.qf.home.common.vo.R;
import com.qf.home.user.dao.SellHouseMapper;
import com.qf.home.user.entity.SellHouse;
import com.qf.home.user.service.SellHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SellHouseServiceImpl implements SellHouseService {

    @Autowired
    private SellHouseMapper sellHouseMapper;
    //增
    @Override
    public R insert(SellHouse record) {
        sellHouseMapper.insert(record);
        return R.Ok();
    }
    //删
    @Override
    public R delete(int id) {
        sellHouseMapper.delete(id);
        return R.Ok();
    }
    //查
    @Override
    public R select(int userId) {
        List<SellHouse> select = sellHouseMapper.select(userId);
        return R.Ok(select);
    }
}
