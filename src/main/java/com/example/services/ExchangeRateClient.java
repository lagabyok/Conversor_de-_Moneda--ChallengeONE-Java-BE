package com.example.services;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;

public class ExchangeRateClient {
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/21f00d7d0d43c3048d627102/latest/ARS";

    private final HttpClient httpClient;

    public ExchangeRateClient() {
        this.httpClient = HttpClient.newHttpClient();
    }

    public String fetchExchangeRates(String baseCurrency) throws IOException, InterruptedException {
        // Construir la URI con la moneda base
        URI uri = URI.create(BASE_URL + baseCurrency.toUpperCase());

        // Crear la solicitud HTTP
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .GET()
                .build();

        // Enviar la solicitud y manejar la respuesta
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        // Verificar el código de estado
        if (response.statusCode() != 200) {
            System.err.println("Error en la API. Código de estado: " + response.statusCode());
            System.err.println("Respuesta: " + response.body());
            throw new IOException("Error en la API. Código de estado: " + response.statusCode());
        }

        // Devolver el cuerpo de la respuesta
        return response.body();
    }
}
