package com.java10.dzw.vo;

import com.java10.dzw.pojo.Carbrand;
import com.java10.dzw.pojo.Cartype;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @program: dzw
 * @description:
 * @author: Nimo
 * @create: 2021-03-27 17:02
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarBrandOrType {
    private Carbrand carBrand;
    private List<Cartype> cartypeList;
}