package testImpls;

import impl.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestGirlFriend {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = applicationContext.getBean("user1", User.class);
        System.out.println(user.getUserName()+"--------" + user.getGirlFriend());
    }
}
