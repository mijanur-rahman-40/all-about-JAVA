
package GamesBasic;

public class MyGameBasic {
    /*
class Game extends JFrame implements ActionListener, KeyListener, Runnable {

    int frameWidth = 700, frmaeHeight = 500;
    Thread thread = null;
    int paddlex = 200, paddley = 450;
    int paddleWidth = 250, paddleHeight = 50;
    int ballx = 350, bally = 350, ball_1x = 100, ball_1y = 100;
    int ballDiameter = 50;
    boolean up = false, right = true;
    Timer tm = new Timer(1, this);
    int velx = 0, vely = 0;
    boolean collision = true;
    Rectangle rect1, rect2;
    Font fon = new Font("Arial", Font.BOLD, 34);
    int count = 0;
    boolean ball1 = true, ball2 = true, ball3 = true;

    Game() {
        this.setBounds(100, 100, frameWidth, frmaeHeight);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        ImageIcon newImage1 = new ImageIcon("src/images.jpg");
        Image img = newImage1.getImage();
        addKeyListener(this);
        tm.start();
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void paint(Graphics gh) {
        Image dbimage = createImage(getWidth(), getHeight());
        Graphics dbg = dbimage.getGraphics();
        paintComponents(dbg);
        gh.drawImage(dbimage, 0, 0, this);
    }

    @Override
    public void paintComponents(Graphics gh) {

        Rectangle rec1 = new Rectangle(ballx, bally, ballDiameter, ballDiameter);
        Rectangle rec2 = new Rectangle(ball_1x, ball_1y, ballDiameter, ballDiameter);

        Graphics2D g2d = (Graphics2D) gh;
        gh.setColor(Color.darkGray);
        gh.fillRect(0, 0, frameWidth, frmaeHeight);

        gh.setColor(Color.red);
        gh.fillOval(rec1.x, rec1.y, ballDiameter, ballDiameter);
        gh.setColor(Color.blue);
        gh.fillOval(rec2.x, rec2.y, ballDiameter, ballDiameter);

        ImageIcon newImage2 = new ImageIcon("src/g.jpg");
        Image img1 = newImage2.getImage();

        g2d.drawImage(img1, 100, 100, this);
        g2d.drawImage(img1, 300, 100, this);
        g2d.drawImage(img1, 500, 100, this);
        g2d.setColor(Color.yellow);
        g2d.fillOval(103, 90, 90, 30);
        g2d.setColor(Color.red);
        g2d.fillOval(303, 90, 90, 30);
        g2d.setColor(Color.blue);
        g2d.fillOval(503, 90, 90, 30);

        //gh.drawImage(img, rec2.x, rec2.y, this);
        gh.setColor(Color.green);
        //gh.fillRect(paddlex, paddley, paddleWidth, paddleWidth);
        gh.fill3DRect(paddlex, paddley, paddleWidth, paddleWidth, right);

    }

    @Override
    public void run() {
        while (true) {
            if (up) {
                bally--;

            } else {
                bally++;

            }
            if (right) {
                ballx++;

            } else {
                ballx--;

            }
            if (ballx < 0) {
                right = true;
            }

            if (ballx > (frameWidth - ballDiameter)) {
                right = false;
            }

            if (bally < 0) {
                up = false;
            }

            if (bally > frmaeHeight - ballDiameter) {
                up = true;
            }

            if (ballx > paddlex && ballx < (paddlex + paddleWidth)
                    && bally > paddley - ballDiameter) {
                up = true;
            }

            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            repaint();
        }
    }

    public static void main(String[] args) {
        Game ob = new Game();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {

        int c = e.getKeyCode();
        if (c == e.VK_LEFT) {
            velx = -1;
            vely = 0;
        }
        if (c == e.VK_RIGHT) {
            velx = 1;
            vely = 0;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        velx = 0;
        vely = 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (paddlex < 0) {
            velx = 0;
            paddlex = 0;
        }
        if (paddlex > 445) {
            velx = 0;
            paddlex = 445;
        }
        paddlex = paddlex + velx;

        repaint();
    }
}
 */
}
