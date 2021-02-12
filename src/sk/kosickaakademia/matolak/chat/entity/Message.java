package sk.kosickaakademia.matolak.chat.entity;

import java.util.Date;

public class Message {
    private int id;

    public Message(String sender, String text, Date date) {
        this.sender = sender;
        this.date = date;
        this.text = text;
    }

    private String sender;
    private String receiver;
    private Date date;
    private String text;

    public Message(int id, String sender, String receiver, Date date, String text) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.date = date;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public Date getDate() {
        return date;
    }

    public String getText() {
        return text;
    }
}