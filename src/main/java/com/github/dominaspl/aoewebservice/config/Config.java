package com.github.dominaspl.aoewebservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class Config extends WebSecurityConfigurerAdapter {

    private PasswordEncoder passwordEncoder;

    public Config(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
            auth.inMemoryAuthentication()
                    .withUser("admin").password(passwordEncoder.encode("admin123")).roles("ADMIN")
                    .and()
                    .withUser("user").password(passwordEncoder.encode("userPass")).roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .httpBasic()
            .and()
            .authorizeRequests()
            .antMatchers(HttpMethod.GET, "/api/v1/aoe/**").hasRole("USER")
            .antMatchers(HttpMethod.POST, "/api/v1/aoe/**").hasRole("ADMIN")
            .antMatchers(HttpMethod.PUT, "/api/v1/aoe/**").hasRole("ADMIN")
            .antMatchers(HttpMethod.DELETE, "/api/v1/aoe/**").hasRole("ADMIN")
            .and()
            .csrf().disable()
            .formLogin().disable();
    }
}
