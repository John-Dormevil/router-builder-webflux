package flocondria.com.routerbuilder.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class FirstHandler {

    public Mono<ServerResponse> get(ServerRequest request) {
        return ServerResponse.ok().body(BodyInserters.fromObject(request.path()));
    }

    public Mono<ServerResponse> suggest(ServerRequest request) {
        return ServerResponse.ok().body(BodyInserters.fromObject("suggest response"));
    }
}
