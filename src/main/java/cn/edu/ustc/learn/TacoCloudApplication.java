package cn.edu.ustc.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 该注解指明了当前应用是一个Spring boot app。
 * 这个注解是由三个组件组合起来的。
 * @author fangkui
 * @SpringBootConfiguration 指定当前类是一个配置类，是@Configuration注解的特殊形式
 * @EnableAutoConfiguration 开启自动配置
 * @ComponentScan 开启组件扫描
 */
@SpringBootApplication
public class TacoCloudApplication {
    /**
     * Spring boot 程序的入口函数，几乎所有的Spring boot app都有相似的这段函数实现。
     * main函数调用SpringApplication类的静态方法run()，这个方法将会担任真正的应用启动职责，
     * 创建应用的上下文。传递给run()方法的参数是TacoCloudApplication.class和命令行参数
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(TacoCloudApplication.class, args);
    }
}
