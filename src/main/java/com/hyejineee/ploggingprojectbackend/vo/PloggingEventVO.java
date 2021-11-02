package com.hyejineee.ploggingprojectbackend.vo;

public class PloggingEventVO {
    private int id ;
    private String title;
    private String content;
    private String address;
    private double latitude;
    private double longitude;
    private int participants;
    private int limitOfParticipants;
    private String status;
    private int createUser;

    public PloggingEventVO(int id, String title, String content, String address, double latitude, double longitude, int participants, int limitOfParticipants, String status, int createUser) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.participants = participants;
        this.limitOfParticipants = limitOfParticipants;
        this.status = status;
        this.createUser = createUser;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    public int getLimitOfParticipants() {
        return limitOfParticipants;
    }

    public void setLimitOfParticipants(int limitOfParticipants) {
        this.limitOfParticipants = limitOfParticipants;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCreateUser() {
        return createUser;
    }

    public void setCreateUser(int createUser) {
        this.createUser = createUser;
    }

    @Override
    public String toString() {
        return "PloggingEventVO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", address='" + address + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", participants=" + participants +
                ", limitOfParticipants=" + limitOfParticipants +
                ", status='" + status + '\'' +
                ", createUser=" + createUser +
                '}';
    }
}
