package GenericsChallenge_5;

public class Main {
    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballlLeague = new League<>("AFL");
        Team <FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows"); // This only takes football class
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);
        adelaideCrows.matchResult(fremantle, 2, 1);

        footballlLeague.add(adelaideCrows);
        footballlLeague.add(melbourne);
        footballlLeague.add(hawthorn);
        footballlLeague.add(fremantle);

        //footballlLeague.add(baseballTeam);
        footballlLeague.showLeagueTable();

        //And more on
    }
}
