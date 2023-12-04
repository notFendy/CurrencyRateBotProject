package uz.pdp.handler;

import lombok.SneakyThrows;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

import java.util.ArrayList;
import java.util.List;

import static uz.pdp.handler.message.ConverterCurrencyMethods.*;


public class ConverterCurrencyHandler {

    @SneakyThrows
    public static void handle(Message message, TelegramLongPollingBot bot) {

        List<String> specifiedCurrencies = new ArrayList<>();

      if (CallbackQueryHandler.list.contains("AED")){
          specifiedCurrencies.add("\uD83C\uDDE6\uD83C\uDDEA " + AEDConverter(message) + " AED");
      }
      if (CallbackQueryHandler.list.contains("CNY")){
            specifiedCurrencies.add("\uD83C\uDDE8\uD83C\uDDF3 " + CNYConverter(message) + " CNY");
        }
      if (CallbackQueryHandler.list.contains("JPY")){
            specifiedCurrencies.add("\uD83C\uDDEF\uD83C\uDDF5 " + JPYConverter(message) + " JPY");
        }
      if (CallbackQueryHandler.list.contains("KRW")){
            specifiedCurrencies.add("\uD83C\uDDF0\uD83C\uDDF7 " + WONConverter(message) + " WON");
        }
      if (CallbackQueryHandler.list.contains("EUR")){
            specifiedCurrencies.add("\uD83C\uDDEA\uD83C\uDDFA " + EuroConverter(message) + " EUR");
        }
      if (CallbackQueryHandler.list.contains("KZT")){
            specifiedCurrencies.add("\uD83C\uDDF0\uD83C\uDDFF " + TengeConverter(message) + " KZT");
        }
      if (CallbackQueryHandler.list.contains("PLN")){
            specifiedCurrencies.add("\uD83C\uDDF5\uD83C\uDDF1 " + AEDConverter(message) + " PLN");
        }
      if (CallbackQueryHandler.list.contains("RUB")){
            specifiedCurrencies.add("\uD83C\uDDF7\uD83C\uDDFA " + RoubleConverter(message) + " RUB");
        }
      if (CallbackQueryHandler.list.contains("TRY")){
            specifiedCurrencies.add("\uD83C\uDDF9\uD83C\uDDF7 " + TRYConverter(message) + " TRY" );
        }
      if (CallbackQueryHandler.list.contains("UAH")){
            specifiedCurrencies.add("\uD83C\uDDFA\uD83C\uDDE6 " + UAHConverter(message) + " UAH");
        }
      if (CallbackQueryHandler.list.contains("USD")){
            specifiedCurrencies.add("\uD83C\uDDFA\uD83C\uDDF8 " + UsdConverter(message) + " USD");
        }


        if (isNumeric(message.getText())){

            String value = "";

            for (int i = 0; i < specifiedCurrencies.size(); i++) {
              value += "\n" + specifiedCurrencies.get(i) ;
            }

            SendMessage sendMessage = new SendMessage(message.getChatId().toString(),
                  "=====================" + "\n" +
                          "\uD83C\uDDFA\uD83C\uDDFF" + message.getText() + "UZS" + "\n" +
                  value
            );

            sendMessage.setAllowSendingWithoutReply(true);
            sendMessage.setReplyToMessageId(message.getMessageId());

            bot.execute(sendMessage);


        }

    }

    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.replaceAll(" ","").toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

}
