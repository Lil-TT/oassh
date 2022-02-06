import com.oahibernate.GoodsEntity;
import com.oahibernate.service.goodsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Lil-TT
 * @Date: 2022-01-23 19:27
 * @Desc:
 */

//测试Spring应用
public class TestGoodsWithSpring {
    public static void main(String[] args) {

        //创建Spring IOC容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        goodsService goodsService = applicationContext.getBean("goodsService", com.oahibernate.service.goodsService.class);

        GoodsEntity goods = new GoodsEntity();

        goods.setSid(Integer.parseInt("7"));
        goods.setName("mary");
        goods.setPrice(Double.valueOf("2.33"));

        try {
            goodsService.add(goods);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
