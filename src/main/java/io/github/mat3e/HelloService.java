package io.github.mat3e;

import java.util.Optional;

class HelloService {
    String prepareGreeting(String name){
       return "Hello " + Optional.ofNullable(name).orElse("world");
    }
}
