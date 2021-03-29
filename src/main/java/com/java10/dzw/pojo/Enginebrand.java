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
@TableName("Enginebrand")
public class Enginebrand {
    @TableId(type= IdType.AUTO,value = "motorbrandid")
    private Integer motorbrandid;

    private String motorbrandname;

    private Integer deletemark;

    private Date creationdate;

    private String founder;

    private Date modifiedate;

    private String modifiers;

}