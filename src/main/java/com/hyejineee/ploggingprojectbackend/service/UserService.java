package com.hyejineee.ploggingprojectbackend.service;

import com.hyejineee.ploggingprojectbackend.dao.UserDAO;
import com.hyejineee.ploggingprojectbackend.service.dto.LoginDTO;
import com.hyejineee.ploggingprojectbackend.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;

@Service
public class UserService {

    @Autowired
    UserDAO userDAO;


    public int insertUser(UserVO user) throws DataAccessException{
        return userDAO.insertUser(user);
    }

    public UserVO selectUserById(int id){
        return userDAO.selectUserById(id);
    }

    public UserVO authorizeToUser(String token) throws  DataAccessException{
        String[] authorizationValue = token.split(" ");
        String type = authorizationValue[0];
        String credential = authorizationValue[1];

        UserVO user = null;

        if("Basic".equalsIgnoreCase(type)){
            String decodedCredential = new String(Base64Utils.decodeFromString(credential));
            String[] info = decodedCredential.split(":");
            String email = info[0];
            String pw = info[1];

            user = selectUserByEmailAndPw(new LoginDTO(email, pw));
        }

        if(user == null) {
            return null;
        }

        return user;
    }

    private UserVO selectUserByEmailAndPw(LoginDTO loginDTO){
        return userDAO.selectUserByEmailAndPw(loginDTO);
    }
}
