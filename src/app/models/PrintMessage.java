package app.models;

import app.service.EmptyMessage;
import app.service.Printer;

public class PrintMessage implements Printer {


    // Внутрішній клас Message
    public static class Message {
        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }

        public String getSender() {
            return sender;
        }
        
               
    }
    @Override
    public void print(Message message) {

        if (message.getText() == null && message.getSender() == null) {
            // Анонімний клас для обробки пустого повідомлення
            EmptyMessage emptyMessage= new EmptyMessage() {
                @Override
                public void empty() {
                    System.out.println("Опрацьовується пусте повідомлення " +
                            "від анонімного користувача...");
                }
            };
            emptyMessage.empty();
        } else if (message.getSender() == null || message.getSender().isEmpty()) {
            System.out.println("Анонімний користувач відправив повідомлення: " + message.getText());
        } else {
            System.out.println("Користувач " + message.getSender() + " відправив повідомлення: " + message.getText());
        }
    }

}
