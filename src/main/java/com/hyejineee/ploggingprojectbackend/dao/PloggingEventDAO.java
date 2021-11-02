package com.hyejineee.ploggingprojectbackend.dao;

import com.hyejineee.ploggingprojectbackend.service.dto.LoginDTO;
import com.hyejineee.ploggingprojectbackend.vo.PloggingEventVO;
import com.hyejineee.ploggingprojectbackend.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PloggingEventDAO {

    public int insertPloggingEvent(PloggingEventVO eventVO) throws DataAccessException;

}
