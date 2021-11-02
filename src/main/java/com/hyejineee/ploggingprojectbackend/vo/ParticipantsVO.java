package com.hyejineee.ploggingprojectbackend.vo;

public class ParticipantsVO {
    private int id;
    private int userId;
    private int eventId;
    private String status;

    public ParticipantsVO(int id, int userId, int eventId, String status) {
        this.id = id;
        this.userId = userId;
        this.eventId = eventId;
        this.status = status;
    }

    @Override
    public String toString() {
        return "ParticipantsVO{" +
                "id=" + id +
                ", userId=" + userId +
                ", eventId=" + eventId +
                ", status='" + status + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
