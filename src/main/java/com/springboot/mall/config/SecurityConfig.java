package com.springboot.mall.config;

import com.springboot.mall.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * SecurityConfig配置
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
  @Autowired
  private UmsAdminService adminService;
  @Override
  protected void configure(HttpSecurity httpSecurity) throws Exception {
    httpSecurity.csrf().disable()
        // 由于使用的是JWT，我们这里不需要HttpSession
        .sessionManagement()// 基于token，所以不需要session
        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        .and()
        //OPTIONS请求全部放行
        .authorizeRequests()
        .antMatchers(HttpMethod.GET, // 允许对于网站静态资源的无授权访问
            "/",
            "/*.html",
            "/favicon.ico",
            "/**/*.html",
            "/**/*.css",
            "/**/*.js",
            "/swagger-resources/**",
            "/v2/api-docs/**"
        )
        .permitAll()
        .antMatchers("/admin/login", "/admin/register")// 对登录注册要允许匿名访问
        .permitAll()
        .antMatchers(HttpMethod.OPTIONS)//跨域请求会先进行一次options请求
        .permitAll()
        .antMatchers("/**")//测试时全部运行访问
        .permitAll()
        .anyRequest()// 除上面外的所有请求全部需要鉴权认证
        .authenticated();
    // 禁用缓存
    //http.addFilterBefore(authenticationTokenFilterBean(), UsernamePasswordAuthenticationFilter.class);
    httpSecurity.headers().cacheControl();
  }

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.userDetailsService(userDetailsService())
        .passwordEncoder(passwordEncoder());
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @Bean
  @Override
  public AuthenticationManager authenticationManagerBean() throws Exception {
    return super.authenticationManagerBean();
  }

}
