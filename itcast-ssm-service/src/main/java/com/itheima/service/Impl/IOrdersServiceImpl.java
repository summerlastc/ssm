package com.itheima.service.Impl;

import com.github.pagehelper.PageHelper;
import com.itheima.dao.IOrdersDao;
import com.itheima.domain.Orders;

import com.itheima.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class IOrdersServiceImpl implements IOrdersService {
    @Autowired
    private IOrdersDao iOrdersDao;

    /**
     * 查询所有
     * @param page
     * @param size
     * @return
     * @throws Exception
     */
    @Override
    public List<Orders> findAll(Integer page, Integer size) throws Exception {
        //参数pageNum 是页码值   参数pageSize 代表是每页显示条数
        PageHelper.startPage(page, size);
        return iOrdersDao.findAll();
    }

    /**
     * 根据id查询
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public Orders findById(String id) throws Exception {
        Orders orders = iOrdersDao.findById(id);
        return orders;
    }

}
