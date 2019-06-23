package com.itheima.service;

import com.itheima.domain.Permission;
import com.itheima.domain.Role;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;


import java.util.List;

public interface IRoleService {

    public List<Role> findAll() throws Exception;

    void save(Role role) throws Exception;



    Role findById(String roleId);


    List<Permission> findOtherPermissions(String roleId);

    void addPermissionToRole(String roleId, String[] permissionIds);
}
