package com.chryl.controller;

import com.chryl.api.MyTestApi;
import com.chryl.po.ChrGoods;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Chr.yl on 2020/6/17.
 *
 * @author Chr.yl
 */
@RestController
@RequestMapping("mytest")
public class MyTestController {

    @Reference
    MyTestApi myTestApi;

    //insert
    @PostMapping("/insert")
    public Object save(ChrGoods chrGoods) {
        boolean save = myTestApi.save(chrGoods);
        return save;
    }

    //delete
    @PostMapping("/delete")
    public boolean delete(String goodsId) {
        boolean delete = myTestApi.delete(goodsId);
        return delete;
    }

    //query
    @PostMapping("/query")
    public Object query() {
        return myTestApi.query();
    }
    //replace

    @PostMapping("/update")
    public boolean show(ChrGoods chrGoods) {
        return myTestApi.update(chrGoods);
    }

}
