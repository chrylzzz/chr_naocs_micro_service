package com.chryl.api.impl;

import com.chryl.api.EsApiTest;
import com.chryl.mapper.UserMapper;
import com.chryl.po.ChrUser;
import com.chryl.repository.EsProductRepository;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Chr.yl on 2020/6/19.
 *
 * @author Chr.yl
 */
@Service(timeout = 6000)
public class ApiEsTestImpl implements EsApiTest {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private EsProductRepository userEsRepository;
//    @Autowired
//    private ElasticsearchTemplate elasticsearchTemplate;

    @Override
    public int importAll2Es() {
        List<ChrUser> userList = userMapper.getAllUsers();
        Iterable<ChrUser> chrUserIterable = userEsRepository.saveAll(userList);
        Iterator<ChrUser> iterator = chrUserIterable.iterator();
        int res = 0;
        while (iterator.hasNext()) {
            res++;
            iterator.next();
        }
        return res;
    }

    @Override
    public List<ChrUser> findByUserName(String name, Integer page, Integer limit) {
        Pageable pageable = PageRequest.of(page, limit);
        List<ChrUser> byUsername = userEsRepository.findByUsername(name, pageable);


        return byUsername;
    }

}
