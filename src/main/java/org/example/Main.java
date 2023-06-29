package org.example;

import org.example.bot.EchoJavaTelegramBot;
import org.example.bot.MyBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    public static void main(String[] args) {
        String botName = "smm_content_support_bot"; // В место звездочек указываем имя созданного вами ранее Бота
        String botToken = "6126755491:AAEcSafsxoMGZnqnNjBU2DwcTxp1aqHYQ9g"; // В место звездочек указываем токен созданного вами ранее Бота
        TelegramBotsApi telegramBotsApi = null;
        try {
            telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(new EchoJavaTelegramBot(botName, botToken));
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
}