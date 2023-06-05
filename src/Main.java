import Model.Classes.PlayList;
import Model.Classes.Track;
import Model.Classes.User;
import Model.JSON.JSONController;
import Model.eNUM.TypeOfTrack;

public class Main {
    public static void main(String[] args) {
        PlayList playList1 = new PlayList();
        playList1.agregarTema(new Track("03:22:00", TypeOfTrack.PODCAST));
        playList1.agregarTema(new Track("03:24:00", TypeOfTrack.PODCAST));
        playList1.agregarTema(new Track("03:02:00", TypeOfTrack.PODCAST));

        User user1 = new User();
        int key1 = user1.addPlaylist(playList1);
        System.out.println("key1 : "+ key1);

        JSONController jsonController = new JSONController();
        jsonController.JSONtoFile(user1);

    }
}