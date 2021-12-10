import java.applet.Applet ;
import java.awt.*;
/* <applet code ="Jokerface.class" width="400" height="400">
</applet>
*/
public class Jokerface extends Applet 
{
	public void paint(Graphics g)
	{
        g.setColor(Color.BLUE);
		int x[] = {130,200,270};
	    int y[] = {130,0,130};
		g.fillPolygon(x , y , 3);
		g.setColor(Color.yellow);
	    g.fillOval(100,100,200,200);
		g.setColor(Color.black);
		g.drawOval(135,150,30,30);
		g.drawOval(235,150,30,30);
		g.fillOval(145,160,10,10);
		g.fillOval(245,160,10,10);
		g.drawArc(150,225,100,50,180,180);
		g.setColor(Color.red);
		g.fillOval(175,175,50,50);
		
		
		
	}
}