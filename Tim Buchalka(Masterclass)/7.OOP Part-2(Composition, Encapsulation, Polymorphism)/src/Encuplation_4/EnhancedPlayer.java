package Encuplation_4;

public class EnhancedPlayer {
    private String name;
    private int hitPoint = 100;
    private String weapon;

    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.name = fullName;
        if(health > 0 && health <= 100)
            this.hitPoint = health;
        this.weapon = weapon;
    }
    
    public void looseHealth(int damage) {
        this.hitPoint -= damage;
        if(hitPoint <= 0) {
            System.out.println("The player is kocked out");
        }
    }
    
    public int getHealth() {
        return hitPoint;
    }
}
