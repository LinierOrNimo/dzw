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
@TableName("Communication")
public class Communication {
    @TableId(type= IdType.AUTO,value = "cid")
    private Integer cid;

    private Integer eid;

    private String contactname;

    private String contactphone;

    private String creator;

    private Date creationtime;

    private String modifier;

    private Date modificationtime;

    private Integer delmark;

}