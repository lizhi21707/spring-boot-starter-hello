package com.tank.hello;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * Description:
 *
 * @author: lizhi1
 * @date: 2019/4/11 11:42 Thursday
 */
@ConfigurationProperties(prefix = "hello-m")
public class HelloServiceProperties {

  private static final String MSG = "world";

  private String msg = MSG;

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }
}
