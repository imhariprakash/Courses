import java.applet.Applet;
import java.awt.Graphics;

public class Hello extends Applet{

    public void init(){
        resize(200,200);
    }

    public void paint(Graphics g){
        g.drawString("Hello world!",150,150);
    }
}