package com.qf.home.user.service;

import com.qf.home.common.vo.R;
import com.qf.home.user.entity.LeaseHouse;

import java.util.List;

public interface LeaseHouseService {

    R insert(LeaseHouse record);

    R delete(int id);

    R select(int userId);
}
