package com.itheima.service.Impl;

import com.itheima.dao.IProductDao;
import com.itheima.service.IProductService;
import com.itheima.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class IProductServiceImpl implements IProductService {
    @Autowired
    private IProductDao iProductDao;
    @Override
    public List<Product> findAll(Integer page, Integer size) throws Exception {
        List<Product> list = iProductDao.findAll();
        return list;
        }

    @Override
    public void saveProduct(Product product) throws Exception {

       iProductDao.save(product);

    }

}
