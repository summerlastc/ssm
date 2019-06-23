package com.itheima.service;

import com.itheima.domain.Permission;

import java.util.List;

public interface IPermissionService {

    public List<Permission> findAll() throws Exception;

    void save(Permission permission) throws Exception;
    public List<Permission> findPermissionByRoleId(String id) throws Exception;
}
