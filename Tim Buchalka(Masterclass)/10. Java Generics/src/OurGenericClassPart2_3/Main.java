package OurGenericClassPart2_3;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckhan = new SoccerPlayer("Beckhan");

        Team <FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows"); // This only takes football class
        adelaideCrows.addPlayer(joe);
        //adelaideCrows.addPlayer(pat);
        //adelaideCrows.addPlayer(beckhan);

        System.out.println(adelaideCrows.numPlayers());

        Team <BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs"); // This only takes baseball class
        baseballTeam.addPlayer(pat);

        /*
        Team<String> brokenTeam = new Team<>("This won't work");
        brokenTeam.addPlayer("No noe");
        */

        Team<SoccerPlayer> brokenTeam = new Team<>("This won't work");
        brokenTeam.addPlayer(beckhan);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);
        //adelaideCrows.matchResult(baseballTeam, 1, 1); //adelaideCrows plays football and baseball team obviously does not play football
    }
}
