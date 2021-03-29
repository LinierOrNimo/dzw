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
@TableName("Sethetable")
public class Sethetable {
    @TableId(type= IdType.AUTO,value = "collectionid")
    private Integer collectionid;

    private Integer technian;

    private Integer served;

    private Integer goodsi;

    private Integer totalprice;

    private Integer maintenid;

    private Integer settlement;

    private Integer standingw;

    private Date creationdate;

    private String modifiers;

    private Date modifiedate;

    private String founder;

    private Integer deletemark;

}