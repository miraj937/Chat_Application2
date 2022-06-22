package com.gisha.chat_application2.messages;

public class messageList {
    private String name;
    private final String lastmessage;
    private Integer unseenMessages;


    public messageList(String name,
                       String lastmessage,
                       Integer unseenMessages) {
        this.name = name;
        this.lastmessage = lastmessage;
        this.unseenMessages = unseenMessages;
    }

    public String getName() {

        return name;
    }

    public String getLastmessage() {

        return lastmessage;
    }

    public Integer getUnseenMessages() {

        return unseenMessages;
    }



}
