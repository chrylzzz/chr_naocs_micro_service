package com.chryl.api.impl;

import com.chryl.api.MyTestApi;
import com.chryl.mapper.GoodsMapper;
import com.chryl.po.ChrGoods;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Chr.yl on 2020/6/17.
 *
 * @author Chr.yl
 */
@org.apache.dubbo.config.annotation.Service
public class MyTestImpl implements MyTestApi {

    @Autowired
    private GoodsMapper goodsMapper;

    //暴露实现类给dubbo
    public boolean save(ChrGoods chrGoods) {
        int i = goodsMapper.saveGoods(chrGoods);
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(String goodsId) {
        int i = goodsMapper.deleteGoods(goodsId);
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Override
    public Object query() {
        return goodsMapper.goodsList(null);
    }


    @Override
    public boolean update(ChrGoods chrGoods) {
        int i = goodsMapper.updateChrGoods(chrGoods);
        if (i == 1) {
            return true;
        }
        return false;
    }
}
