package uz.pdp;


import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import uz.pdp.handler.CallbackQueryHandler;

import java.util.*;

public class ButtonUtils {

    public static final InlineKeyboardMarkup START_MARKUP = InlineKeyboardMarkup
            .builder()
            .keyboardRow(List.of(InlineKeyboardButton.builder()
                            .text("\uD83C\uDDFA\uD83C\uDDF8USD > \uD83C\uDDFA\uD83C\uDDFFUZS").callbackData("usd").build(),

                    InlineKeyboardButton.builder()
                            .text("\uD83C\uDDEA\uD83C\uDDFAEURO > \uD83C\uDDFA\uD83C\uDDFFUZS").callbackData("euro").build()
            ))

            .keyboardRow(List.of(InlineKeyboardButton.builder()
                            .text("\uD83C\uDDF0\uD83C\uDDFFTENGE > \uD83C\uDDFA\uD83C\uDDFFUZS").callbackData("tenge").build(),

                    InlineKeyboardButton.builder()
                            .text("\uD83C\uDDF7\uD83C\uDDFAROUBLE > \uD83C\uDDFA\uD83C\uDDFFUZS").callbackData("rouble").build()
            ))
            .keyboardRow(List.of(InlineKeyboardButton.builder().
                    text("Next➡\uFE0F").callbackData("next").build()))

            .keyboardRow(List.of(InlineKeyboardButton.builder().
                    text("Delete\uD83D\uDDD1").callbackData("delete").build()))

            .build();

    public static final InlineKeyboardMarkup START_MARKUP2 = InlineKeyboardMarkup
            .builder()
            .keyboardRow(List.of(InlineKeyboardButton.builder()
                    .text("\uD83C\uDDE6\uD83C\uDDEAAED > \uD83C\uDDFA\uD83C\uDDFFUZS").callbackData("aed").build(),

                    InlineKeyboardButton.builder()
                            .text("\uD83C\uDDE8\uD83C\uDDF3CNY > \uD83C\uDDFA\uD83C\uDDFFUZS").callbackData("cny").build()
                    ))


            .keyboardRow(List.of(InlineKeyboardButton.builder()
                    .text("\uD83C\uDDEF\uD83C\uDDF5JPY > \uD83C\uDDFA\uD83C\uDDFFUZS").callbackData("jpy").build(),

            InlineKeyboardButton.builder()
                    .text("\uD83C\uDDF0\uD83C\uDDF7WON > \uD83C\uDDFA\uD83C\uDDFFUZS").callbackData("won").build()))


            .keyboardRow(List.of(InlineKeyboardButton.builder()
                    .text("Next➡\uFE0F").callbackData("next1").build()))

            .keyboardRow(List.of(InlineKeyboardButton.builder()
                    .text("Back◀\uFE0F ").callbackData("back1").build()))
            .build();

    public static final InlineKeyboardMarkup START_MARKUP3 = InlineKeyboardMarkup
            .builder()
            .keyboardRow(List.of(InlineKeyboardButton.builder()
                            .text("\uD83C\uDDF5\uD83C\uDDF1PLN > \uD83C\uDDFA\uD83C\uDDFFUZS").callbackData("pln").build(),
                    InlineKeyboardButton.builder().
                            text("\uD83C\uDDF9\uD83C\uDDF7TRY > \uD83C\uDDFA\uD83C\uDDFFUZS").callbackData("try").build()
                    ))
            .keyboardRow(List.of(InlineKeyboardButton.builder()
                    .text("\uD83C\uDDFA\uD83C\uDDE6UAH > \uD83C\uDDFA\uD83C\uDDFFUZS").callbackData("uah").build()))

            .keyboardRow(List.of(InlineKeyboardButton.builder()
                    .text("Back◀\uFE0F").callbackData("back2").build()))
            .build();


    public static final InlineKeyboardMarkup SETTINGS_MARKUP = InlineKeyboardMarkup.builder()
            .keyboardRow(List.of(InlineKeyboardButton.builder()
                    .text("💵 Currency for conversion").callbackData("CurrencyConversion").build()))
            .keyboardRow(List.of(InlineKeyboardButton.builder()
                    .text("Delete\uD83D\uDDD1").callbackData("delete").build()))
            .build();



    static List<InlineKeyboardButton> keyboards = new ArrayList<InlineKeyboardButton>();

    static List<InlineKeyboardButton> currencyKeyboards() {
        if(keyboards.size() != 0){
            return keyboards;
        }

        keyboards.addAll(
                List.of(
                        InlineKeyboardButton.builder().text("\uD83C\uDDE6\uD83C\uDDEAAED❌").callbackData("AED").build(),
                        InlineKeyboardButton.builder().text("\uD83C\uDDE8\uD83C\uDDF3CNY❌").callbackData("CNY").build(),
                        InlineKeyboardButton.builder().text("\uD83C\uDDEF\uD83C\uDDF5JPY❌").callbackData("JPY").build(),
                        InlineKeyboardButton.builder().text("\uD83C\uDDF0\uD83C\uDDF7WON❌").callbackData("KRW").build(),
                        InlineKeyboardButton.builder().text("\uD83C\uDDEA\uD83C\uDDFAEUR❌").callbackData("EUR").build(),
                        InlineKeyboardButton.builder().text("\uD83C\uDDF0\uD83C\uDDFFKZT❌").callbackData("KZT").build(),
                        InlineKeyboardButton.builder().text("\uD83C\uDDF5\uD83C\uDDF1PLN❌").callbackData("PLN").build(),
                        InlineKeyboardButton.builder().text("\uD83C\uDDF7\uD83C\uDDFARUB❌").callbackData("RUB").build(),
                        InlineKeyboardButton.builder().text("\uD83C\uDDF9\uD83C\uDDF7TRY❌").callbackData("TRY").build(),
                        InlineKeyboardButton.builder().text("\uD83C\uDDFA\uD83C\uDDE6UAH❌").callbackData("UAH").build(),
                        InlineKeyboardButton.builder().text("\uD83C\uDDFA\uD83C\uDDF8USD❌").callbackData("USD").build(),
                        InlineKeyboardButton.builder().text("◀️️ Back").callbackData("back").build()
                )
        );
        return keyboards;
    }


    public static InlineKeyboardMarkup currenciesMarkup() {
        var builder = InlineKeyboardMarkup.builder();
        var keyboards = currencyKeyboards();
        for (InlineKeyboardButton keyboard : keyboards) {
            builder.keyboardRow(List.of(keyboard));
        }
        return builder.build();
    }

    public static InlineKeyboardMarkup changeIconAndGetMarkups(String currency) {
        var builder = InlineKeyboardMarkup.builder();
        for (int i = 0; i < keyboards.size(); i++) {
            InlineKeyboardButton keyboard = keyboards.get(i);
            if (keyboard.getCallbackData().equals(currency)) {
                keyboards.set(i, updateCurrencyIcon(keyboard));
            }
            builder.keyboardRow(List.of(keyboards.get(i)));
        }
        return builder.build();
    }

    private static InlineKeyboardButton updateCurrencyIcon(InlineKeyboardButton keyboard) {
        String currentText = keyboard.getText();
        String updatedText;


        if (currentText.endsWith("❌")) {
            updatedText = currentText.replace("❌", "✅");
        } else {
            updatedText = currentText.replace("✅", "❌");
        }

        return InlineKeyboardButton.builder()
                .text(updatedText)
                .callbackData(keyboard.getCallbackData())
                .build();
    }

}
