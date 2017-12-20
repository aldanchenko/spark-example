package ua.spark.example;

import static spark.Spark.get;

/**
 * Hello World service main method example.
 */
public class HelloWorldService {

    /**
     * Main method entry point.
     *
     * @param args -   console arguments
     */
    public static void main(String[] args) {
        get("/hello", (request, response) -> "Hello, world");

        get("/hello/:name", (request, response) -> {
            return "Hello, " + request.params(":name");
        });
    }
}
