package com.web.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.User;

@RestController
public class TestController {
  @RequestMapping("hello")
  public String helloWorld() {
	  User user = new User();
	  System.out.println("123");
	  return "hello world";
  }
}
