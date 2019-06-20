package com.itheima.dao;

import com.itheima.domain.Orders;
import com.itheima.domain.Product;
import org.apache.ibatis.annotations.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IProductDao {
    /**
     * 查看所有
     *
     * @return
     * @throws Exception
     */


        @Select("select * from Product")
        List<Product> findAll() throws Exception;

        /**
         * 保存
         *
         * @param product
         * @throws Exception
         */
        @Insert("insert into product(productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus) values(#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
        void save(Product product) throws Exception;

        /**
         * 根据Id查询
         *
         * @param id
         * @return
         * @throws Exception
         */
        @Select("select * from product where id=#{id}")
        Product findById(String id) throws Exception;
    }

