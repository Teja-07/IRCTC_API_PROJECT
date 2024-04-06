package com.example.Library_Management;

import java.io.IOException;

import javax.naming.AuthenticationException;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class apiKeyAuthentication extends OncePerRequestFilter {
	private final String expectedApiKey = "http://localhost:8080/api/trains/add";

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String providedApiKey = request.getHeader("X-API-Key");
        if (providedApiKey != null && providedApiKey.equals(expectedApiKey)) {
            filterChain.doFilter(request, response);
        } else {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        }
    }
}
