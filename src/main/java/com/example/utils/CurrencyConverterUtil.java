package com.example.utils;

import com.google.gson.Gson;
import com.example.models.ExchangeRateResponse;

public class CurrencyConverterUtil {
    private final Gson gson;

    public CurrencyConverterUtil() {
        this.gson = new Gson();
    }

    public double convertCurrency(String jsonResponse, String fromCurrency, String toCurrency, double amount) {
        // Deserializa la respuesta JSON a un objeto ExchangeRateResponse
        ExchangeRateResponse response = gson.fromJson(jsonResponse, ExchangeRateResponse.class);

        // Verifica si las monedas están disponibles en la respuesta de la API
        if (!response.getRates().containsKey(fromCurrency) || !response.getRates().containsKey(toCurrency)) {
            throw new IllegalArgumentException("Moneda no encontrada en la respuesta de la API.");
        }

        // Obtén las tasas de cambio de las monedas
        double fromRate = response.getRates().get(fromCurrency);
        double toRate = response.getRates().get(toCurrency);

        // Realiza la conversión de divisas
        return (amount / fromRate) * toRate;
    }
}
