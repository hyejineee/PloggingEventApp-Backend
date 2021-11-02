package com.hyejineee.ploggingprojectbackend.service;

import com.hyejineee.ploggingprojectbackend.dao.PloggingEventDAO;
import com.hyejineee.ploggingprojectbackend.dao.UserDAO;
import com.hyejineee.ploggingprojectbackend.service.dto.LoginDTO;
import com.hyejineee.ploggingprojectbackend.vo.PloggingEventVO;
import com.hyejineee.ploggingprojectbackend.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;

import java.util.List;

@Service
public class PloggingEventService {

    @Autowired
    PloggingEventDAO eventDAO;

    public int insertPloggingEvent(PloggingEventVO ploggingEventVO){
        return eventDAO.insertPloggingEvent(ploggingEventVO);
    }

    public String getAddress() {
        return eventDAO.getAddress();
    }

    public List<PloggingEventVO> getAllPloggingEvent() {
        return eventDAO.getAllPloggingEvent();
    }
}
