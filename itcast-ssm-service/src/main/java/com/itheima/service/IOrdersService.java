package com.itheima.service;

import com.itheima.domain.Orders;
import com.itheima.domain.Product;
import org.omg.CORBA.Object;

import java.util.List;

public interface IOrdersService {


    List<Orders> findAll(Integer page, Integer pageSize) throws Exception;
    Orders findById(String id)throws Exception;
}
