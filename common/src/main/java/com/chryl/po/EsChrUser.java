package com.chryl.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * date类型的数据在es中比较繁琐,这里暂时略过date类型 , 暂不配置
 * Created by Chr.yl on 2020/6/7.
 *
 * @author Chr.yl
 */
@Data
@Document(indexName = "chr", type = "user", shards = 1, replicas = 0)
public class EsChrUser implements Serializable {

    private static final long serialVersionUID = -3804108461815405271L;

    @Id
    private Integer id;

    private Integer roleId;

    @Field(analyzer = "ik_max_word", type = FieldType.Text)//中文分词
    private String username;

    private String password;

//    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd")
//    private String birthday;
//    private LocalDate birthday;

    private Integer age;

    private Integer isUse;//是否使用

//    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd HH:mm:ss")
//    private String createTime;
//    private LocalDateTime createTime;

    private String avatar;//头像

    //-------------------------------
    //es 日志处理
//    @Field(type = FieldType.Date, format = DateFormat.custom,
//            pattern = "yyyy-MM-dd HH:mm:ss || yyyy-MM-dd || yyyy/MM/dd HH:mm:ss|| yyyy/MM/dd ||epoch_millis")//不行没有格式
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
//    private Date datetime; // 时间

//    DateFormat.custom：意思自定义属性格式；
//    pattern：时间格式，我们在java程序中可以传入这些格式的时间；
//    epoch_millis：也就是时间戳 示例1515150699465, 1515150699；
//    @JsonFormat：该注解中的时间格式为我们存入es索引库中的时间格式；
}
