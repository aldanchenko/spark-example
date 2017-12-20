package ua.spark.example;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import static spark.Spark.get;

/**
 * Provide price service.
 */
public class PriceService {

    /**
     * Main method entry point.
     *
     * @param args -   console arguments
     */
    public static void main(String[] args) {
        List<Price> prices = new ArrayList<>();

        Price price1 = new Price();

        price1.setLongName("Dollar");
        price1.setShortName("US");
        price1.setPrice(100.0);

        Price price2 = new Price();

        price2.setLongName("Euro");
        price2.setShortName("EUR");
        price2.setPrice(100.0);

        prices.add(price1);
        prices.add(price2);

        get("/prices", (request, response) -> {
            response.type("application/json");
            return new Gson().toJson(prices);
        });
    }
}
