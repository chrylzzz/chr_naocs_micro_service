package com.chryl.repository;

import com.chryl.po.ChrUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * 商品ES操作类
 * 继承ElasticsearchRepository接口，这样就拥有了一些基本的Elasticsearch数据操作方法，同时定义了一个衍生查询方法。
 * Created by Chr.yl on 2018/6/19.
 */
//                                                                  1:javaBean;2:idType
public interface EsProductRepository extends ElasticsearchRepository<ChrUser, Integer> {

    /**
     * 搜索查询:
     *
     * @param username
     * @param page     分页信息
     * @return
     */
//    Page<EsProduct> findByNameOrSubTitleOrKeywords(String name, String subTitle, String keywords, Pageable page);
    List<ChrUser> findByUsername(String username, Pageable page);
    //注意这里使用Page 接收的话会出现序列化出错,导致dubbo的序列化无法进行,使dubbo默认访问三次都失败,错误内容放在本包的error.txt里


    /**
     * 需要注意的是 ,实体类中有 LocalDate,LocalDateTime类型报错,Date 日期暂未测试是否报错
     */
//    "org.springframework.data.elasticsearch.ElasticsearchException: failed to map source ,org.springframework.data.elasticsearch.core.AbstractResultMapper.mapEntity(AbstractResultMapper.java:43)\n\t... 47 more\n",
    //es无法将返回的数据转化为符合规范的entity(返回类对象)

}
