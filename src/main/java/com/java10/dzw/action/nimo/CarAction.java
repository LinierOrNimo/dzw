package com.java10.dzw.action.nimo;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.java10.dzw.biz.nimo.CarBiz;
import com.java10.dzw.biz.nimo.CarBrandBiz;
import com.java10.dzw.biz.nimo.CarTypeBiz;
import com.java10.dzw.pojo.Car;
import com.java10.dzw.pojo.Carbrand;
import com.java10.dzw.vo.AllCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: dzw
 * @description:
 * @author: Nimo
 * @create: 2021-03-26 09:10
 **/
@RestController
@RequestMapping("nimo/api/CarAtion")
public class CarAction{
    @Autowired
    CarBiz carBiz;

    @GetMapping("seekCar/{carID}/{UserID}")
    public List<AllCar> seek(@PathVariable int carID , @PathVariable int UserID){
        System.out.println(UserID);
        return carBiz.allCarList(carID,UserID);
    }

    @GetMapping("seekCar2/{carID}/{UserID}/{page}")
    public PageInfo<AllCar> seekAll(@PathVariable int carID , @PathVariable int UserID , @PathVariable int page){
        System.out.println(UserID);
        PageHelper.startPage(page,10);
        return new PageInfo<AllCar>(carBiz.allCarList(carID,UserID));
    }

    @PostMapping("insert")
    public boolean seek(@RequestBody Car car){
        car.setDeletemark(1);
        return carBiz.save(car);
    }

    @GetMapping("det/{id}")
    public boolean det(@PathVariable Integer id){
        return carBiz.detByID(id);
    }
}