package com.jun.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jun
 * @date 2021年04月14日 9:53
 */
@Configuration
public class GateWayConfig {

    /**
     * 访问localhost:9527/guonei跳转到http://news.baidu.com/guonei
     * @param routeLocatorBuilder
     * @return
     */
    @Bean
    public RouteLocator customerRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_rout_jun",
                r -> r.path("/guonei")
                        .uri("http://news.baidu.com/guonei"))
                .build();
        return routes.build();
    }
}
