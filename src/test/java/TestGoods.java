import com.oahibernate.GoodsEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @Author: Lil-TT
 * @Date: 2022-01-20 19:42
 * @Desc:
 */
public class TestGoods {
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    @Before
    public void init() {
        Configuration configuration = new Configuration().configure();//创建配置对象
        sessionFactory = configuration.buildSessionFactory();//创建会话工厂
        session = sessionFactory.openSession();//开启会话
        transaction = session.beginTransaction();//开启事务
    }

    @Test
    public void testGoods() {
        //生成对象
        GoodsEntity goods = new GoodsEntity(1, "女朋友", 2333.33);
        //保存对象进数据库
        session.save(goods);
    }

    @After
    public void destory() {
        transaction.commit();//事务提交
        session.close();//关闭会话
        sessionFactory.close();//关闭会话工厂
    }
}
