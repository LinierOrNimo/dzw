package com.java10.dzw.vo;

import com.java10.dzw.pojo.Car;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @program: dzw
 * @description:
 * @author: Nimo
 * @create: 2021-03-26 09:49
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AllCar {
    private String carBrand;
    private String carType;
    private Car car;
}