package com.api.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class HelloController {
@GetMapping("/")
Stroing hello(){ 
return "Hello World";
}
}