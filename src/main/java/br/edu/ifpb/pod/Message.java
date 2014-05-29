/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.pod;

import java.io.Serializable;

/**
 *
 * @author Fernando
 */
public class Message implements Serializable{
    private String id;
    private String messageContent;
    private String from;
    private String to;
    private boolean messageStatus;

    public boolean isMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(boolean messageStatus) {
        this.messageStatus = messageStatus;
    }

    public Message(){
        
    }

    public Message(String id, String messageContent, String from, String to, boolean messageStatus) {
        this.id = id;
        this.messageContent = messageContent;
        this.from = from;
        this.to = to;
        this.messageStatus = messageStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
   
}
