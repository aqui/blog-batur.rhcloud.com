package com.akifbatur.blog.custom;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

/**
 * @author Akif Batur
 * 
 * Custom AuthenticationSuccessHandler implementation class.
 *
 */
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler
{
    private static final Logger logger = LoggerFactory.getLogger(CustomAuthenticationSuccessHandler.class);

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
            Authentication authentication) throws IOException, ServletException
    {
        // Log user details
        logger.info("User " + authentication.getName() + " is logged in.");
        logger.info(authentication.getDetails().toString());
        logger.info(authentication.getPrincipal().toString());
        response.setStatus(HttpServletResponse.SC_OK);
        response.sendRedirect("./");
    }
}
