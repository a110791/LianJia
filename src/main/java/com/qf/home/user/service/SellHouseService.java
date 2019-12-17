package com.qf.home.user.service;

import com.qf.home.common.vo.R;
import com.qf.home.user.entity.SellHouse;

public interface SellHouseService {

    R insert(SellHouse record);

    R delete(int id);

    R select(int userId);
}
