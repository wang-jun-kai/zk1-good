package com.ljy.service;

import com.ljy.entity.Goods;
import com.ljy.entity.GoodsExample;
import com.ljy.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @类名: com.ljy.service
 * @作者:
 * @创建时间: 2019-12-03 10:10
 * @描述:
 **/
@Service
public class GoodsService {

    @Autowired
    GoodsMapper goodsMapper;


    public List<Goods> lists(@RequestParam("names") String names) {
        GoodsExample goodsExample=new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        if(!names.isEmpty()){
            criteria.andNameLike(names);
        }
        List<Goods> goodsList = goodsMapper.selectByExample(goodsExample);
        return goodsList;
    }
}
