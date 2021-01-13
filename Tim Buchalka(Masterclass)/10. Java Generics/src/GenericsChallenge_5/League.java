package GenericsChallenge_5;

import java.util.ArrayList;
import java.util.Collections;

public class League <T extends Team>{
    public String name;
    private ArrayList<T> leageue = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team) {
        if(leageue.contains(team)) {
            return false;
        }
        leageue.add(team);
        return true;
    }

    public void showLeagueTable() { //?????????????????????????????????
        Collections.sort(leageue);
        for(T t:leageue) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
