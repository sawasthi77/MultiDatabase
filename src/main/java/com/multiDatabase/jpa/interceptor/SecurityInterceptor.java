package com.multiDatabase.jpa.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;


@Component
public class SecurityInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // Security check (e.g., validate Authorization token)
        String authToken = request.getHeader("Authorization");
        if (authToken != null && isValidToken(authToken)) {
            return true;  // Allow the request to proceed
        } else {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);  // Block request (401 Unauthorized)
            return false;
        }
    }

    private boolean isValidToken(String token) {
        // Add token validation logic (e.g., JWT validation)
        return "valid-token".equals(token);
    }
}
