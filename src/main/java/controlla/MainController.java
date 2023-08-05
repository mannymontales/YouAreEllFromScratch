package controlla;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MainController {
    private String rootURL = "http://zipcode.rocks:8085";
    private HttpClient client = HttpClient.newHttpClient();

    public MainController() {}


//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(new URI(rootURL+"/ids"))
//                .GET()
//                .build();
//        try {
//            HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
//            return ""+response.body();
//        } catch (URISyntaxException | IOException | InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        String rootURL = "http://zipcode.rocks:8085";
//        HttpClient httpClient = HttpClient.newHttpClient();
//
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create(rootURL + "/ids"))
//                .GET()
//                .build();
//
//
//        try {
//            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
//
//            int statusCode = response.statusCode();
//            String responseBody = response.body();
//
//            System.out.println("Response Code: " + statusCode);
//            System.out.println("Response JSON: " + responseBody);
//
//            // Parse JSON array using Gson
//            Gson gson = new Gson();
//            JsonArray jsonArray = gson.fromJson(responseBody, JsonArray.class);
//
//            // Loop through the JSON array
//            for (JsonElement element : jsonArray) {
//                String userId = element.getAsJsonObject().get("userid").getAsString();
//                String name = element.getAsJsonObject().get("name").getAsString();
//                String github = element.getAsJsonObject().get("github").getAsString();
//
//                System.out.println("userId: " + userId);
//                System.out.println("name: " + name);
//                System.out.println("github: " + github);
//                System.out.println("--------------------------------");
//            }
//        } catch (IOException | InterruptedException e) {
//            e.printStackTrace();
//        }

    }

