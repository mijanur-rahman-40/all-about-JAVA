package Encuplation_4;

public class Player {
    String name;
    int health;
    String weapon;
    
    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0)
            System.out.println("Player nocked ");
    }
    
    public int healthRemaining() {
        return this.health;
    }
}
