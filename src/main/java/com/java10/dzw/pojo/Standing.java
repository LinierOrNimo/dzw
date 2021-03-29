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
@TableName("Standing")
public class Standing {
    @TableId(type= IdType.AUTO,value = "standingid")
    private Integer standingid;

    private Integer standinga;

    private Integer outside;

    private Date creationdate;

    private String modifiers;

    private Date modifiedate;

    private String founder;

    private Integer deletemark;


}