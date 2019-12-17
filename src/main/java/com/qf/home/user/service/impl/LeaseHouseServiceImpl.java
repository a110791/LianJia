package com.qf.home.user.service.impl;

import com.qf.home.common.vo.R;
import com.qf.home.user.dao.LeaseHouseMapper;
import com.qf.home.user.entity.LeaseHouse;
import com.qf.home.user.service.LeaseHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;


@Service
public class LeaseHouseServiceImpl implements LeaseHouseService {

    @Autowired
    private LeaseHouseMapper leaseHouseMapper;
    //增
    @Override
    public R insert(LeaseHouse record) {
        leaseHouseMapper.insert(record);

        return R.Ok();
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> d = new HashMap<>();
        int[] b = new int[50];
        int c =0;
        int e = 7;
        for (int i = 0; i < 100; i++) {
            if (i%2 ==0){
                b[c]=i;
                c=c+1;
            }else {
                d.put(e,i);
                e=e+1;
            }
        }
        for (int i = 0; i < 50; i++) {
            System.out.println(b[i]);
        }

        System.out.println(d);

        LeaseHouseServiceImpl leaseHouseService = new LeaseHouseServiceImpl();
        System.out.println(leaseHouseService.add(5,8));

    }
    public int add(int a, int b) {
        int c = 0;
        if (a>b) {
            c=a;
            for (int i = b; i < a; i=i+2) {
                c=c+i;
            }
        }else {
            c = b;
            for (int i = a; i < b; i=i+2) {
                c = c + i;
            }
        }
        return c;
    }
    //删
    @Override
    public R delete(int id) {
        leaseHouseMapper.delete(id);
        return R.Ok();
    }
    //查
    @Override
    public R select(int userId) {
        List<LeaseHouse> select = leaseHouseMapper.select(userId);
        return R.Ok(select);
    }
}

