package MethodPart2_7;

public class MethodPart2_7 {
    public static void main(String[] args) {
        
        boolean gameOver = true;
        int score = 800;
        int levelComplete = 5;
        int bonus = 100;
        int highScore = CalculateScore(gameOver, score, levelComplete, bonus);
        System.out.println("Your final score was "+highScore);
        highScore = CalculateScore(true, 10000, 8, 200);   
        System.out.println("Your final score was "+highScore);
    }
    public static int CalculateScore(boolean gameOver, int score, int levelComplete, int bonus) {
    
        if(gameOver) {
            int finalscore = score + (levelComplete * bonus);
            finalscore += 2000;
            return finalscore;
        }
        return -1;
    }
}
