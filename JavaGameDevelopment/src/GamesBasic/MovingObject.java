package GamesBasic;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/*
class movingobject extends JPanel implements ActionListener,KeyListener{
     Timer tm = new Timer(5,this);
     Image image = new ImageIcon("src/newimage.png").getImage();
     int x = 0,y= 0 ,velx = 0,vely = 0;
     public movingobject()
     {
         tm.start();
         addKeyListener(this);
         setFocusable(true);
         setFocusTraversalKeysEnabled(false);
        //setBackground(Color.pink);
        
     }
     @Override
   // public void paintComponent(Graphics g){
     public void paint(Graphics g){
        //super.paintComponent(g);
        super.paint(g);
       g.setColor(Color.blue);
     
        //g.fillRect(x, y, 50, 30);
        g.drawImage(image, x, y, this);
       // g.setColor(Color.black);
        //g.fillOval(x, y, 50, 50);
       
       
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if(x<0){
            velx = 0;
            x = 0;
        }
        if(x>530){
            velx = 0;
            x = 530;
        }
        
        if(y<0){
            vely = 0;
            y = 0;
        }
        if(y>330){
            vely = 0;
            y = 330;
        }
        x = x + velx;
        y = y + vely;
        repaint();
    }
   
   
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int c = e.getKeyCode();
        if(c ==e.VK_LEFT)
        {
           velx = -1;
           vely =  0;
        }
        if(c == e.VK_UP)
        {
            velx =  0;
            vely = -1;  
        }
        if(c == e.VK_RIGHT)
        {
            velx = 1;
            vely = 0;
        }
         if(c == e.VK_DOWN)
        {
            velx = 0;
            vely = 1;
        }
       
    }

    @Override
    public void keyReleased(KeyEvent e) {
       
        velx = 0;
        vely = 0;
    }
 public static void main(String[] args) { 
        //JPanel pn = new JPanel();
        movingobject ob1 = new movingobject();
        JFrame ob = new JFrame();
       
     
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setTitle("Moving Object");
        ob.setSize(600,500);
        ob.setLocation(300,200);
     
        ob.setVisible(true); 
        //ob.add(pn);
        
        ob.add(ob1);
    }

}
 
 */
class movingobject extends JFrame implements ActionListener {

    Timer tm = new Timer(3, this);
    Image image = new ImageIcon("src/newimage.png").getImage();
    int x = 5, y = 30, velx = 0, vely = 0;
    Container c;
    class Al extends KeyAdapter {

        public void keyPressed(KeyEvent e) {
            int c = e.getKeyCode();
            if (c == e.VK_LEFT) {
                velx = -1;
                vely = 0;
            }
            if (c == e.VK_UP) {
                velx = 0;
                vely = -1;
            }
            if (c == e.VK_RIGHT) {
                velx = 1;
                vely = 0;
            }
            if (c == e.VK_DOWN) {
                velx = 0;
                vely = 1;
            }

        }

        @Override
        public void keyReleased(KeyEvent e) {

            velx = 0;
            vely = 0;
        }
    }

    movingobject() {
        c  = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.green);
        
        tm.start();
        
        JPanel panel = new JPanel();
        panel.setBounds(0,0,550,380);
        panel.setBackground(Color.black);
       
        
        
        panel.addKeyListener(new Al());
        panel.setFocusable(true);
        panel.setFocusTraversalKeysEnabled(false);
        setBackground(Color.pink);
        c.add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Moving Object");
        setSize(550, 380);
        setLocation(300, 200);
        setVisible(true);
    }

   @Override
    public void paint(Graphics gh) {
        Image dbimage = createImage(getWidth(), getHeight());
        Graphics dbg = dbimage.getGraphics();
        paintComponents(dbg);
        gh.drawImage(dbimage, 0, 0, this);
    }

    @Override
    public void paintComponents(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(x, y, 50, 30);
        g.fillRect(x+50, y+60, 50, 30);
        repaint();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (x < 0) {
            velx = 0;
            x = 0;
        }
        if (x > 500) {
            velx = 0;
            x = 500;
        }

        if (y < 30) {
            vely = 0;
            y = 30;
        }
        if (y > 340) {
            vely = 0;
            y = 340;
        }
        x = x + velx;
        y = y + vely;
        repaint();
    }
 
    public static void main(String[] args) {

        movingobject ob1 = new movingobject();

    }

}
