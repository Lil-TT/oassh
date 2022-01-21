package com.oahibernate.serviceImpl;

import com.oahibernate.GoodsEntity;
import com.oahibernate.service.goodsService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @Author: Lil-TT
 * @Date: 2022-01-21 0:05
 * @Desc:
 */

public class goodsServiceImpl implements goodsService {
    @Override
    public void add(GoodsEntity goods) throws Exception {
        Configuration configuration = new Configuration().configure();//创建配置对象
        SessionFactory sessionFactory = configuration.buildSessionFactory();//创建会话工厂
        Session session = sessionFactory.openSession();//开启会话
        Transaction transaction = session.beginTransaction();//开启事务

        session.save(goods);

        transaction.commit();//事务提交
        session.close();//关闭会话
        sessionFactory.close();//关闭会话工厂
    }
}
