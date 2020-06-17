package com.chryl.api;

import com.chryl.po.ChrGoods;

/**
 * Created by Chr.yl on 2020/6/17.
 *
 * @author Chr.yl
 */
public interface MyTestApi {

    public boolean save(ChrGoods chrGoods);


    public boolean delete(String goodsId);

    public Object query();

    public boolean update(ChrGoods chrGoods);

}
