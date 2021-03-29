package com.java10.dzw.biz.nimo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java10.dzw.dao.nimo.CarDao;
import com.java10.dzw.pojo.Car;
import com.java10.dzw.pojo.Carbrand;
import com.java10.dzw.pojo.Cartype;
import com.java10.dzw.pojo.Vip;
import com.java10.dzw.vo.AllCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: dzw
 * @description:
 * @author: Nimo
 * @create: 2021-03-26 09:10
 **/
@Service
public class CarBiz extends ServiceImpl<CarDao, Car> {

    @Autowired
    CarBrandBiz carBrandBiz;
    /**
     * 查询大全
     */
    @Autowired
    CarTypeBiz carTypeBiz;
    public List<AllCar> allCarList(int carID,int vipID){
        ArrayList<AllCar> allCars = new ArrayList<AllCar>();
        List<Car> cars = null;
        if(carID==-100&&vipID==-100){
            QueryWrapper qw = new QueryWrapper();
            qw.eq("deleteMark",1);
            cars = super.baseMapper.selectList(qw);
        }
        if(carID==-100&&vipID!=-100){
            QueryWrapper qw = new QueryWrapper();
            qw.eq("vipID",vipID);
            qw.eq("deleteMark",1);
            cars = super.baseMapper.selectList(qw);
        }
        if(carID!=-100&&vipID==-100){
            QueryWrapper qw = new QueryWrapper();
            qw.eq("carid",1);
            qw.eq("deleteMark",1);
            cars = super.baseMapper.selectList(qw);
        }
        for (Car car : cars) {
            Carbrand carbrand = carBrandBiz.getById(car.getCarbrand());
            Cartype carType = carTypeBiz.getById(car.getCartype());
            allCars.add(new AllCar(carbrand.getCarbrandname(),carType.getCarmodelname(),car));
        }
        return allCars;
    }

    /**
     * 通过用户ID删除
     * @param userID
     * @return
     */
    public boolean delByUser(int userID){
        Car car = new Car();
        car.setVipid(userID);
        UpdateWrapper war = new UpdateWrapper();
        war.eq("Vipid",1);
        war.set("deleteMark",0);
        return update(war);
    }

    @Transactional
    public boolean detByID(int id){
        Car car = new Car();
        car.setCarid(id);
        car.setDeletemark(0);
        Boolean carDel = updateById(car);
        return carDel;
    }
}