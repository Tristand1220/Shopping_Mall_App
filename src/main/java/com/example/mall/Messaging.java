package com.example.mall;

import java.util.ArrayList;
import java.util.List;

class Message {
    private String sender;
    private String receiver;
    private String content;
    private boolean isRead;

    public Message(String sender, String receiver, String content) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.isRead = false;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getContent() {
        return content;
    }


}

class MessagingSystem {
    private List<Message> messages;

    public MessagingSystem() {
        messages = new ArrayList<>();
    }

    public void sendMessage(String sender, String receiver, String messageContent) {
        Message message = new Message(sender, receiver, messageContent);
        messages.add(message);
    }


    public List<Message> getAllMessagesForUser(String user) {
        List<Message> userMessages = new ArrayList<>();
        for (Message message : messages) {
            if (message.getReceiver().equals(user) || message.getSender().equals(user)) {
                userMessages.add(message);
            }
        }
        return userMessages;
    }
}
