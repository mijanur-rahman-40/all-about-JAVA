package my_game_project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Ball_1 implements Runnable {

//Global variable
    int x, y, xDirection, yDirection;

    Rectangle ball, bag_1;

    boolean col = false;
    int p1Score;

    Paddle p = new Paddle(190, 450);

    int difficulty = 7;

    public Ball_1(int x, int y) {

        p1Score = 0;
        this.x = x;
        this.y = y;

        //set ball moving randomely
        Random r = new Random();
        int xrDir = r.nextInt(1);
        if (xrDir == 0) {
            xrDir--;
        }
        setXDirection(xrDir);

        int yrDir = r.nextInt(1);
        if (yrDir == 0) {
            yrDir--;
        }
        setYDirection(yrDir);

        //create 'ball'
        ball = new Rectangle(this.x, this.y, 15, 15);
        bag_1 = new Rectangle(53, 140, 90, 30);

    }

    public void setXDirection(int xdir) {
        xDirection = xdir;
    }

    public void setYDirection(int ydir) {
        yDirection = ydir;
    }

    public void collision() {
        if (ball.intersects(p.paddle)) {
            setYDirection(-1);
        }
        if (ball.intersects(bag_1)) {
            col = true;
        }
    }

    public void move() {
        collision();
        ball.x += xDirection;
        ball.y += yDirection;

        //Bounce the ball when edge is detected
        if (ball.x <= 0) {
            setXDirection(+1);
        }
        if (ball.x >= 585) {
            setXDirection(-1);
        }
        if (ball.y <= 10) {
            setYDirection(+1);
        }
        if (ball.y >= 485) {
            setYDirection(-1);
            p1Score++;
        }
    }

    public void draw(Graphics g) {
        g.setColor(Color.blue);
        g.fillOval(ball.x, ball.y, ball.width, ball.height);
        g.setColor(Color.blue);
        g.setFont(new Font("Arial", Font.BOLD, 30));
        g.drawString("Bagging : ", 50, 70);
        if (col) {
            g.setColor(Color.red);
            g.setFont(new Font("Arial", Font.BOLD, 35));
            g.drawString("YES", 185, 75);
            col = false;
        }

    }

    @Override
    public void run() {
        try {
            while (true) {
                move();
                Thread.sleep(difficulty);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void setDifficulty(int diff) {
        difficulty = diff;
    }
}
