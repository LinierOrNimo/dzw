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
@TableName("Maintanenceproject")
public class Maintanenceproject {
    @TableId(type= IdType.AUTO,value = "maintenanceitems")
    private Integer maintenanceitems;

    private Integer category;

    private Integer projectcategory;

    private String projectname;

    private String remarks;

    private Float repairstandardprice;

    private Float repairmemberprice;

    private Float repairvipprice;

    private Float repairprotocolprice;

    private Integer deletemark;

    private Date creationdate;

    private String founder;

    private Date modifiers;

    private String modifiedate;

}