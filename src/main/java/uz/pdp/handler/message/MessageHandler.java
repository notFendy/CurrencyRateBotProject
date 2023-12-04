package uz.pdp.handler.message;

import lombok.SneakyThrows;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Message;
import uz.pdp.handler.ConverterCurrencyHandler;
import uz.pdp.handler.message.command.CommandHandler;

public class MessageHandler {

    @SneakyThrows
    public static void handle(final Message message, final TelegramLongPollingBot bot) {

        if (message.isCommand()) {
            CommandHandler.handle(message, bot);
        }else if (message.hasText()){
            ConverterCurrencyHandler.handle(message, bot);
        }


    }
}
