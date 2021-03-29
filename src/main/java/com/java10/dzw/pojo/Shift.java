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
@TableName("Shift ")
public class Shift {
    @TableId(type= IdType.AUTO,value = "shid")
    private Integer shid;

    private String shname;

    private String creator;

    private Date creationtime;

    private String modifier;

    private Date modificationtime;

    private Integer delmark;


}