package com.boot.spring.service.impl;

import com.boot.spring.mapper.ProductInfoMapper;
import com.boot.spring.po.ProductInfo;
import com.boot.spring.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    ProductInfoMapper productInfoMapper;

    public void  insert(ProductInfo productInfo){
        productInfo.setCreateTime(new Date());
        productInfo.setUpdateTime(new Date());
        productInfo.setProductPrice(new BigDecimal(1).add(new BigDecimal(2)));
        productInfoMapper.insert(productInfo);
    }
}
