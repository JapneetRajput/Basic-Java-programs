import java.applet.Applet ;
import java.awt.*;
/* <applet code ="House.class" width="400" height="400">
</applet>
*/
public class House extends Applet 
{
	public void paint(Graphics g)
	{
		g.setColor(Color.yellow);
		g.fillRect(100,100,150,150);
        g.setColor(Color.black);
		g.fillRect(150,175,50,75);
		int x[]={100,175,250};
	    int y[]={100,25,100};
		g.setColor(Color.red);
	    g.fillPolygon(x,y,3);
	}
}



