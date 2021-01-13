package Method_6;

public class Method_6 {
    public static void main(String[] args) {
        
        CalculateScore(true, 800, 5, 100);
        CalculateScore(true, 10000, 8, 200);
    }
    
    public static int CalculateScore(boolean gameOver, int score, int levelComplete, int bonus) {
    
        if(gameOver) {
            int finalscore = score + (levelComplete * bonus);
            finalscore += 2000;
            System.out.println("Your final score was "+finalscore);
            return finalscore;
        }
        return -1;
    }
}
