package boot;

import boot.bean.Car;
import boot.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author Mi
 * @Date 2022/4/4 17:07
 * @Version 1.0
 */
//@SpringBootApplication(scanBasePackages = "")可以通过这改变扫描路径
//@ComponentScan("扫描路径")
@SpringBootApplication()
public class MainApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);



        //从容器中获取组件,单实例
        User user = run.getBean(User.class);
        User user1 = run.getBean("user",User.class);
        System.out.println(user);
        System.out.println(user1);
        System.out.println(user==user1);

        Car car = run.getBean(Car.class);
        System.out.println(car);



    }

}
