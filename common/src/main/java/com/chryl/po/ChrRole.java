package com.chryl.po;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Chr.yl on 2020/6/7.
 *
 * @author Chr.yl
 */
@Data
public class ChrRole implements Serializable {
    private static final long serialVersionUID = 1637772700686061620L;

    private Integer id;

    private String name;

    private String code;

    private String desc;

    private String isUse;
}
