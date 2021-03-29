package com.java10.dzw.biz.nimo;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java10.dzw.action.nimo.CarAction;
import com.java10.dzw.dao.nimo.VipDao;
import com.java10.dzw.pojo.Car;
import com.java10.dzw.pojo.Vip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: dzw
 * @description:
 * @author: Nimo
 * @create: 2021-03-25 22:45
 **/
@Service
public class VipBiz extends ServiceImpl<VipDao, Vip> {
    @Autowired
    CarBiz carBiz;
    @Transactional
    public boolean det(int id){
        Vip vip = new Vip();
        vip.setId(id);
        vip.setDeletemark(0);
        Boolean vipDel = updateById(vip);
        if(vipDel){
            carBiz.delByUser(id);
        }else{
            try {
                throw new Exception("Error");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return vipDel;
    }
    @Transactional
    public int seekID(){
        return super.getBaseMapper().seek();
    }
}