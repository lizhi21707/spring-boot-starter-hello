package com.tank.hello;

/**
 * Description:
 *
 * @author: lizhi1
 * @date: 2019/4/11 11:44 Thursday
 */
public class HelloService {

  private String msg;

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public String sayHello() {
    return "hello " + msg;
  }
}
