package com.jun.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**该配置类不能喝SpringBootApplication注解在同一级包下
 * @author jun
 * @date 2021年04月07日 15:58
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule getIRule(){
        return new RandomRule();
    }
}
