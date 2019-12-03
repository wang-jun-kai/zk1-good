package com.ljy.api;

import com.github.pagehelper.PageInfo;
import com.ljy.entity.Goods;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @类名: com.ljy.api
 * @作者:
 * @创建时间: 2019-12-03 08:58
 * @描述:
 **/
@FeignClient(name = "EUREKA-CLIENT1")
public interface GoodsClient {

    @RequestMapping("lists")
    public PageInfo lists(Integer pageNum);

    @RequestMapping("adds")
    public Goods adds(Goods goods);

    @RequestMapping("dels")
    public String dels(String id);

    @RequestMapping("getgood")
    public Goods getgood(String id);

    @RequestMapping("updates")
    public String updates(Goods goods);

    @RequestMapping("getgoods12")
    public Goods getgoods12(Integer id);

}
