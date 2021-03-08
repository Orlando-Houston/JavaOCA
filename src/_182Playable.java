import java.util.ArrayList;
import java.util.List;

class  Player{}

public interface _182Playable {
    public void play();
    public void setPlayers(List<Player> players);
}
class Game implements _182Playable{

    private List<Player>players;

    public List<Player>getPlayers(){
        return players;
    }

    public void setPlayers(List<Player>players){
        this.players=players;
    }
    public void play(){
        System.out.println ("Played");
    }

    public static void main(String[] args) {
        _182Playable p=new Game();
        List<Player>players=new ArrayList<> ();
        p.setPlayers (players);
        p.play ();
    }


}
