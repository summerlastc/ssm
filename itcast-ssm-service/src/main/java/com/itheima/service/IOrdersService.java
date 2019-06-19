package com.itheima.service;

import com.itheima.domain.Orders;
import com.itheima.domain.Product;

import java.util.List;

public interface IOrdersService {


    List<Orders> findAllByPage(Integer page, Integer pageSize) throws Exception;
    void saveProduct(Product product)throws Exception;
}
