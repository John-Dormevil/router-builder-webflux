package flocondria.com.routerbuilder.test;

import flocondria.com.routerbuilder.factory.HttpMethod;
import flocondria.com.routerbuilder.factory.RouterBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import java.lang.reflect.InvocationTargetException;
import java.security.NoSuchAlgorithmException;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

@Configuration
public class FirstRouter {

    @Bean
    public RouterFunction<ServerResponse> helloRoutes(FirstHandler firstHandler) {
        return RouterFunctions.route(GET("/hello"), firstHandler::get);
    }

    @Bean
    public RouterFunction<ServerResponse> generateRoutes(FirstHandler firstHandler)
            throws NoSuchMethodException,
                   NoSuchAlgorithmException,
                   IllegalAccessException,
                   InvocationTargetException {

        RouterBuilder routerBuilder = new RouterBuilder();

        RouterFunction allRoutes = routerBuilder.add(HttpMethod.get, "/build", firstHandler::get)
                                                .add(HttpMethod.get, "/solomon", firstHandler::suggest)
                                                .build();

        return allRoutes;
    }
}
