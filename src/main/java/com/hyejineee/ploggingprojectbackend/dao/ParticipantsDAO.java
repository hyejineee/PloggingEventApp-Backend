package com.hyejineee.ploggingprojectbackend.dao;

import com.hyejineee.ploggingprojectbackend.vo.ParticipantsVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ParticipantsDAO {

    public void insertParticipants(ParticipantsVO participantsVO) throws DataAccessException;

}
