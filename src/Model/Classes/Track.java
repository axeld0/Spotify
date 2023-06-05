package Model.Classes;

import Model.eNUM.TypeOfTrack;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Track {

    private LocalTime lenght;

    private TypeOfTrack type;

    String pattern = "HH:mm:ss";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
    /**vconstructor**/
    public Track(String lenght, TypeOfTrack type) {
        this.lenght = LocalTime.parse(lenght,formatter);
        this.type = type;
    }

    public Track()
    {
        lenght = LocalTime.MIN;
        type= TypeOfTrack.DEFAULT;
    }

    /**getters and setters**/

    public LocalTime getLenght() {
        return lenght;
    }

    public void setLenght(LocalTime lenght) {
        this.lenght = lenght;
    }

    public TypeOfTrack getType() {
        return type;
    }

    public void setType(TypeOfTrack type) {
        this.type = type;
    }

    /**equals and hashcode**/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Track track)) return false;

        if (getLenght() != null ? !getLenght().equals(track.getLenght()) : track.getLenght() != null) return false;
        return getType() == track.getType();
    }

    @Override
    public int hashCode() {
        int result = getLenght() != null ? getLenght().hashCode() : 0;
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        return result;
    }


    /**toString**/

    @Override
    public String toString() {
        return "Track{" +
                "lenght=" + lenght +
                ", type=" + type +
                '}';
    }


}
