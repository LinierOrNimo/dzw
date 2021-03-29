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
@TableName(" Pay")
public class Pay {
    @TableId(type= IdType.AUTO,value = "payid")
    private Integer payid;

    private Integer payvip;

    private Double paymoney;

    private Integer paytype;

    private Double paybalance;

    private Date creationdate;

    private String founder;

    private String modifiers;

    private Date modifiedate;

    private Integer deletemark;

}