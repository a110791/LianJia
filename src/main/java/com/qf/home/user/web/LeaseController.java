package com.qf.home.user.web;


import com.qf.home.common.vo.R;
import com.qf.home.user.entity.LeaseHouse;
import com.qf.home.user.service.LeaseHouseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/lease")
@Api(value = "二手房功能", tags = "二手房功能")
public class LeaseController {

    @Autowired
    private LeaseHouseService leaseHouseService;

    @PostMapping("/insertLeaseHouse")
    @ApiOperation(value = "发布二手房源", notes = "发布二手房源")
    public R insertLeaseHouse(LeaseHouse leaseHouse) {
        return leaseHouseService.insert(leaseHouse);
    }

    @GetMapping("/selectOldHouse")
    @ApiOperation(value = "查看发布的二手房源", notes = "查看发布的二手房源")
    public R selectOldHouse(int userId) {
        return leaseHouseService.select(userId);
    }

    @DeleteMapping("/deleteLeaseHouse")
    @ApiOperation(value = "删除发布的二手房源", notes = "删除发布的二手房源")
    public R deleteLeaseHouse(int id) {
        return leaseHouseService.delete(id);
    }

}
