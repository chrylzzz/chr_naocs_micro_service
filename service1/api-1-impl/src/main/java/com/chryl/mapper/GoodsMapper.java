package com.chryl.mapper;

import com.chryl.po.ChrGoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by Chr.yl on 2020/6/10.
 *
 * @author Chr.yl
 */
public interface GoodsMapper {

    List<ChrGoods> getAllGoods();

    List<ChrGoods> goodsList(@Param("chrGoods") ChrGoods chrGoods);

    List<Map<String, String>> queryConditions2GoodsType();

    int saveGoods(@Param("chrGoods") ChrGoods chrGoods);

    int updateChrGoods(@Param("chrGoods") ChrGoods chrGoods);

    int changeGoodsStatus(@Param("chrGoods") ChrGoods chrGoods);

    int deleteGoods(@Param("goodsId") String goodsId);
}
