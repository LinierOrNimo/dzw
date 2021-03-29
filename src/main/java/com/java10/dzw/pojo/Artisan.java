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
@TableName("Artisan")
public class Artisan {
    @TableId(type= IdType.AUTO,value = "technicianid")
    private Integer technicianid;

    private String technicalnames;

    private Integer groupa;

    private Integer positioe;

    private Date creationdate;

    private String modifiers;

    private Date modifiedate;

    private String founder;

    private Integer deletemark;

}