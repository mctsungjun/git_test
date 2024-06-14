package com.myproject.member.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MemberController {
    
    // 메인화면 보이기
    @RequestMapping(path="/")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }

    //로그인
    @RequestMapping(path="/sung/login")
    public ModelAndView login(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sung/login");
        return mv;
    }
    //회원등록
    @RequestMapping(path="/sung/register")
    public ModelAndView register(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sung/register");
        return mv;
    }

}
