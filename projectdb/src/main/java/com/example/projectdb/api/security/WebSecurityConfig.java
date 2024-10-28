// package com.example.projectdb.api.security;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.web.SecurityFilterChain;

// @Configuration
// public class WebSecurityConfig {

//     @Bean
//     public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
//         http
//             .authorizeHttpRequests(auth -> auth
//                 .anyRequest().authenticated() // Require authentication for all requests
//             )
//             .formLogin(form -> form
//                 .loginPage("/login")           // Specify a custom login page (optional)
//                 .permitAll()                   // Allow access to the login page without authentication
//             )
//             .logout(logout -> logout
//                 .permitAll()                   // Allow logout functionality
//             );
//             return http.build();
//     }
// }
