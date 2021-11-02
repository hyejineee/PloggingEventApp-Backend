package com.hyejineee.ploggingprojectbackend.controller;

import com.hyejineee.ploggingprojectbackend.service.dto.ResponseDTO;
import com.hyejineee.ploggingprojectbackend.service.UserService;
import com.hyejineee.ploggingprojectbackend.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping()
    public ResponseDTO<UserVO> signUp(@RequestBody UserVO newUser){

        System.out.println(newUser);

        int newId = userService.insertUser(newUser);

        return new ResponseDTO<UserVO>(200, "회원가입 성공", newUser);
    }

    @GetMapping()
    public ResponseDTO<UserVO> login(@RequestHeader Map<String, Object> headers, HttpSession session){
        System.out.println(headers);

        String token =  headers.get("authorization").toString();
        UserVO authorizedUser = userService.authorizeToUser(token);

        if(authorizedUser == null){
            return new ResponseDTO<>(401, "로그인 실패", null);
        }

        session.setAttribute("user", authorizedUser);
        return new ResponseDTO<UserVO>(200, "로그인 성공", authorizedUser);
    }
}
