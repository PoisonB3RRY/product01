package testImpls;

import impl.HelloSpringImpl;
import interfaces.HelloSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author nickj
 * @desc 测试类
 */

public class TestHelloSpring {

    public static void main(String[] args) {
        //new方式
        HelloSpring helloSpring = new HelloSpringImpl();
        helloSpring.sayHello();

        //Spring方式：XML解析+反射+工厂模式
        //初始化Spring容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过容器获取helloSpring实例,getBean()方法中的参数是bean标签中的id
        HelloSpring helloSpring1 = (HelloSpring) applicationContext.getBean("helloSpring");
        helloSpring1.sayHello();
    }
}
