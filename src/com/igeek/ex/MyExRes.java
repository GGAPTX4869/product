package com.igeek.ex;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyExRes implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        if (e instanceof MyException) {
            System.out.println("MyException……");
            httpServletRequest.setAttribute("msg", e.getMessage());
            try{
                httpServletRequest.getRequestDispatcher("index.jsp").forward(httpServletRequest, httpServletResponse);
            } catch (ServletException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", e.getMessage());
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
