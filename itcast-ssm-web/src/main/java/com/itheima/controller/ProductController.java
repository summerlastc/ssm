package com.itheima.controller;

import com.github.pagehelper.PageInfo;

import com.itheima.domain.Product;

import com.itheima.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
    @RequestMapping("/product")
    public class ProductController {


            @Autowired
            private IProductService productService;

            @RequestMapping("/findAll.do")
            public ModelAndView findAll(@RequestParam(name = "page", required = true, defaultValue =
                    "1") Integer page, @RequestParam(name = "size", required = true, defaultValue = "4")
                    Integer size) throws Exception {

                ModelAndView mv = new ModelAndView();
                List<Product> productList = productService.findAll(page, size);
                PageInfo pageInfo=new PageInfo(productList);
                mv.setViewName("product-page-list");
                mv.addObject("pageInfo", pageInfo);
                return mv;
            }



        @RequestMapping("/save")
        public String saveProduct(Product product)throws Exception{
            productService.saveProduct(product);
            return "redirect:findAll.do";
        }
    }



