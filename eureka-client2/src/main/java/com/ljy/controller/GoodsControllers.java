package com.ljy.controller;

import com.github.pagehelper.PageInfo;
import com.ljy.api.GoodsClient;
import com.ljy.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @类名: com.ljy.controller
 * @作者:
 * @创建时间: 2019-12-03 08:54
 * @描述:
 **/
@RestController
@EnableEurekaClient
@EnableFeignClients
public class GoodsControllers {

    @Autowired
    GoodsClient goodsClient;

    @RequestMapping("lists1")
    public PageInfo lists1(@RequestParam(defaultValue = "3") Integer pageNum) {
        PageInfo info = goodsClient.lists(pageNum);

        return info;
    }

    @RequestMapping("adds")
    public Goods adds(Goods goods) {
        Goods goods1 = goodsClient.adds(goods);

        return  goods1;
    }

    @RequestMapping("dels")
    public String dels(String id) {
        try {
            goodsClient.dels(id);
        } catch (Exception e) {
            return "error";
        }
        return "success";
    }

    @RequestMapping("getgood")
    public Goods getgood(String id) {
        Goods goods = goodsClient.getgood(id);
        return goods;
    }

    @RequestMapping("updates")
    public String updates(Goods goods) {
        try {
            goodsClient.updates(goods);
        } catch (Exception e) {
            return "error";
        }
        return "success";
    }
    @RequestMapping("getGoods12")
    public Goods getGoods12(Integer id) {
        Goods goods = goodsClient.getgoods1(id);
        return goods;
    }

}
