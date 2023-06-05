package Model.JSON;

import org.json.JSONArray;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JSONUtil {

    public static void save (JSONArray jsonArray, String name)
    {
        try {
            FileWriter fw = new FileWriter(name + ".json");
            fw.write(jsonArray.toString());
            fw.flush();
            fw.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }


}
