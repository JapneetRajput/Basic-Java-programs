import java.applet.Applet ;
import java.awt.*;
/* <applet code ="TrafficSignal.class" width="400" height="400">
</applet>
*/
public class TrafficSignal extends Applet 
{
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		g.fillRect(150,50,100,300);
		g.setColor(Color.gray);
		g.fillRect(190,350,20,200);
		g.setColor(Color.red);
		g.fillOval(160,60,80,80);
		g.setColor(Color.yellow);
		g.fillOval(160,160,80,80);
		g.setColor(Color.green);
		g.fillOval(160,260,80,80);
		
	}
}