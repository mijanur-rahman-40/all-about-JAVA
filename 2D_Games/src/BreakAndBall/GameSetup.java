package BreakAndBall;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GameSetup implements Runnable, KeyListener {

    DisPlay display;
    private String title;
    private int height, weight;
    private Thread thread;
    private BufferStrategy buffer;
    private Graphics g;
    private int ballx = 160 + 40, bally = 390 + 40;
    int movex = 1, movey = -1;
    int batx = 160, baty = 443;
    boolean left, right;
    //array for bricks
    private Rectangle[] bricks;
    int brickx = 32, bricky = 50;
    int scores;
    boolean scor = false;
    boolean gameover;

    Rectangle Ball = new Rectangle(ballx, bally, 20, 20);
    Rectangle Bat = new Rectangle(batx, baty, 100, 20);

    GameSetup(String title, int height, int weight) {
        this.title = title;
        this.height = height;
        this.weight = weight;
        scores = 0;
        gameover = false;
    }

    public void init() {
        display = new DisPlay(title, height, weight);
        display.frame.addKeyListener(this);
        bricks = new Rectangle[29];

        for (int i = 0; i < bricks.length; i++) {
            bricks[i] = new Rectangle(brickx, bricky, 50, 20);
            if (i == 7) {
                brickx = 30;
                bricky = 50 + 40;
            }
            if (i == 13) {
                brickx = 50;
                bricky = 50 + 40 + 40;
            }
            if (i == 18) {
                brickx = 70;
                bricky = 50 + 40 + 40 + 40;
            }
            if (i == 22) {
                brickx = 90;
                bricky = 50 + 40 + 40 + 40 + 40;
            }
            if (i == 25) {
                brickx = 110;
                bricky = 50 + 40 + 40 + 40 + 40 + 40;
            }
            if (i == 27) {
                brickx = 130;
                bricky = 50 + 40 + 40 + 40 + 40 + 40 + 40;
            }
            if (i == 28) {
                brickx = 150;
                bricky = 50 + 40 + 40 + 40 + 40 + 40 + 40 + 40;
            }
            brickx += 60;
        }
    }

    public void draw() {
        buffer = display.canvas.getBufferStrategy();
        if (buffer == null) {
            display.canvas.createBufferStrategy(3);
            return;
        }
        g = buffer.getDrawGraphics();
        g.clearRect(0, 0, weight, height);

        // draw here
        g.setColor(Color.DARK_GRAY);
        g.fillRect(20, 20, 430, 445);

        if (!gameover) {
            //draw ball
            drawBall(g);
            drawBat(g);
            drawbricks(g);
            drawscore(g);
        } else {
            if (scores == 28) {
                gameover(g);
            }
            g.setColor(Color.red);
            g.setFont(new Font("Arial", Font.BOLD, 50));
            g.drawString("Game Over", 100, 260);
        }
        buffer.show();
        g.dispose();
    }

    public void drawBall(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(Ball.x, Ball.y, Ball.width, Ball.height);
    }

    public void drawscore(Graphics g) {
        if (scor) {
            g.setFont(new Font("Arial", Font.BOLD, 50));
            g.setColor(Color.ORANGE);
            g.drawString("Score : ", 110, 350);
            g.setColor(Color.white);
            g.drawString("" + scores, 290, 352);
        }
    }

    public void gameover(Graphics g) {
        g.setColor(Color.BLUE);
        g.setFont(new Font("Arial", Font.BOLD, 50));
        g.drawString("You Completed Successfully", 80, 300);
    }

    public void drawbricks(Graphics g) {
        for (int i = 0; i < bricks.length; i++) {
            if (bricks[i] != null) {
                if (i % 2 == 0) {
                    g.setColor(Color.yellow);
                    g.fillRect(bricks[i].x, bricks[i].y, 50, 20);
                } else {
                    g.setColor(Color.blue);
                    g.fillRect(bricks[i].x, bricks[i].y, 50, 20);
                }
            }
        }

    }

    public void drawBat(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(Bat.x, Bat.y, Bat.width, Bat.height);
    }

    public void tick() {
        if (Ball.x >= 435 || Ball.x <= 20) {
            movex = -movex;
        }
        if (Ball.y <= 22) {
            movey = -movey;
        }
        if (Ball.y >= 450) {
            gameover = true;
        }
        // Bat right and Left
        if (right) {
            if (Bat.x <= 355) {
                Bat.x += 2;
            }

        }
        if (left) {
            if (Bat.x >= 17) {
                Bat.x -= 2;
            }
        }

        //ball and bat collision
        if (Bat.intersects(Ball)) {
            movey = -movey;
        }

        // ball and bricks collision
        for (int i = 0; i < bricks.length; i++) {
            if (bricks[i] != null) {
                if (bricks[i].intersects(Ball)) {
                    movey = -movey;
                    bricks[i] = null;
                    scores++;
                }
            }
            scor = true;
        }

        Ball.x += movex;
        Ball.y += movey;
    }

    public synchronized void start() {
        thread = new Thread(this);
        thread.start();
    }

    public synchronized void stop() {
        try {
            thread.join();
        } catch (InterruptedException ex) {

        }
    }

    @Override
    public void run() {
        init();

        while (true) {
            thread.currentThread();
            try {
                thread.sleep(5);
            } catch (InterruptedException ex) {
            }
            draw();
            tick();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int source = e.getKeyCode();
        if (source == KeyEvent.VK_RIGHT) {
            right = true;
        }
        if (source == KeyEvent.VK_LEFT) {
            left = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int source = e.getKeyCode();
        if (source == KeyEvent.VK_RIGHT) {
            right = false;
        }
        if (source == KeyEvent.VK_LEFT) {
            left = false;
        }
    }
}
