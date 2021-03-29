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
@TableName("Supply")
public class Supply {
    @TableId(type= IdType.AUTO,value = "supplyid")
    private Integer supplyid;

    private Integer cityid;

    private String manufacturername;

    private String manufactureraddress;

    private String webaddress;

    private String companytelephone;

    private String contacts;

    private String contactsphone;

    private String city;

    private String supplyremarks;

    private Integer deletemark;

    private Date creationdate;

    private String founder;

    private Date modifiedate;

    private String modifiers;


}