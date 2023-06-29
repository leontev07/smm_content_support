package org.example.bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class MyBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
        // Реакция на сообщения в чате
        //private final String BOT_TOKEN = "6126755491:AAEcSafsxoMGZnqnNjBU2DwcTxp1aqHYQ9g";
        //private final String BOT_NAME = "smm_content_support_bot";

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
