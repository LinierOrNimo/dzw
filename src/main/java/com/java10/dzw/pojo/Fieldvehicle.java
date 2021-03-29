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
@TableName("Fieldvehicle")
public class Fieldvehicle {
    @TableId(type= IdType.AUTO,value = "fid")
    private Integer fid;

    private Integer shid;

    private String platenumber;

    private String brand;

    private String model;

    private Integer currentmileage;

    private String vehiclecondition;

    private String creator;

    private Date creationtime;

    private String modifier;

    private Date modificationtime;

    private Integer delmark;

}