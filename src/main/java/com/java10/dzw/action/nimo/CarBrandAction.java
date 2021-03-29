package com.java10.dzw.action.nimo;

import com.java10.dzw.biz.nimo.CarBiz;
import com.java10.dzw.biz.nimo.CarBrandBiz;
import com.java10.dzw.vo.AllCar;
import com.java10.dzw.vo.CarBrandOrType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: dzw
 * @description:
 * @author: Nimo
 * @create: 2021-03-27 17:01
 **/
@RestController
@RequestMapping("nimo/api/CarBrandAction")
public class CarBrandAction {
    @Autowired
    CarBrandBiz carBrandBiz;

    @GetMapping("seekCar")
    public List<CarBrandOrType> seekAll(){
        return carBrandBiz.seekAll();
    }
}