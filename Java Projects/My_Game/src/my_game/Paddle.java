package my_game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;

public class Paddle {

    int x, y, id, yDirection;

    Rectangle paddle;

    public Paddle(int x, int y) {
        this.x = x;
        this.y = y;

        paddle = new Rectangle(x, y, 180, 25);
    }

    public void mouseMoved(MouseEvent e) {

        paddle.x = e.getX() - 120;
    }

    public void draw(Graphics g) {

        g.setColor(Color.red);
        g.fillRect(paddle.x, paddle.y, paddle.width, paddle.height);

    }
}
