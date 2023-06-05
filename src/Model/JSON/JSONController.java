package Model.JSON;

import Model.Classes.PlayList;
import Model.Classes.Track;
import Model.Classes.User;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class JSONController {

public void JSONtoFile(User user)
{
    JSONArray jsonArray = new JSONArray();
    try
    {
        JSONArray jsonPlaylistHashmap = new JSONArray();
        for(Map.Entry<Integer, PlayList> entry: user.getListOfPlaylists().entrySet())
        {
        Integer playlistName = entry.getKey();
        PlayList playList = entry.getValue();
        JSONArray songsArray = new JSONArray();
        for(Object track : playList.getPlaylist())
        {
            if(track instanceof Track) {
                songsArray.put(((Track) track).getLenght());
                songsArray.put(((Track) track).getType());
            }
        }
        JSONObject playlistObject = new JSONObject();
        playlistObject.put("Tracks", songsArray);
        jsonArray.put(playlistName,playlistObject);
        }

    }
    catch (JSONException e) {
        e.getCause();
    }
}

}
