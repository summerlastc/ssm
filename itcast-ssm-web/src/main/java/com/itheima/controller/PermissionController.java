package com.itheima.controller;


import com.github.pagehelper.PageInfo;
import com.itheima.domain.Permission;

import com.itheima.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/permission")
public class PermissionController {
    @Autowired
    private IPermissionService permissionService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name = "page", required = true, defaultValue =
            "1") Integer page, @RequestParam(name = "size", required = true, defaultValue = "6")
                                            Integer size) throws Exception {
        List<Permission> permissionList = permissionService.findAll(page, size);
        ModelAndView mv = new ModelAndView();
        PageInfo pageInfo=new PageInfo(permissionList);
        mv.addObject("pageInfo", pageInfo);
        mv.setViewName("permission-list");
        return mv;
        }
    @RequestMapping("/save")
    public String savePermission(Permission permission)throws Exception{
        permissionService.save(permission);
        return "redirect:findAll.do";
    }

}