package controlla;

import com.google.gson.Gson;
import models.Id;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.util.Map;
public class HttpRequestResponseController {

    private String rootURL = "http://zipcode.rocks:8085";
    private final HttpClient client;

    public HttpRequestResponseController() {
        this.client = HttpClient.newHttpClient();
    }

    //get request
    public List<Id> getIdAndCreateIdObject() throws Exception {
        try {
            //send http request
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(rootURL + "/ids"))
                    .GET()
                    .build();

            //store response
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            //gson to json, json to gson shit for java to read
            if (response.statusCode() == 200) {
                String responseBody = response.body();
                Gson gson = new Gson();
                Type listType = new TypeToken<List<Id>>() {}.getType();
                return gson.fromJson(responseBody, listType);
            } else {
                throw new RuntimeException("GET request failed with status code: " + response.statusCode());
            }
        } catch (URISyntaxException | IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public HttpResponse<String> getRequest(String url) throws Exception{

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(url))
                .GET()
                .build();

        return client.send(request, HttpResponse.BodyHandlers.ofString());
    }
}
