package Lab7;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MainPanel extends JPanel implements KeyListener {

	Player myPlayer = new Player("Bondo", 200,150, "./src/Bondo.jpg");
	Player myEnemy = new Player("Plexi", 0,0, "./src/images/Dog.jpg");
	ImageIcon playerIcon = new ImageIcon(myPlayer.getImagePath());
	ImageIcon enemyIcon = new ImageIcon(myEnemy.getImagePath());
	JButton myButton;
	JButton myButton2;
	Timer myTimer = new Timer(500, new timerListener());
	
	public MainPanel()
	{
		
//		File myFile = new File("");
//		// Im pretty sure this is the root of all my problems right here.
//		Scanner fileScan = new Scanner(myFile);
//
//		// create new instance of ArrayList called "sources", this will be used to
//		// create a list of strings that will be used in a loop in RefPanel.
//		
//
//		// enter a while loop to read each item from source.csv
//		while (fileScan.hasNext()) {
//			String file1 = fileScan.nextLine();
//			urlScan = new Scanner(url);
//			urlScan.useDelimiter(",");
//			// enter a second while loop to
//			while (urlScan.hasNext()) {
//				sources += (urlScan.next());
//			}
//		}
		setPreferredSize(new Dimension(800,800));
		myButton = new JButton("Hi");
		myButton2 = new JButton("Hi");
		myButton.addActionListener(new buttonListener());
		myButton2.addActionListener(new buttonListener());
		addKeyListener(this);
		setFocusable(true);
		add(myButton);
		add(myButton2);
		myTimer.start();
	}
	
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		page.drawImage(playerIcon.getImage(), myPlayer.getX(), myPlayer.getY(), null);
		page.drawImage(enemyIcon.getImage(), myEnemy.getX(), myEnemy.getY(), null);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getKeyCode() == KeyEvent.VK_LEFT)
		{
			myPlayer.setX(myPlayer.getX()-5);
		}
		
		else if(arg0.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			myPlayer.setX(myPlayer.getX()+5);
		}
		
		else if(arg0.getKeyCode() == KeyEvent.VK_UP)
		{
			myPlayer.setY(myPlayer.getY()-5);
		}
		
		else if(arg0.getKeyCode() == KeyEvent.VK_DOWN)
		{
			myPlayer.setY(myPlayer.getY()+5);
		}
	repaint();
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
private class timerListener implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		myEnemy.setX(myEnemy.getX() + 5);
		repaint();
	}
	
}
private class buttonListener implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(arg0.getSource() == myButton)
		{
			System.out.println("button 1 was pressed");
		}
		if(arg0.getSource() == myButton2)
		{
			System.out.println("button 2 was pressed");
		}
		
	}
	
}
}

	