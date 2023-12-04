package uz.pdp.handler.message;


import org.telegram.telegrambots.meta.api.objects.Message;
import uz.pdp.Currency;
import uz.pdp.Requester;
import java.util.List;
import java.util.stream.Collectors;

public class ConverterCurrencyMethods {

    public static double UAHConverter(Message message){

        List<Currency> collect = Requester.RequestJson().stream()
                .filter(currency -> "UAH".equals(currency.getCode()))
                .collect(Collectors.toList());

        double UAHPrice = collect.get(0).getCbPrice();
        double UAH = (Double.parseDouble(message.getText().replaceAll(" ","")) / UAHPrice);

        return Double.parseDouble(String.valueOf(UAH).substring(0,String.valueOf(UAH).indexOf(".") + 3));
    }

    public static double TRYConverter(Message message){

        List<Currency> collect = Requester.RequestJson().stream()
                .filter(currency -> "TRY".equals(currency.getCode()))
                .collect(Collectors.toList());

        double TRYPrice = collect.get(0).getCbPrice();
        double TRY = (Double.parseDouble(message.getText().replaceAll(" ","")) / TRYPrice);

        return Double.parseDouble(String.valueOf(TRY).substring(0,String.valueOf(TRY).indexOf(".") + 3));
    }

    public static double PLNConverter(Message message){

        List<Currency> collect = Requester.RequestJson().stream()
                .filter(currency -> "PLN".equals(currency.getCode()))
                .collect(Collectors.toList());

        double PLNPrice = collect.get(0).getCbPrice();
        double PLN = (Double.parseDouble(message.getText().replaceAll(" ","")) / PLNPrice);

        return Double.parseDouble(String.valueOf(PLN).substring(0,String.valueOf(PLN).indexOf(".") + 3));
    }

    public static double WONConverter(Message message){

        List<Currency> collect = Requester.RequestJson().stream()
                .filter(currency -> "KRW".equals(currency.getCode()))
                .collect(Collectors.toList());

        double KRWPrice = collect.get(0).getCbPrice();
        double KRW = (Double.parseDouble(message.getText().replaceAll(" ","")) / KRWPrice);

        return Double.parseDouble(String.valueOf(KRW).substring(0,String.valueOf(KRW).indexOf(".") + 3));
    }

    public static double JPYConverter(Message message){

        List<Currency> collect = Requester.RequestJson().stream()
                .filter(currency -> "JPY".equals(currency.getCode()))
                .collect(Collectors.toList());

        double JPYPrice = collect.get(0).getCbPrice();
        double JPY = (Double.parseDouble(message.getText().replaceAll(" ","")) / JPYPrice);

        return Double.parseDouble(String.valueOf(JPY).substring(0,String.valueOf(JPY).indexOf(".") + 3));
    }


    public static double CNYConverter(Message message){

        List<Currency> collect = Requester.RequestJson().stream()
                .filter(currency -> "CNY".equals(currency.getCode()))
                .collect(Collectors.toList());

        double CNYPrice = collect.get(0).getCbPrice();
        double CNY = (Double.parseDouble(message.getText().replaceAll(" ","")) / CNYPrice);

        return Double.parseDouble(String.valueOf(CNY).substring(0,String.valueOf(CNY).indexOf(".") + 3));
    }


    public static double AEDConverter(Message message){

        List<Currency> collect = Requester.RequestJson().stream()
                .filter(currency -> "AED".equals(currency.getCode()))
                .collect(Collectors.toList());

        double AEDPrice = collect.get(0).getCbPrice();
        double AED = (Double.parseDouble(message.getText().replaceAll(" ","")) / AEDPrice);

        return Double.parseDouble(String.valueOf(AED).substring(0,String.valueOf(AED).indexOf(".") + 3));
    }


    public static double RoubleConverter(Message message){

        List<Currency> collect = Requester.RequestJson().stream()
                .filter(currency -> "RUB".equals(currency.getCode()))
                  .collect(Collectors.toList());

        double RubPrice = collect.get(0).getCbPrice();
        double Rouble = (Double.parseDouble(message.getText().replaceAll(" ","")) / RubPrice);

        return Double.parseDouble(String.valueOf(Rouble).substring(0,String.valueOf(Rouble).indexOf(".") + 3));
    }

    public static double TengeConverter(Message message){
        List<Currency> collect = Requester.RequestJson().stream()
                .filter(currency -> "KZT".equals(currency.getCode()))
                .collect(Collectors.toList());

        double TengePrice = collect.get(0).getCbPrice();
        double Tenge = (Double.parseDouble(message.getText().replaceAll(" ","")) / TengePrice);

        return Double.parseDouble(String.valueOf(Tenge).substring(0,String.valueOf(Tenge).indexOf(".") + 3));
    }

    public static double EuroConverter(Message message ){

        List<Currency> collect = Requester.RequestJson().stream()
                .filter(currency -> "EUR".equals(currency.getCode()))
                .collect(Collectors.toList());

        double EuroPrice = collect.get(0).getCbPrice();
        double Euro = (Double.parseDouble(message.getText().replaceAll(" ","")) / EuroPrice);

        return Double.parseDouble(String.valueOf(Euro).substring(0,String.valueOf(Euro).indexOf(".") + 3));
    }


    public static double UsdConverter(Message message){
        List<Currency> collect = Requester.RequestJson().stream()
                .filter(currency -> "USD".equals(currency.getCode()))
                .collect(Collectors.toList());

        double UsdPrice = collect.get(0).getCbPrice();
        double Usd = (Double.parseDouble(message.getText().replaceAll(" ","")) / UsdPrice);

        return Double.parseDouble(String.valueOf(Usd).substring(0,String.valueOf(Usd).indexOf(".") + 3));

    }


}
