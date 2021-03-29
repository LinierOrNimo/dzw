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
@TableName("Skilledstar")
public class Skilledstar {
    @TableId(type= IdType.AUTO,value = "sid")
    private Integer sid;

    private Integer star;

    private Integer manhours;

    private Double moeny;

    private String creator;

    private Date creationtime;

    private String modifier;

    private Date modificationtime;

    private Integer delmark;


}