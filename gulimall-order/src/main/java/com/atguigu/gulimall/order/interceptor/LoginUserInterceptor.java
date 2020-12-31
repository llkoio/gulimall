package com.atguigu.gulimall.order.interceptor;

import com.atguigu.common.constant.AuthServerConstant;
import org.apache.ibatis.javassist.bytecode.ConstantAttribute;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LoginUserInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object attribute = request.getSession().getAttribute(AuthServerConstant.LOGIN_USER);
        if (attribute != null) {
            return true;
        } else {
            request.getSession().setAttribute("msg", "Please to login");
            response.sendRedirect("http://auth.gulimall.com/login.html");
            return false;
        }
    }
}
