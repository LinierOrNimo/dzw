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
@TableName("Carbrand")
public class Carbrand {
    @TableId(type= IdType.AUTO,value = "carbrandid")
    private Integer carbrandid;

    private String carbrandname;

    private String carbrandinitial;

    private Integer deletemark;

    private Date creationdate;

    private String founder;

    private Date modifiedate;

    private String modifiers;

}