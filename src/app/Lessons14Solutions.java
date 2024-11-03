package app;

import app.models.PrintMessage;

public class Lessons14Solutions {

    static public void main(String[] args){

            PrintMessage printer = new PrintMessage();
        // Тестові повідомлення
        PrintMessage.Message msg1 = new PrintMessage.Message("Привіт!", "Іван");
        PrintMessage.Message msg2 = new PrintMessage.Message("Привіт, світ!", null);
        PrintMessage.Message msg3 = new PrintMessage.Message(null, null);

        // Друкуємо повідомлення
        printer.setMessage(msg1);// Користувач Іван відправив повідомлення: Привіт!
        printer.print();
        printer.setMessage(msg2); // Анонімний користувач відправив повідомлення: Привіт, світ!
        printer.print();
        printer.setMessage(msg3);
        printer.print();
        }

    }


