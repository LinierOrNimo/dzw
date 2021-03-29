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
@TableName("Outstation")
public class Outstation {
    @TableId(type= IdType.AUTO,value = "maintenanceid")
    private Integer maintenanceid;

    private String maintenancewe;

    private String phone;

    private Integer maintenanceofuser;

    private Date startdate;

    private Date dateclosed;

    private Integer towingservicei;

    private Date creationdate;

    private String modifiers;

    private Date modifiedate;

    private String founder;

    private Integer deletemark;

}