package uz.pdp.handler.message.command;

import lombok.SneakyThrows;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import uz.pdp.ButtonUtils;



public class CommandHandler {
    public static void handle(final Message message, final TelegramLongPollingBot bot) throws TelegramApiException {

        switch (CommandEnum.of(message.getText())) {
            case START -> handleCommandStart(message, bot);
            case HELP -> handleCommandHelp(message, bot);
            case COMMENT -> handleCommandComment(message, bot);
            case CONTACT -> handleCommandContact(message, bot);
            case CURRENCY -> handleCommandCurrency(message, bot);
            case SETTINGS -> handleCommandSettings(message, bot);
        }
    }

    @SneakyThrows
    public static void handleCommandStart(final Message message, final TelegramLongPollingBot bot) {
        SendMessage sendMessage = new SendMessage(message.getChatId().toString(), "Hello " +
                message.getFrom().getFirstName() + " \nwelcome to our bot " +
                "\nif you need any help, you can use the /help command");
        bot.execute(sendMessage);
    }

    private static void handleCommandHelp(final Message message, final TelegramLongPollingBot bot) throws TelegramApiException {
        SendMessage sendMessage = new SendMessage(message.getChatId().toString(),
                "/contact - contact us\n/comment - leave a comment\n/currency - It helps to see the exchange rate\n/settings - Adjust bot parameters"
                );
        bot.execute(sendMessage);
    }

    @SneakyThrows
    private static void handleCommandContact(final Message message, final TelegramLongPollingBot bot){
        SendMessage sendMessage = new SendMessage(message.getChatId().toString(),
                "You can contact us at this telegram address @playerbest"
                );
        bot.execute(sendMessage);

    }

    @SneakyThrows
    private static void handleCommandComment(final Message message, final TelegramLongPollingBot bot){

            SendMessage sendMessage = new SendMessage(message.getChatId().toString(),
                    "Enter your comment"
            );
            bot.execute(sendMessage);

        }

    @SneakyThrows
    private static void handleCommandCurrency(final Message message, final TelegramLongPollingBot bot){

        SendMessage sendMessage = new SendMessage(message.getChatId().toString(),
              "  Choose the one you need"
        );
        sendMessage.setReplyMarkup(ButtonUtils.START_MARKUP);
        sendMessage.setAllowSendingWithoutReply(true);
        sendMessage.setReplyToMessageId(message.getMessageId());
        bot.execute(sendMessage);

    }
    @SneakyThrows
    private static void handleCommandSettings(final Message message, final TelegramLongPollingBot bot){
        SendMessage sendMessage = new SendMessage(message.getChatId().toString(),
                "Choose the section you need");
        sendMessage.setReplyMarkup(ButtonUtils.SETTINGS_MARKUP);
        sendMessage.setAllowSendingWithoutReply(true);
        sendMessage.setReplyToMessageId(message.getMessageId());


        bot.execute(sendMessage);

    }
}


