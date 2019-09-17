package com.boot.spring.mapper;

import com.boot.spring.po.ProductInfo;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;


@Repository
public interface ProductInfoMapper extends Mapper<ProductInfo> {
}
