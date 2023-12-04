package uz.pdp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import lombok.SneakyThrows;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class Requester {

    @SneakyThrows
   public static List<Currency> RequestJson(){
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://nbu.uz/en/exchange-rates/json/"))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());


        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .setDateFormat("MM/dd/yyyy hh:mm:ss")
                .create();

        String json = gson.toJson(response.body());

        Type type = TypeToken.getParameterized(List.class, Currency.class).getType();

        return gson.fromJson(response.body(), type);
    }

}
