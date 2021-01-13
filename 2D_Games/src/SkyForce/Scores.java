package SkyForce;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Scores {

    public int point, life = 10;

    public Scores() {
        this.point = point;

    }

    public void setPoints(int pt) {
        point = pt;
    }

    public void setlife(int lf) {
        life = lf;
    }

    public void render(Graphics g) {

        g.setColor(Color.red);
        g.setFont(new Font("Arial", Font.BOLD, 25));
        g.drawString("Your point : ", 15, 465);
        g.drawString("Life Time : ", 220, 465);
        g.setColor(Color.yellow);

        //Points
        g.setFont(new Font("Arial", Font.BOLD, 40));
        g.drawString("" + point, 152, 470);
        g.drawString("" + life, 350, 470);

        if (life == 0) {
            g.setColor(Color.RED);
            g.setFont(new Font("Aroal", Font.BOLD, 60));
            g.drawString("Game Over", 40, 220);
        }

    }
}
