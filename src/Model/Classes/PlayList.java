package Model.Classes;

import Model.eNUM.TypeOfTrack;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class PlayList <T> {


   private Queue <T> playlist;



    /**constructor**/
    public PlayList(Queue<T> playlist) {
        this.playlist = playlist;
    }

    public PlayList() {
        playlist = new LinkedList<>();
    }
    public void agregarTema(T tema) {
        playlist.add(tema);
    }

    public T reproducirSiguienteTema() {
        return playlist.poll();
    }

    public boolean estaVacia() {
        return playlist.isEmpty();
    }



    public void setPlaylist(Queue<T> playlist) {
        this.playlist = playlist;
    }

    public Queue<T> getPlaylist() {
        return playlist;
    }
}


