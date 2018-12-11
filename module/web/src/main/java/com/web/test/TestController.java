package com.web.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.User;

@RestController
public class TestController {
  @RequestMapping("hello")
  public String helloWorld() {
	  System.out.println("666666");
	  System.out.println("333355");
	  User user = new User();
	  System.out.println("11111111");
	  System.out.println("222222");
	  return "hello world";
  }
}
