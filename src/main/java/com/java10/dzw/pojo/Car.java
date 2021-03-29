package com.java10.dzw.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("Car")
public class Car implements Serializable {
    @TableId(type= IdType.AUTO,value = "carid")
    private Integer carid;

    private String carplate;

    @TableField("paycarTime")
    private Date paycarTime;

    private Double kilometer;

    private Integer carbrand;

    private Integer cartype;

    private Integer servicenumber;

    private Integer vipid;

    private String founder;

    private Date creationdate;

    private String modifiers;

    private Date modifieddate;

    private Integer deletemark;

}