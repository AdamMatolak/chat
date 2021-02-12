package sk.kosickaakademia.matolak.chat.out;

import sk.kosickaakademia.matolak.chat.entity.Message;
import java.util.List;

public class Output {
    public void printMyMessages(List<Message> list){
        System.out.println("New messages: ");
        for(Message ms : list){
            System.out.println(" from: " + ms.getSender() +": \""+ms.getText()+"\" "+ ms.getDate() );
        }
    }
}
