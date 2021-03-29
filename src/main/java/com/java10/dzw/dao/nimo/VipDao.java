package com.java10.dzw.dao.nimo;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.java10.dzw.pojo.Vip;
import org.apache.ibatis.annotations.Select;

/**
 * @program: dzw
 * @description:
 * @author: Nimo
 * @create: 2021-03-25 22:47
 **/

public interface VipDao extends BaseMapper<Vip> {

    @Select("SELECT @@IDENTITY")
    public int seek();
}