package my_game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main extends JFrame {

    Image dbImage;
    Graphics dbg;
    Font fon = new Font("Arial", Font.BOLD, 30);

    //Ball Objects
    static Ball_1 b1 = new Ball_1(10, 300);
    static Ball_2 b2 = new Ball_2(300, 400);
    static Ball_3 b3 = new Ball_3(30, 400);
    static Ball_4 b4 = new Ball_4(550, 30);
    static Ball_5 b5 = new Ball_5(100, 40);
    static Ball_6 b6 = new Ball_6(300, 40);

    //Variable for screen size
    int GHeight = 600, GWeidth = 500;

    //Menu Button
    Rectangle startButton = new Rectangle(200, 190, 160, 40);
    Rectangle difficultyButton = new Rectangle(200, 250, 160, 40);

    //Dimension of G_height*G_weidth
    Dimension screensize = new Dimension(GHeight, GWeidth);

    Thread ball_1 = new Thread(b1);
    Thread ball_2 = new Thread(b2);
    Thread ball_3 = new Thread(b3);
    Thread ball_4 = new Thread(b4);
    Thread ball_5 = new Thread(b5);
    Thread ball_6 = new Thread(b6);

    Paddle p = new Paddle(190, 450);

    boolean gameStarted = false;
    boolean startHover;
    boolean quitHover;

    boolean harddifficulty = false;

    public Main() {

        this.setBackground(Color.DARK_GRAY);
        this.setTitle("Marvel Bagging");
        this.setSize(screensize);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.addMouseListener(new Mousehandler());
        this.addMouseMotionListener(new Mousemotion());

    }

    public void startGame() {
        gameStarted = true;
        ball_1.start();
        ball_2.start();
        ball_3.start();
        ball_4.start();
        ball_5.start();
        ball_6.start();

    }

    public static void main(String[] args) {
        Main ob = new Main();
    }

    @Override
    public void paint(Graphics g) {
        dbImage = createImage(getWidth(), getHeight());
        dbg = dbImage.getGraphics();
        draw(dbg);
        g.drawImage(dbImage, 0, 0, this);
    }

    public void draw(Graphics g) {
// Start Game
        if (!gameStarted) {
            g.setFont(new Font("Arial", Font.BOLD, 30));
            g.setColor(Color.pink);
            g.drawString("Marvel Bagging", 165, 160);
            if (!startHover) {
                g.setColor(Color.pink);
            } else {
                g.setColor(Color.green);
            }
            g.fillRect(startButton.x, startButton.y, startButton.width, startButton.height);
            g.setColor(Color.black);
            g.setFont(new Font("Arial", Font.BOLD, 22));
            g.drawString("Start Game", startButton.x + 17, startButton.y + 25);
            if (!quitHover) {
                g.setColor(Color.red);
            } else {
                g.setColor(Color.MAGENTA);
            }
            g.fillRect(difficultyButton.x, difficultyButton.y, difficultyButton.width, difficultyButton.height);
            g.setColor(Color.yellow);
            g.setFont(new Font("Arial", Font.BOLD, 22));

            g.drawString("Difficulty:", difficultyButton.x + 4, difficultyButton.y + 25);
            if (!harddifficulty) {
                g.setColor(Color.blue);
                g.drawString("Easy", difficultyButton.x + 102, difficultyButton.y + 27);
            } else {
                g.setColor(Color.black);
                g.drawString("Hard", difficultyButton.x + 102, difficultyButton.y + 27);
            }

        } else {
            b1.draw(g);
            b2.draw(g);
            b3.draw(g);
            b4.draw(g);
            b5.draw(g);
            b6.draw(g);

            ImageIcon newImage2 = new ImageIcon("src/g.jpg");
            Image img1 = newImage2.getImage();
            g.drawImage(img1, 80, 150, this);
            g.drawImage(img1, 400, 150, this);
//draw bag
            g.setColor(Color.blue);
            g.fillOval(83, 139, 90, 30);
            g.setColor(Color.yellow);
            g.fillOval(403, 140, 90, 30);
//Draw Ball
            b1.p.draw(g);
            b2.p.draw(g);
            b3.p.draw(g);
            b4.p.draw(g);
            b5.p.draw(g);
            b6.p.draw(g);
//Score
            g.setColor(Color.blue);
            g.setFont(new Font("Arial", Font.BOLD, 24));
            int sum_1 = b1.p1Score + b2.p2Score;
            int sum_2 = b3.p3Score + b4.p4Score + b5.p5Score +b6.p6Score;
            g.drawString("Score Loss Blue : " + sum_1, 30, 400);
            g.setColor(Color.yellow);
            g.drawString("Score Loss Yellow : " + sum_2, 320, 400);

        }
        repaint();
    }

    public class Mousemotion extends MouseAdapter {

        @Override
        public void mouseMoved(MouseEvent e) {
            b1.p.mouseMoved(e);
            b2.p.mouseMoved(e);
            b3.p.mouseMoved(e);
            b4.p.mouseMoved(e);
            b5.p.mouseMoved(e);
            b6.p.mouseMoved(e);
            repaint();
        }
    }

    public class Mousehandler extends MouseAdapter {

        @Override
        public void mouseMoved(MouseEvent e) {
            int mx = e.getX();
            int my = e.getY();
            if (mx > startButton.x && mx < startButton.x + startButton.width
                    && my > startButton.y && my < startButton.y + startButton.height) {
                startHover = true;
            } else {
                startHover = false;
            }
            if (mx > difficultyButton.x && mx < difficultyButton.x + difficultyButton.width
                    && my > difficultyButton.y && my < difficultyButton.y + difficultyButton.height) {
                quitHover = true;
            } else {
                quitHover = false;
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            int mx = e.getX();
            int my = e.getY();
            if (mx > startButton.x && mx < startButton.x + startButton.width
                    && my > startButton.y && my < startButton.y + startButton.height) {
                startGame();
            }
            if (mx > difficultyButton.x && mx < difficultyButton.x + difficultyButton.width
                    && my > difficultyButton.y && my < difficultyButton.y + difficultyButton.height) {
                if (!harddifficulty) {

                    b1.setDifficulty(2);
                    b2.setDifficulty(2);
                    b3.setDifficulty(2);
                    b4.setDifficulty(2);
                    b5.setDifficulty(2);
                    b6.setDifficulty(2);

                    harddifficulty = true;
                } else {
                    harddifficulty = false;

                    b1.setDifficulty(8);
                    b2.setDifficulty(8);
                    b3.setDifficulty(8);
                    b4.setDifficulty(8);
                    b5.setDifficulty(8);
                    b6.setDifficulty(8);
                }
            }
        }
    }
}
