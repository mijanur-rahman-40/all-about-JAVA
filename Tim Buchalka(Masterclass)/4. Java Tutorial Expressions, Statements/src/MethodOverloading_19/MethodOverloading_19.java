package MethodOverloading_19;

public class MethodOverloading_19 {
    public static void main(String[] args) {
        
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is : "+newScore);
        newScore = calculateScore(500, "jahid");
        System.out.println("New score is : "+newScore);
        calculateScore(500);
        calculateScore(1234567891011121314L);
        calculateScore();
    }
    
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored "+ score + " points ");
        return score * 1000;
    }
    public static int calculateScore(int score, String playerName) {
        System.out.println("Player " + playerName + " scored " + score + " points ");
        return score * 1000;
    }
    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points(int)");
        return score * 1000;
    }
    public static long calculateScore(long score) {
        System.out.println("Unnamed Player scored " + score + " points(long)");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("no parameter");
        return 0;
    }
    /*
    public static void calculateScore() {
        System.out.println("no parameter");
    }
    This is not valid only change in return type
    */
}
