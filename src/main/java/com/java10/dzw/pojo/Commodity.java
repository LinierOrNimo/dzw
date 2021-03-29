package com.java10.dzw.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

@TableName("Commodity")
public class Commodity {
    @TableId(type= IdType.AUTO,value = "goodsid")
    private Integer goodsid;

    private String productname;

    private Integer goodsprice;

    private Date creationdate;

    private Date modifiers;

    private Integer modifiedate;

    private Integer founder;

    private Integer modified;

}