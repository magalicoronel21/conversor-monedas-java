package service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiService {

    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public double obtenerTasa(String apiKey, String monedaBase, String monedaObjetivo)
            throws Exception {

        String url = BASE_URL + apiKey + "/pair/" + monedaBase + "/" + monedaObjetivo;

        // Cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        // Solicitud
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        // Respuesta
        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        // Convertir a JSON
        JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();

        // Extraer tasa real
        return json.get("conversion_rate").getAsDouble();
    }
}
