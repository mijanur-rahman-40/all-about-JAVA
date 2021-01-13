package SkyForce;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class GameManager {

    private Players player;
    public static ArrayList<Bullet> bullet;
    private ArrayList<Enemy> enimes;
    private long current;
    private long delay;
    private int health;
    private Scores score;
    private int scores;

    public void init() {
        player = new Players(180, 355);
        score = new Scores();
        player.init();
        bullet = new ArrayList<Bullet>();
        enimes = new ArrayList<Enemy>();
        current = System.nanoTime();
        delay = 800;
        health = player.getHealth();
        scores = 0;
    }

    public void tick() {
        player.tick();

        //bullet
        for (int i = 0; i < bullet.size(); i++) {
            bullet.get(i).tick();
        }

        //enimes
        long breaks = (System.nanoTime() - current) / 1000000;
        if (breaks > delay) {
            for (int i = 0; i < 2; i++) {
                Random rand = new Random();
                int randx = rand.nextInt(400);
                int randy = rand.nextInt(400);
                if (health > 0) {
                    enimes.add(new Enemy(randx, -randy));
                }
            }
            current = System.nanoTime();
        }
        for (int i = 0; i < enimes.size(); i++) {
            enimes.get(i).tick();
        }
    }

    public void render(Graphics g) {
        player.render(g);
        score.render(g);

        //bullet
        for (int i = 0; i < bullet.size(); i++) {
            bullet.get(i).render(g);
        }
        for (int i = 0; i < bullet.size(); i++) {
            if (bullet.get(i).getY() <= 2) {
                bullet.remove(i);
                i--;
            }
        }

        //enimes
        for (int i = 0; i < enimes.size(); i++) {
            if (!(enimes.get(i).getX() <= 2 || enimes.get(i).getX() >= 375
                    || enimes.get(i).getY() <= 2 || enimes.get(i).getY() >= 365)) {
                enimes.get(i).render(g);
            }
        }

        /* 
        law
        if(r1.x < r2.x + width && r1.x + width > r2.x
        && r1.y < r2.y + width && r1.y + width > r2.y)
        r1 = player,r2 = enimes
         */
        //Enimies
        for (int i = 0; i < enimes.size(); i++) {
            int enimieX = enimes.get(i).getX();
            int enimieY = enimes.get(i).getY();
            int playerX = player.getX();
            int playery = player.getY();
            if (playerX < enimieX + 30 && playerX + 30 > enimieX
                    && playery < enimieY + 30 && playery + 30 > enimieY) {
                enimes.remove(i);

                i--;
                health--;

                if (health <= 0) {
                    enimes.removeAll(enimes);
                    player.setHealth(0);

                }
                score.setlife(health);
            }

            //Bullets
            for (int j = 0; j < bullet.size(); j++) {
                int bulletX = bullet.get(j).getX();
                int bulletY = bullet.get(j).getY();

                if (enimieX < bulletX + 6 && enimieX + 50 > bulletX
                        && enimieY < bulletY + 6 && enimieY + 50 > bulletY) {
                    enimes.remove(i);
                    i--;
                    bullet.remove(j);
                    j--;
                    scores++;
                    score.setPoints(scores);

                }

            }
        }
    }
}
