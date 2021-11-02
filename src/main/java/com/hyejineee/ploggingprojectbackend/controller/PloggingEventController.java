package com.hyejineee.ploggingprojectbackend.controller;

import com.hyejineee.ploggingprojectbackend.service.ParticipantsService;
import com.hyejineee.ploggingprojectbackend.service.PloggingEventService;
import com.hyejineee.ploggingprojectbackend.service.UserService;
import com.hyejineee.ploggingprojectbackend.service.dto.ResponseDTO;
import com.hyejineee.ploggingprojectbackend.vo.PloggingEventVO;
import com.hyejineee.ploggingprojectbackend.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/events")
public class PloggingEventController {

    static String UPCOMING_STATE = "upcoming";
    static String ONGOING_STATE = "ongoing";
    static String FINISH_STATE = "finished";

    @Autowired
    PloggingEventService eventService;

    @Autowired
    ParticipantsService participantsService;

    @PostMapping()
    ResponseDTO<PloggingEventVO> createPloggingEvent(@RequestBody PloggingEventVO requestData, HttpSession session) {
        System.out.println(requestData);

        UserVO user = (UserVO) session.getAttribute("user");

        System.out.println(user);

        if (user == null) {
            return new ResponseDTO<>(401, "로그인 후 사용할 수 있습니다.", null);
        }

        requestData.setStatus(UPCOMING_STATE);
        requestData.setCreateUser(user.getId());

        try {
            eventService.insertPloggingEvent(requestData);
        } catch (DataAccessException e) {
            System.out.println(e);
            return new ResponseDTO<>(500, "이벤트 생성 실패", null);
        }

        return new ResponseDTO<PloggingEventVO>(200, "이벤트 생성 성공", requestData);
    }


    @GetMapping()
    ResponseDTO<List<PloggingEventVO>> getAllPloggingEvent() {
        List<PloggingEventVO> events = null;
        try {
            events = eventService.getAllPloggingEvent();
        } catch (DataAccessException e) {
            System.out.println("getAllPloggingEvent error : " + e);
            return new ResponseDTO<>(500, "이벤트 불러오기 실패", null);
        }

        if(events == null){
            return new ResponseDTO<>(500, "이벤트 불러오기 실패", null);
        }

        System.out.println("events : " + events);
        return new ResponseDTO<List<PloggingEventVO>>(200, "이벤트 불러오기 성공", events);
    }


    @PostMapping("/{eventId}")
    ResponseDTO<PloggingEventVO> participateEvent(@PathVariable String eventId, HttpSession session){
        UserVO user = (UserVO) session.getAttribute("user");

        if (user == null) {
            return new ResponseDTO<>(401, "로그인 후 사용할 수 있습니다.", null);
        }




        return new ResponseDTO<>(401, "로그인 후 사용할 수 있습니다.", null);
    }





}


