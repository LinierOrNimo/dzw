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
@TableName("Artificer")
public class Artificer {
    @TableId(type= IdType.AUTO,value = "aid")
    private Integer aid;

    private Integer sid;

    private Integer shid;

    private String aname;

    private String sex;

    private Integer leader;

    private String phone;

    private Date birthday;

    private String address;

    private String idnumber;

    private String username;

    private String password;

    private String creator;

    private Date creationtime;

    private String modifier;

    private Date modificationtime;

    private Integer delmark;

}