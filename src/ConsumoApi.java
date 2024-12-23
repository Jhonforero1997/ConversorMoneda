import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class ConsumoApi {
    public double getExchangeRate(String baseCurrency, String monedadestino) throws Exception {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/71012d6c2aefccbb1221d3b4/latest/" + baseCurrency);
        // Cree el httpClient
        HttpClient client = HttpClient.newHttpClient();
        // cree el httpRequest
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf(direccion)))
                .build();
        try {
            // Se construye el httpResponse
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            // se Analiza la respuesta en formato JSON
            Moneda moneda = new Gson().fromJson(response.body(), Moneda.class);
            // Obtener la tasa de conversión para la moneda de destino
            Map<String, Double> conversionRates = moneda.getConversion_rates();
            // se convierten los valores
            Double tasaConversion = conversionRates.get(monedadestino);

            if (tasaConversion != null) {
                return tasaConversion;
            } else {
                throw new RuntimeException("Tasa de conversión no encontrada para la moneda de destino");
            }
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener la tasa de conversión");
        }
    }
}

