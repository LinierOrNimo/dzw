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
@TableName("Goods")
public class Goods {
    @TableId(type= IdType.AUTO,value = "goodsid")
    private Integer goodsid;

    private String supplyid;

    private Integer statusid;

    private String facadeid;

    private Integer unitid;

    private Integer commodityid;

    private String goodsname;

    private String brandname;

    private Integer weight;

    private String goodspicture;

    private Float purchaseprice;

    private Float goodsstandardprice;

    private Float goodsvipprice;

    private Float goodsagreementprice;

    private Integer deletemark;

    private Date creationdate;

    private String founder;

    private Date modifiedate;

    private String modifiers;

}