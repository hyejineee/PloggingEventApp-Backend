package com.hyejineee.ploggingprojectbackend.controller;

import com.hyejineee.ploggingprojectbackend.service.PloggingEventService;
import com.hyejineee.ploggingprojectbackend.service.UserService;
import com.hyejineee.ploggingprojectbackend.service.dto.ResponseDTO;
import com.hyejineee.ploggingprojectbackend.vo.PloggingEventVO;
import com.hyejineee.ploggingprojectbackend.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
@RequestMapping("/events")
public class PloggingEventController {

    @Autowired
    PloggingEventService eventService;

    @PostMapping()
    ResponseDTO<PloggingEventVO> createPloggingEvent(@RequestBody PloggingEventVO requestData){
        System.out.println(requestData);

        eventService.insertPloggingEvent(requestData);

        return new ResponseDTO<PloggingEventVO>(200, "이벤트 생성 성공", requestData);
    }
}
