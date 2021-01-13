package OurGenericClassPart3_4;

import java.util.ArrayList;

public class Team <T extends Player> implements Comparable<Team<T>>{ //For |extends Player| this only takes objects that extends from player
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if(members.contains(player)) {
            //System.out.println(((Player)player).getName() + " already in the name"); //Type cast
            //if team extends from player than we do not need the type cast any more
            System.out.println(player.getName() + " already in the name");
            return false;
        }
        else {
            members.add(player);
            //System.out.println(((Player)player).getName() + " picked for team " + this.name);//Type cast
            //if team extends from player than we do not need the type cast any more
            System.out.println(player.getName() + " already in the name");
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int thereScore) { //?????????????????????????????????? <T>
        String message;

        if(ourScore > thereScore) {
            won++;
            message = " beat ";
        }
        else if(ourScore == thereScore) {
            tied++;
            message = " drew with ";
        }
        else {
            lost++;
            message = " lost to ";
        }
        played++;
        if(opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, thereScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) { //???????????????????????????
        if(this.ranking() > team.ranking()) {
            return -1;
        }
        else if(this.ranking() < team.ranking()) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
