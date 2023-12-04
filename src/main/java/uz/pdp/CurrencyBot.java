package uz.pdp;
import lombok.SneakyThrows;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import uz.pdp.handler.UpdateHandler;



public class CurrencyBot extends TelegramLongPollingBot {

    @SneakyThrows
    @Override
    public void onUpdateReceived(Update update) {
        UpdateHandler.handle(update, this);
    }

    @Override
    public String getBotUsername() {
        return BotConfig.BOT_USERNAME;
    }
    @Override
    public String getBotToken() {
        return BotConfig.BOT_TOKEN;
    }

}