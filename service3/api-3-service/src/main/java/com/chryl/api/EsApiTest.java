package com.chryl.api;

import com.chryl.po.ChrUser;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by Chr.yl on 2020/6/19.
 *
 * @author Chr.yl
 */
public interface EsApiTest {

    int importAll2Es();

//    Page<ChrUser> findByUserName(String name, Integer page, Integer limit);
    List<ChrUser> findByUserName(String name, Integer page, Integer limit);

}
