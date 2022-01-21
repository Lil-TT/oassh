package com.oahibernate.Controller;
/*
  @Author: Lil-TT
 * @Date: 2022-01-21 20:55
 * @Desc:
 */


import com.oahibernate.GoodsEntity;
import com.oahibernate.service.goodsService;
import com.oahibernate.serviceImpl.goodsServiceImpl;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/goods/add.do")
public class goodsAddController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String sid = request.getParameter("sid");
        String name = request.getParameter("name");
        String price = request.getParameter("price");

        GoodsEntity goods = new GoodsEntity();

        goods.setSid(Integer.parseInt(sid));
        goods.setName(name);
        goods.setPrice(Double.valueOf(price));

        goodsService goodsService = new goodsServiceImpl();

        try {
            goodsService.add(goods);
        } catch (Exception e) {
            e.printStackTrace();
        }

        response.sendRedirect("add.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }
}
