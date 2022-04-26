package boot.config;

import boot.bean.Car;
import boot.bean.Pet;
import boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;

/**
 * @Author Mi
 * @Date 2022/4/5 16:35
 * @Version 1.0
 */

/**
 *  proxyBeanMethods: 代理bean的方法
 *  外部无论对配置类中的这个组件注册方法调用多少遍，获取的都是注册到容器中的单实例。也就是同一个实例
 *
 *  Full(proxyBeanMethods = true) 全模式
 *  Lite(proxyBeanMethods = false) 轻量级模式
 *      当配置类组件之间无依赖关系用Lite模式，加快容器启动过程，减少判断
 *      当配置类组件间有依赖关系，方法会被调用得到之前单例实例组件，用Full模式
 *
 *  1. @Import({User.class})
 *      给容器中自动创建出这两个类型的组件
 *
 *  2. @ImportResource("classpath:bean.xml")
 *      导入xml中的组件
 *
 */
//@ImportResource("classpath:bean.xml") //也可以将xml中的组件导入进来
//@Import({User.class})     导入组件
//@EnableConfigurationProperties(Car.class)//1. 开启属性配置 2. 把指定组件配置到容器中
@Configuration(proxyBeanMethods = true)   //告诉springboot这是一个配置类 == 配置文件
public class MyConfig {


    /**
     *
     *          方法名就是原来bean文件中的id
     * @return  返回值就是原来bean文件中的类型
     *      也可以用自定义的id
     *
     *      也可以用以前的方法在类上标注 @Controller @Service等
     *
     */
    //@ConditionalOnBean(name = "pet") //条件装配：当容器中没有pet组件时，就不会创建标注的这个类型的组件。当放在类上时，对整个类生效
//    @Bean("user01")
//    @Bean
    public User user(){
        return new User("李四",23);
    }


    @Bean("pet")
    public Pet pet(){
        return new Pet("123");
    }

}
