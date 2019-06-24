package com.itheima.service.Impl;

import com.github.pagehelper.PageHelper;
import com.itheima.dao.IPermissionDao;
import com.itheima.domain.Permission;
import com.itheima.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IPermissionServiceImpl implements IPermissionService {

    @Autowired
    private IPermissionDao permissionDao;

    @Override
    public void save(Permission permission) throws Exception{
        permissionDao.save(permission);
    }

    @Override
    public List<Permission> findPermissionByRoleId(String id) throws Exception {
        return permissionDao.findPermissionByRoleId(id);
    }

    @Override
    public List<Permission> findAll(Integer page, Integer size) throws Exception{
        PageHelper.startPage(page, size);
        return permissionDao.findAll();
    }


}
