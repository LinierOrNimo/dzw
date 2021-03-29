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
@TableName("Employee")
public class Employee {
    @TableId(type= IdType.AUTO,value = "eid")
    private Integer eid;

    private Integer did;

    private Integer pid;

    private Integer shiftid;

    private String ename;

    private String sex;

    private String store;

    private String username;

    private String password;

    private String phone;

    private String address;

    private String idnumber;

    private Float height;

    private Integer leave;

    private String creator;

    private Date creationtime;

    private String modifier;

    private Date modificationtime;

    private Integer delmark;

}