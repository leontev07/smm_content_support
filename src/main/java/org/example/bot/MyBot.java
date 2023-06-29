package org.example.bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class MyBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
        // Реакция на сообщения в чате
      

    }

    @Override
    public String getBotUsername() {
        return null;
    }
    @Override
    public String getBotToken() {
        // геттер токена бота
        return null;
    }
}
