package com.ljy.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ljy.entity.Goods;
import com.ljy.entity.GoodsExample;
import com.ljy.mapper.GoodsMapper;
import com.ljy.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @类名: com.ljy.controller
 * @作者:
 * @创建时间: 2019-12-03 08:53
 * @描述:
 **/
@RestController
@CrossOrigin
public class GoodsController {

    @Autowired
    GoodsMapper goodsMapper;
    @Autowired
    GoodsService goodsService;


    @RequestMapping("list")
    public PageInfo<Goods> list(@RequestParam(defaultValue = "1") Integer pageNum,@RequestParam("names") String names) {
        int pageSize=3;
        PageHelper.startPage(pageNum,pageSize);

        GoodsExample goodsExample=new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
//        List<Goods> goodsList = goodsMapper.selectByExample(goodsExample);
        List<Goods> lists = goodsService.lists(names);

//        PageInfo<Goods> info=new PageInfo<>(goodsList);
        PageInfo<Goods> info=new PageInfo<>(lists);
        return info;
    }

    @RequestMapping("add")
    public String add(Goods goods) {
        try {
            goodsMapper.insertSelective(goods);
        } catch (Exception e) {
            return "error";
        }
        return "success";
    }

    @RequestMapping("del")
    public String del(String id) {
        try {
            goodsMapper.deleteByPrimaryKey(Integer.parseInt(id));
        } catch (NumberFormatException e) {
            return "error";
        }
        return "success";
    }

    @RequestMapping("getGoods")
    public Goods getGoods(String id) {
        Goods goods = goodsMapper.selectByPrimaryKey(Integer.parseInt(id));

        return goods;
    }

    @RequestMapping("update")
    public String update(Goods goods) {
        try {
            goodsMapper.updateByPrimaryKey(goods);
        } catch (Exception e) {
            return "error";
        }
        return "success";
    }

    @RequestMapping("getGoods1")
    public Goods getGoods1(Integer id) {
        Goods goods = goodsMapper.selectByPrimaryKey(id);
        return goods;
    }
}
