package com.java10.dzw.action.nimo;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.java10.dzw.biz.nimo.VipBiz;
import com.java10.dzw.pojo.Car;
import com.java10.dzw.pojo.Vip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: dzw
 * @description:
 * @author: Nimo
 * @create: 2021-03-25 22:45
 **/
@RestController
@RequestMapping("nimo/api/Vip")
public class VipAction {
    @Autowired
    VipBiz vipBiz;

    /**
     * 分页所有查询
     * @param pages
     * @return
     */
    @GetMapping("seekAll/{pages}")
    public  PageInfo<Vip> seek(@PathVariable int pages){
        System.out.println(pages);
        QueryWrapper war = new QueryWrapper();
        war.eq("deletemark",1);
        PageHelper.startPage(pages,10);
        return new PageInfo<Vip>(vipBiz.list(war));
    }

    @GetMapping("del/{id}")
    public boolean del(@PathVariable int id){
        return vipBiz.det(id);
    }

    @PostMapping("insert")
    public int insert(@RequestBody Vip vip){
        vip.setDeletemark(1);
        if(vipBiz.save(vip)){
            return vipBiz.seekID();
        }
        return 0;
    }
}