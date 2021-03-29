package com.java10.dzw.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("Vip")
public class Vip {
    @TableId(type= IdType.AUTO,value = "id")
    private Integer id;

    private String account;

    private String pwd;

    private String name;

    @TableField("isVip")
    private String isVip;

    private String remarkes;

    private Date brithday;

    private String phone;

    private String sex;

    private String address;

    private String integral;

    private Double discount;

    private Integer viplv;

    private Double balance;

    private Date creationdate;

    private String founder;

    private Date modifieddate;

    private String modifiers;

    private Integer deletemark;

}