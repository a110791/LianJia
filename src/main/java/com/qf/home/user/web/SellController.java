package com.qf.home.user.web;


import com.qf.home.common.vo.R;
import com.qf.home.user.entity.SellHouse;
import com.qf.home.user.service.SellHouseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/sell")
@Api(value = "新房模块", tags = "新房模块")
public class SellController {

    @Autowired
    private SellHouseService sellHouseService;

    @PostMapping("/insertSellHouse")
    @ApiOperation(value = "发布房源", notes = "发布房源")
    public R insertSellHouse(SellHouse sellHouse) {
        return sellHouseService.insert(sellHouse);
    }

    @GetMapping("/selectSellHouse")
    @ApiOperation(value = "查看发布的房源", notes = "查看发布的房源")
    public R selectSellHouse(int userId) {
        return sellHouseService.select(userId);
    }

    @DeleteMapping("/deleteSellHouse")
    @ApiOperation(value = "删除发布的房源", notes = "删除发布的房源")
    public R deleteSellHouse(int id) {
        return sellHouseService.delete(id);
    }

}
