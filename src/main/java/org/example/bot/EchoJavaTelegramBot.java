package org.example.bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.PhotoSize;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.Comparator;
import java.util.List;

public class EchoJavaTelegramBot extends TelegramLongPollingBot {
    final String botName;
    final String botToken;

    public EchoJavaTelegramBot(String botName, String botToken) {
        this.botName = botName;
        this.botToken = botToken;
    }

    @Override
    public String getBotUsername() {
        // геттер имени бота
        return this.botName;
    }

    @Override
    public String getBotToken() {
        // геттер токена бота
        return this.botToken;
    }

    @Override
    public void onUpdateReceived(Update update) {
        // Проверяем появление нового сообщения в чате, и если это текст
        if (update.hasMessage() && update.getMessage().hasText()) {
            String message_text = update.getMessage().getText();            // Создаем переменную равную тексту присланного сообщения
            String chat_id = update.getMessage().getChatId().toString();    // Создаем переменную равную ид чата присланного сообщения
            String user = "-1001872504397";
            //String response = parseMessage(inMess.getText());
            long userId = update.getMessage().getFrom().getId();
            String username = update.getMessage().getFrom().getUserName();
            String firstname = update.getMessage().getFrom().getFirstName();
            String lastname = update.getMessage().getFrom().getLastName();

            SendMessage message = new SendMessage(); // Создаем обект-сообщение
            message.setChatId(user);
            //message.setChatId(chat_id);// Передаем чат ид
            message.setText(message_text + "\nприслал пользователь\n" + "@" + username + "\n" + firstname + "\n" + lastname);// Передаем эхо сообщение
            //message.setText("Твоё сообщение: '" + message_text + "' отправлено\n" + "Успокойся, выпей кофе, возможно скоро починим");


            try {
                execute(message);                   // Отправляем обект-сообщение пользователю
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
            /*if (update.hasMessage() && update.getMessage().hasPhoto()) {
                // Получаем информацию о фото
                PhotoSize photo = update.getMessage().getPhoto().stream()
                        .sorted((p1, p2) -> Integer.compare(p2.getWidth(), p1.getWidth())) // Получаем самую большую фотографию
                        .findFirst()
                        .orElse(null);

                if (photo != null) {
                    // Отправляем фото обратно
                    SendPhoto sendPhotoRequest = new SendPhoto();
                    sendPhotoRequest.setChatId(update.getMessage().getChatId().toString());
                    sendPhotoRequest.setPhoto(photo.getFileId());

                    try {
                        execute(sendPhotoRequest);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }


            }*/

        }

    }
}

