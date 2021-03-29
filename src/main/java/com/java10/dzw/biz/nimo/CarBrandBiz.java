package com.java10.dzw.biz.nimo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java10.dzw.dao.nimo.CarBrandDao;
import com.java10.dzw.pojo.Carbrand;
import com.java10.dzw.pojo.Cartype;
import com.java10.dzw.vo.CarBrandOrType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: dzw
 * @description:
 * @author: Nimo
 * @create: 2021-03-26 10:02
 **/
@Service
public class CarBrandBiz extends ServiceImpl<CarBrandDao, Carbrand> {
    @Autowired
    CarTypeBiz carTypeBiz;

    public List<CarBrandOrType> seekAll(){
        List<CarBrandOrType> carBrandOrTypes = new ArrayList<CarBrandOrType>();
        List<Carbrand> carbrandList = list();
        for (Carbrand carbrand : carbrandList) {
            QueryWrapper wra = new QueryWrapper();
            wra.eq("carbrandId",carbrand.getCarbrandid());
            carBrandOrTypes.add(new CarBrandOrType(carbrand,carTypeBiz.list(wra)));
        }
        return carBrandOrTypes;
    }
}