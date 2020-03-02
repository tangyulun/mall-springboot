package com.springboot.mall.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * WebMvcConfig
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
  @Value("${file.staticAccessPath}")
  private String staticAccessPath;
  @Value("${file.uploadFolder}")
  private String uploadFolder;
  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("swagger-ui.html")
        .addResourceLocations("classpath:/META-INF/resources/");

    registry.addResourceHandler("/templates/**")
        .addResourceLocations("classpath:/META-INF/resources/templates/");
    registry.addResourceHandler(staticAccessPath)
        .addResourceLocations("file:" + uploadFolder);
    registry.addResourceHandler("/static/**")
        .addResourceLocations("classpath:/static/");
  }
}
