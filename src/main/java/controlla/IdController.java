package controlla;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.tools.javac.Main;
import models.Id;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IdController {

    private HashMap<String, Id> allIds;
    Id tempId;

    private MainController mainController;

    public IdController(MainController mainController){
        this.mainController = mainController;
    }

    public List<Id> getIds() {
        String idString = tempId.getUid();
        Gson gson = new Gson();

        Type listType = new TypeToken<List<Id>>() {}.getType();
        List<Id>  idList = new Gson().fromJson(idString, listType);
        return idList;
    }
}
