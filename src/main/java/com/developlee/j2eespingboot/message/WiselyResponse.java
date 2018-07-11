package com.developlee.j2eespingboot.message;

/**
 * @author Lee
 * @// TODO 2018/7/11-10:36
 * @description
 */
public class WiselyResponse {
    private String responseMessage;

    public WiselyResponse(String responseMessage){
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }
}
