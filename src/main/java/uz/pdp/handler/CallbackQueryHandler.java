package uz.pdp.handler;


import lombok.SneakyThrows;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageReplyMarkup;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import uz.pdp.ButtonUtils;
import uz.pdp.Currency;
import uz.pdp.Requester;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public  class   CallbackQueryHandler {
    public static List<String> list = new ArrayList<>();

    @SneakyThrows
    public static void handle(final CallbackQuery callbackQuery, final TelegramLongPollingBot bot) throws TelegramApiException {

        String data = callbackQuery.getData();


        switch (data) {
            case "usd" -> {

                List<Currency> collect = Requester.RequestJson().stream()
                        .filter(currency -> "USD".equals(currency.getCode()))
                        .collect(Collectors.toList());

                double nbuCellPrice = collect.get(0).getCbPrice();

                bot.execute(new SendMessage(callbackQuery.getMessage().getChatId().toString(),
                          "🇺🇿" + nbuCellPrice + " UZS"));

            }
            case "euro" -> {

                List<Currency> collect = Requester.RequestJson().stream()
                        .filter(currency -> "EUR".equals(currency.getCode()))
                        .collect(Collectors.toList());

                double nbuCellPrice = collect.get(0).getCbPrice();

                bot.execute(new SendMessage(callbackQuery.getMessage().getChatId().toString(),
                          "🇺🇿" + nbuCellPrice + " UZS"));

            }
            case "tenge" -> {

                List<Currency> collect = Requester.RequestJson().stream()
                        .filter(currency -> "KZT".equals(currency.getCode()))
                        .collect(Collectors.toList());

                double nbuCellPrice = collect.get(0).getCbPrice();

                bot.execute(new SendMessage(callbackQuery.getMessage().getChatId().toString(),
                          "🇺🇿" + nbuCellPrice + " UZS"));

            }

            case "rouble" -> {

                List<Currency> collect = Requester.RequestJson().stream()
                        .filter(currency -> "RUB".equals(currency.getCode()))
                        .collect(Collectors.toList());

                double nbuCellPrice = collect.get(0).getCbPrice();

                bot.execute(new SendMessage(callbackQuery.getMessage().getChatId().toString(),
                          "🇺🇿" + nbuCellPrice + " UZS"));


            }
            case "aed" -> {

                List<Currency> collect = Requester.RequestJson().stream()
                        .filter(currency -> "AED".equals(currency.getCode()))
                        .collect(Collectors.toList());

                double nbuCellPrice = collect.get(0).getCbPrice();

                bot.execute(new SendMessage(callbackQuery.getMessage().getChatId().toString(),
                        "🇺🇿" + nbuCellPrice + " UZS"));


            }
            case "cny" -> {

                List<Currency> collect = Requester.RequestJson().stream()
                        .filter(currency -> "CNY".equals(currency.getCode()))
                        .collect(Collectors.toList());

                double nbuCellPrice = collect.get(0).getCbPrice();

                bot.execute(new SendMessage(callbackQuery.getMessage().getChatId().toString(),
                        "🇺🇿" + nbuCellPrice + " UZS"));


            }
            case "jpy" -> {

                List<Currency> collect = Requester.RequestJson().stream()
                        .filter(currency -> "JPY".equals(currency.getCode()))
                        .collect(Collectors.toList());

                double nbuCellPrice = collect.get(0).getCbPrice();

                bot.execute(new SendMessage(callbackQuery.getMessage().getChatId().toString(),
                        "🇺🇿" + nbuCellPrice + " UZS"));

            }
            case "won" -> {

                List<Currency> collect = Requester.RequestJson().stream()
                        .filter(currency -> "KRW".equals(currency.getCode()))
                        .collect(Collectors.toList());

                double nbuCellPrice = collect.get(0).getCbPrice();

                bot.execute(new SendMessage(callbackQuery.getMessage().getChatId().toString(),
                        "🇺🇿" + nbuCellPrice + " UZS"));

            }

            case "pln" -> {

                List<Currency> collect = Requester.RequestJson().stream()
                        .filter(currency -> "PLN".equals(currency.getCode()))
                        .collect(Collectors.toList());

                double nbuCellPrice = collect.get(0).getCbPrice();

                bot.execute(new SendMessage(callbackQuery.getMessage().getChatId().toString(),
                        "🇺🇿" + nbuCellPrice + " UZS"));

            }
            case "try" -> {

                List<Currency> collect = Requester.RequestJson().stream()
                        .filter(currency -> "TRY".equals(currency.getCode()))
                        .collect(Collectors.toList());

                double nbuCellPrice = collect.get(0).getCbPrice();

                bot.execute(new SendMessage(callbackQuery.getMessage().getChatId().toString(),
                        "🇺🇿" + nbuCellPrice + " UZS"));

            }
            case "uah" -> {

                List<Currency> collect = Requester.RequestJson().stream()
                        .filter(currency -> "UAH".equals(currency.getCode()))
                        .collect(Collectors.toList());

                double nbuCellPrice = collect.get(0).getCbPrice();

                bot.execute(new SendMessage(callbackQuery.getMessage().getChatId().toString(),
                        "🇺🇿" + nbuCellPrice + " UZS"));

            }



            case "next", "back2" -> {
                EditMessageReplyMarkup editMessageReplyMarkup = EditMessageReplyMarkup.builder()
                        .messageId(callbackQuery.getMessage().getMessageId())
                        .chatId(callbackQuery.getMessage().getChatId())
                        .replyMarkup(ButtonUtils.START_MARKUP2).build();

                bot.execute(editMessageReplyMarkup);
            }

            case "next1" ->{
                EditMessageReplyMarkup editMessageReplyMarkup = EditMessageReplyMarkup.builder()
                        .messageId(callbackQuery.getMessage().getMessageId())
                        .chatId(callbackQuery.getMessage().getChatId())
                        .replyMarkup(ButtonUtils.START_MARKUP3).build();

                bot.execute(editMessageReplyMarkup);
            }

            case "back1" -> {

                EditMessageReplyMarkup editMessageReplyMarkup = EditMessageReplyMarkup.builder()
                        .messageId(callbackQuery.getMessage().getMessageId())
                        .chatId(callbackQuery.getMessage().getChatId())
                        .replyMarkup(ButtonUtils.START_MARKUP).build();

                bot.execute(editMessageReplyMarkup);

            }


            case "CurrencyConversion" -> {


                EditMessageReplyMarkup editMessageReplyMarkup = EditMessageReplyMarkup.builder()
                        .messageId(callbackQuery.getMessage().getMessageId())
                        .chatId(callbackQuery.getMessage().getChatId())
                        .replyMarkup(ButtonUtils.currenciesMarkup()).build();

                bot.execute(editMessageReplyMarkup);


            }

            case "back" -> {

                EditMessageReplyMarkup editMessageReplyMarkup = EditMessageReplyMarkup.builder()
                        .messageId(callbackQuery.getMessage().getMessageId())
                        .chatId(callbackQuery.getMessage().getChatId())
                        .replyMarkup(ButtonUtils.SETTINGS_MARKUP).build();

                bot.execute(editMessageReplyMarkup);

            }

            case "delete" -> {

                DeleteMessage editMessageReplyMarkup = DeleteMessage.builder()
                        .messageId(callbackQuery.getMessage().getMessageId())
                        .chatId(callbackQuery.getMessage().getChatId())
                        .build();
                bot.execute(editMessageReplyMarkup);

            }

            default -> {
                EditMessageReplyMarkup editMessageReplyMarkup = EditMessageReplyMarkup.builder()
                        .messageId(callbackQuery.getMessage().getMessageId())
                        .chatId(callbackQuery.getMessage().getChatId())
                        .replyMarkup(ButtonUtils.changeIconAndGetMarkups(data)).build();

                bot.execute(editMessageReplyMarkup);
                System.out.println("DATA - " + data);

                if(!list.contains(data)){
                    list.add(data);
                }
                else {
                    list.removeAll(Collections.singleton(data));
                }

            }
        }
    }
}




