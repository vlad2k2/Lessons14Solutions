package app.models;

import app.service.Printer;

public class PrintMessage implements Printer {

    private Message message;


    public void setMessage(Message message) {
        this.message = message;
    }

    @Override
    public void print() {
        if (message == null) {
            System.out.println("Не було встановлено повідомлення.");
            return;
        }

        //
        if (message.getText() == null && message.getSender() == null) {
            System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
        } else if (message.getSender() == null || message.getSender().isEmpty()) {
            System.out.println("Анонімний користувач відправив повідомлення: " + message.getText());
        } else {
            System.out.println("Користувач " + message.getSender() +
                    " відправив повідомлення: " + message.getText());
        }
    }

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

        public String getSender() {
            return sender;
        }
    }

}
