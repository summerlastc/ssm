package com.itheima.service;

import com.itheima.domain.Permission;
import com.itheima.domain.Role;


import java.util.List;

public interface IRoleService {

    public List<Role> findAll() throws Exception;

    void save(Role role) throws Exception;



}
