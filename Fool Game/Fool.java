import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Fool extends JFrame implements MouseListener,ActionListener
{
	private JLabel fool,l1;
	private JButton yes, no,playagain,quit;
	private JPanel panel;
	
   public Fool(){
	super("Fool Game");
	this.setSize(800,550);
	this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	
	panel = new JPanel();
	panel.setLayout(null);
		
    fool = new JLabel("Are you a fool?");
	fool.setBounds(260, 120, 600, 40);
	fool.setForeground(Color.GRAY);
	fool.setFont(new Font("Constantia", 0, 38));
	panel.add(fool);
		
	yes = new JButton("Yes");
	yes.setBounds(260, 220, 80, 40);
	yes.setBackground(Color.GREEN);
	yes.addActionListener(this);
	panel.add(yes);
		
	no = new JButton("No");
	no.setBounds(430, 220, 80, 40);
	no.setBackground(Color.RED);
	no.addMouseListener(this);
	no.addActionListener(this);
	panel.add(no);
	
	l1 = new JLabel(" ");
	l1.setBounds(260, 320, 600, 40);
	l1.setForeground(Color.GRAY);
	l1.setFont(new Font("Constantia", 0, 38));
	panel.add(l1);
	
	playagain = new JButton("Play Again");
	playagain.setBounds(220, 380, 150, 40);
	playagain.setBackground(Color.GRAY);
	playagain.setFont(new Font("Constantia", 0, 25));
	playagain.addActionListener(this);
	panel.add(playagain);
		
	quit = new JButton("Quit");
	quit.setBounds(450, 380, 100, 40);
	quit.setBackground(Color.GRAY);
	quit.setFont(new Font("Constantia", 0, 25));
	quit.addActionListener(this);
	panel.add(quit);
	
	
	this.add(panel);
   }
    public void mouseClicked(MouseEvent m){}
	public void mousePressed(MouseEvent m){}
	public void mouseReleased(MouseEvent m){}
    public void mouseEntered(MouseEvent m)
 
    {
        Random r = new Random();
        no.setLocation(r.nextInt(350), r.nextInt(350));
    }
	public void mouseExited(MouseEvent m){}
	
	public void actionPerformed(ActionEvent a)
	{
		String btn = a.getActionCommand();
		
		if(btn.equals("Yes"))
		{
			l1.setText("You are a fool");
		}
		else if(btn.equals("No"))
		{
			l1.setText("You are not a fool");
		}
		else if(btn.equals("Play Again"))
		{
			Fool f = new Fool();
		    f.setVisible(true);
			this.setVisible(false);
		}
		
		else if(btn.equals("Quit")){
			
			System.exit(0); 
		
			
		}
	}
	
}   