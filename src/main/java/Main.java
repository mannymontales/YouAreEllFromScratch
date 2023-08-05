import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import controlla.HttpRequestResponseController;
import controlla.MainController;
import models.Id;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        HttpRequestResponseController httpHandler = new HttpRequestResponseController();

//        try {
//            List<Id> idList = httpHandler.getIdAndCreateIdObject();
//
//            for (Id id : idList) {
//                System.out.println("Id: " + id.getUid());
//                System.out.println("Name: " + id.getName());
//                System.out.println("GitHub: " + id.getGithub());
//                System.out.println("-------------------------");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

                try {
            // Make a GET request
            HttpResponse<String> getResponse = httpHandler.getRequest("http://zipcode.rocks:8085/ids");
            //String jsonRequest = gson.toJson(id);
            //id = gson.fromJson(getResponse.body(), Id.class);
            //id.getUid();
            System.out.println("GET Response: " + getResponse.body());
            //System.out.println(jsonRequest);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        //this one sends a get request


}
