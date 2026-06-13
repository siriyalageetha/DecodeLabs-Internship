import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONObject;


public class CurrencyConverterAPI {


    private static final String API_KEY = "YOUR_API_KEY";


    public double convert(String from, String to, double amount)
            throws Exception {


        String url =
        "https://v6.exchangerate-api.com/v6/"
        + API_KEY
        + "/latest/"
        + from;



        HttpClient client = HttpClient.newHttpClient();


        HttpRequest request =
        HttpRequest.newBuilder()
        .uri(URI.create(url))
        .GET()
        .build();



        HttpResponse<String> response =
        client.send(
        request,
        HttpResponse.BodyHandlers.ofString()
        );



        JSONObject json =
        new JSONObject(response.body());


        JSONObject rates =
        json.getJSONObject("conversion_rates");


        double rate =
        rates.getDouble(to);



        return amount * rate;
    }
}
