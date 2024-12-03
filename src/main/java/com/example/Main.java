package com.example;

import com.example.services.ExchangeRateClient;
import com.example.utils.CurrencyConverterUtil;
import com.example.models.ExchangeRateResponse;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ExchangeRateClient client = new ExchangeRateClient();
        CurrencyConverterUtil converter = new CurrencyConverterUtil();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la moneda base (ej. USD): ");
        String baseCurrency = scanner.nextLine();

        System.out.print("Introduce la moneda de destino (ej. EUR): ");
        String targetCurrency = scanner.nextLine();

        System.out.print("Introduce el monto a convertir: ");
        double amount = scanner.nextDouble();

        try {
            String jsonResponse = client.fetchExchangeRates(baseCurrency);
            double result = converter.convertCurrency(jsonResponse, baseCurrency, targetCurrency, amount);

            System.out.printf("%.2f %s equivalen a %.2f %s%n",
                    amount, baseCurrency, result, targetCurrency);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
