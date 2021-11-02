package com.hyejineee.ploggingprojectbackend.service;

import com.hyejineee.ploggingprojectbackend.dao.ParticipantsDAO;
import com.hyejineee.ploggingprojectbackend.dao.PloggingEventDAO;
import com.hyejineee.ploggingprojectbackend.vo.ParticipantsVO;
import com.hyejineee.ploggingprojectbackend.vo.PloggingEventVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.Objects;


@Service
public class ParticipantsService {

    @Autowired
    ParticipantsDAO participantsDAO;

    @Autowired
    PloggingEventDAO eventDAO;


    public PloggingEventVO insertParticipants(ParticipantsVO participantsVO, int eventId) throws Exception {
        PloggingEventVO event = null;

        try {
            event = eventDAO.getPloggingEventById(eventId);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }

        if (event == null) {
            throw new Exception("이벤트가 존재하지 않습니다.");
        }

        try {
            participantsDAO.insertParticipants(participantsVO);
        } catch (DataAccessException e) {
            e.printStackTrace();
            if (Objects.requireNonNull(e.getMessage()).contains("max_participants")) {
                throw new Exception("참가 인원 초과");
            }
            throw new Exception("이벤트 참여 실패");
        }

        return event;
    }


}
