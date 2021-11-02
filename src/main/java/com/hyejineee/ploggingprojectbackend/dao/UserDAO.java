package com.hyejineee.ploggingprojectbackend.dao;

import com.hyejineee.ploggingprojectbackend.service.dto.LoginDTO;
import com.hyejineee.ploggingprojectbackend.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDAO {

    public int insertUser(UserVO userVO) throws DataAccessException;

    public UserVO selectUserById(int userId) throws DataAccessException;

    public UserVO selectUserByEmailAndPw(LoginDTO loginDTO) throws DataAccessException;
}
