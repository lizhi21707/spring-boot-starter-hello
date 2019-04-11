package com.tank.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 *
 * @author: lizhi1
 * @date: 2019/4/11 11:46 Thursday
 */
@Configuration
@EnableConfigurationProperties(HelloServiceProperties.class)
@ConditionalOnClass(HelloService.class)
@ConditionalOnProperty(prefix = "hello", value = "enabled", matchIfMissing = true)
public class HelloServiceAutoConfiguration {

  private final HelloServiceProperties helloServiceProperties;

  public HelloServiceAutoConfiguration(HelloServiceProperties helloServiceProperties) {
    this.helloServiceProperties = helloServiceProperties;
  }

  @Bean
  @ConditionalOnMissingBean(HelloService.class)
  public HelloService helloService() {
    HelloService helloService = new HelloService();
    helloService.setMsg(helloServiceProperties.getMsg());
    return helloService;
  }
}
