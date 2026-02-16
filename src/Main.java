import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    private static final String BASE_URL = "https://api.openweathermap.org/data/2.5/weather?q=";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a city name: ");
        String city = scanner.nextLine();

        String urlString = BASE_URL + city.replace(" ", "%20") + "&APPID=" + ApiKey.API_KEY + "&units=metric";

        try (HttpClient client = HttpClient.newHttpClient()) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlString))
                    .GET()
                    .build();
            try {
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                if (response.statusCode() == 200) {
                    System.out.println("\nWeather at " + city);
                    System.out.println(response.body());
                } else {
                    System.out.println("Error: Could not find city. (Status Code: " + response.statusCode() + ")");
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }

        }
    }
}

