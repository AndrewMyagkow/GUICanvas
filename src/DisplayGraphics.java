import java.awt.*;
import javax.swing.JFrame;

public class DisplayGraphics extends Canvas{


    public void paint(Graphics g) {

       setBackground(Color.white);
        int xpoints[] = {200,200,130};
        int ypoints[] = {150, 220,150};
        int npoints = 3;
        int xpoints5[] = {380,380,450};
        int ypoints5[] = {150, 220,150};
        int npoints5 = 3;
        int xpoints1[] = {200,200,130};
        int ypoints1[] = {260, 330,260};
        int npoints1 = 3;
        int xpoints4[] = {380,380,450};
        int ypoints4[] = {260, 330,260};
        int npoints4 = 3;
        int xpoints2[] = {200,200,130};
        int ypoints2[] = {370, 440,370};
        int npoints2 = 3;
        int xpoints3[] = {380,380,450};
        int ypoints3[] = {370, 440,370};
        int npoints3 = 3;

        g.fillPolygon(xpoints, ypoints, npoints);
        g.fillPolygon(xpoints1, ypoints1, npoints1);
        g.fillPolygon(xpoints2, ypoints2, npoints2);
        g.fillPolygon(xpoints3, ypoints3, npoints3);
        g.fillPolygon(xpoints4, ypoints4, npoints4);
        g.fillPolygon(xpoints5, ypoints5, npoints5);
        g.fillRoundRect(275, 490,35,50,10,10);
        g.fillRoundRect(205, 100,170,380,10,10);
        g.setColor(Color.RED);
        g.fillOval(250,150,80,80);
        g.setColor(Color.yellow);
        g.fillOval(250,250,80,80);
        g.setColor(Color.green);
        g.fillOval(250,350,80,80);





    }
    public static void main(String[] args) {
        DisplayGraphics m=new DisplayGraphics();
        JFrame f=new JFrame();
        f.add(m);
        f.setSize(600,600);
        f.setVisible(true);
    }

}  