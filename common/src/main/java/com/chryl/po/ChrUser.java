package com.chryl.po;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by Chr.yl on 2020/6/7.
 *
 * @author Chr.yl
 */
@Data
public class ChrUser implements Serializable {

    private static final long serialVersionUID = -3804108461815405271L;

    private Integer id;

    private Integer roleId;

    private String username;

    private String password;

    private LocalDate birthday;

    private Integer age;

    private Integer isUse;//是否使用

    private LocalDateTime createTime;

    private String avatar;//头像
}
