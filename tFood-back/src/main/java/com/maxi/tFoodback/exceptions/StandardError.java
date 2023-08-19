package com.maxi.tFoodback.exceptions;

public class StandardError {

    private Integer status;
    private Long moment;
    private String error;
    
    public StandardError() {
    }

    public StandardError(Integer status, Long moment, String error) {
        this.status = status;
        this.moment = moment;
        this.error = error;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getMoment() {
        return moment;
    }

    public void setMoment(Long moment) {
        this.moment = moment;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    
    
}
