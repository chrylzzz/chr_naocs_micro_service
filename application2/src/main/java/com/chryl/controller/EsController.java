package com.chryl.controller;

import com.chryl.api.EsApiTest;
import com.chryl.po.ChrUser;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Chr.yl on 2020/6/19.
 *
 * @author Chr.yl
 */
@RestController
@RequestMapping("/es")
public class EsController {

    @Reference(timeout = 6000)
    EsApiTest esApiTest;

    @PostMapping("/importAll")
    public int importAll2Es() {
        return esApiTest.importAll2Es();
    }

    @PostMapping("/queryByName")
    public List<ChrUser> queryByName(String name,
                                     @RequestParam(required = false, defaultValue = "0") Integer page,
                                     @RequestParam(required = false, defaultValue = "5") Integer limit) {
        return esApiTest.findByUserName(name, page, limit);
    }

}
