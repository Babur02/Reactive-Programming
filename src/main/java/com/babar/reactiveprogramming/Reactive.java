package com.babar.reactiveprogramming;

import java.util.List;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Reactive {

    // For one Data
    private Mono<String> mono() {
        return Mono.just("java");
    }

    // For multiple data
    private Flux<String> flux() {
        return Flux.just("java", "React");
    }

    private Flux<String> fluxIterable() {
        List<String> list = List.of("Node", "Mongo");
        return Flux.fromIterable(list);
    }

    public static void main(String[] args) {
        Reactive reactive = new Reactive();
        reactive.mono().subscribe(data -> System.out.println(data));

        reactive.flux().subscribe(System.out::println);
        reactive.fluxIterable().subscribe(System.out::println);
    }
}
