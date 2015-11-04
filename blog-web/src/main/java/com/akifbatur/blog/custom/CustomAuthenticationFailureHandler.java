package com.akifbatur.blog.custom;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

/**
 * @author Akif Batur
 * 
 * Custom AuthenticationFailureHandler implementation class.
 *
 */
public class CustomAuthenticationFailureHandler implements AuthenticationFailureHandler
{
    private static final Logger logger = LoggerFactory.getLogger(CustomAuthenticationFailureHandler.class);

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
            AuthenticationException exception) throws IOException, ServletException
    {
        response.setStatus(HttpServletResponse.SC_OK);
        logger.error("Login failed. Bad credentials.");
        response.sendRedirect("./login?error=failure");
    }   
}
