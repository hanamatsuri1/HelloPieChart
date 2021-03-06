import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.javatuples.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataExtractor {

    public static List<Pair<String, Integer>> extractDataFromJSON(String rawJson) {
        // TODO
        List<Pair<String, Integer>> list = new ArrayList<>();
        JsonParser jsonParser = new JsonParser();
        JsonElement rootElement = jsonParser.parse(rawJson);
        JsonObject rootObject = rootElement.getAsJsonObject();
        for (Map.Entry<String, JsonElement> object : rootObject.entrySet()){
            list.add(new Pair<>(object.getKey(), object.getValue().getAsInt()));
        }
        return list;
    }
}
