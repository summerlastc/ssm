package com.itheima.service;


import com.itheima.domain.SysLog;


import java.util.List;

public interface ISysLogService {


    List<SysLog> findAll(Integer page, Integer pageSize) throws Exception;
    void save(SysLog sysLog) throws Exception;


}
