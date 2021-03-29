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
@TableName("Cartype")
public class Cartype {
    @TableId(type= IdType.AUTO,value = "carmodelid")
    private Integer carmodelid;

    private Integer motorbrandid;

    private Integer carbrandid;

    private String carmodelname;

    private Float priceindication;

    private Integer deletemark;

    private Date creationdate;

    private String founder;

    private Date modifiedate;

    private String modifiers;

}