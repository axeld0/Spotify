package Model.Classes;

import java.util.HashMap;

public class User {

    HashMap< Integer, PlayList> listOfPlaylists;


    /**constructor**/
    public User(HashMap<Integer, PlayList> listOfPlaylists) {

        this.listOfPlaylists = listOfPlaylists;
    }

    public User() {
        new HashMap<Integer, PlayList>();
    }



    /**getter and setter**/

    public HashMap<Integer, PlayList> getListOfPlaylists() {
        return listOfPlaylists;
    }

    public void setListOfPlaylists(HashMap<Integer, PlayList> listOfPlaylists) {
        this.listOfPlaylists = listOfPlaylists;
    }


    /**add a playlist that returns a random key**/

    public int addPlaylist(PlayList playlist)
    {
        int randomKey = (int)Math.random();
        listOfPlaylists.put(randomKey, playlist);
        return randomKey;
    }


}
