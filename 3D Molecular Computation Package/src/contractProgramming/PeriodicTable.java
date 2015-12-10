package chemistry;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import MainScreen.Main;
import Paint.makeApplet;
import utilities.UseChem;

public class PeriodicTable extends Applet implements MouseListener, ActionListener{
	UseChem use = new UseChem();
	JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    Main m = new Main();
    makeApplet a = new makeApplet();
    //Graphics g = panel.getGraphics();
    public PeriodicTable(){
       
    }
    
    public void main(){
       
    	setPanel();
    	initApp();
        
       // play.paintComponent(getGraphics());
    }
    Applet app = new Applet();
    public void initApp(){
    	Graphics g = frame.getGraphics(); 
    	a.paint(g);
        app = a.returnApplet();
        app.setSize(new Dimension(1920,1080));
        app.start();
        app.setVisible(true);
        app.addMouseListener(this);
        panel.add(app);
        
        
    }
    public void setPanel(){
       
    	panel.setLayout(null);
        frame.add(panel);
        frame.setLayout(null);
        panel.setBounds(0,0,1920,1080);
        frame.setVisible(true);
        panel.setVisible(true);
        panel.setFocusable(true);
        frame.setSize(1920,1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
        
    }

 	// The X-coordinate and Y-coordinate of the last click.
 	int xpos;
 	int ypos;
	
 	// The variable that will tell whether or not the mouse
 	// is in the applet area.
 	boolean mouseEntered;
	
 	
 	TextField q;
 	Button addItems;
 	int amount;
 	
 	int element;
 
 	public void init(){
 		if(element != 0){
  			q = new TextField(2);
  			add(q);
  			addItems = new Button("ADD");
  			add(addItems);
  			addItems.addActionListener(this);	
 		}
 	}
 	
 	public void actionPerformed(ActionEvent e){
    	
 	}
 	
 	public void aq(){
	  	Object[] possibilities = null;
		String s = (String)JOptionPane.showInputDialog(
        	frame,
            "Please enter the quantity of the element.",
            "Enter Quantity",
            JOptionPane.QUESTION_MESSAGE,
            null,
            possibilities,
        "");
        //int amountOf = Integer.parseInt(s);
        System.out.println(s);
        use.addElement(use.getElement(element), s);
 	}
	
 	public void mouseClicked (MouseEvent me) {
  		xpos = me.getX();
  		ypos = me.getY();
  		
  		//System.out.println("Mouse clicked");
		//Calculate
  		if(200 < xpos && xpos<300 && 150 < ypos && ypos< 150+125){
  			Object[] d = new Object[2];
  			d=use.run();
  			JOptionPane.showMessageDialog(frame,"The Molar Mass of \n "+d[1] +" is: " + d[0]);
  			
  			
  			System.out.println(d[1]);
  			
  		}
	  	// Group 1
	  	if(50 < xpos && xpos < 100 && 150 < ypos && ypos < 200){
	  		element = 1;
	  		aq();
	  		
	  	}
	  	if(50 < xpos && xpos < 100 && 200 < ypos && ypos < 250){
	  		element = 3;
	  		aq();
	  	}
	  	if(50 < xpos && xpos < 100 && 250 < ypos && ypos < 300){
	  		element = 11;
	  		aq();
	  	}
	  	if(50 < xpos && xpos < 100 && 300 < ypos && ypos < 350){
	  		element = 19;
	  		aq();
	  	}
	  	if(50 < xpos && xpos < 100 && 350 < ypos && ypos < 400){
	  		element = 37;
	  		aq();
	  	}
	  	if(50 < xpos && xpos < 100 && 400 < ypos && ypos < 450){
	  		element = 55;
	  		aq();
	  	}
	  	if(50 < xpos && xpos < 100 && 450 < ypos && ypos < 500){
	  		element = 87;
	  		aq();
	  	}
	  	// Group 2
	  	if(100 < xpos && xpos < 150 && 200 < ypos && ypos < 250){
	  		element = 4;
	  		aq();
	  	}
	  	if(100 < xpos && xpos < 150 && 250 < ypos && ypos < 300){
	  		element = 12;
	  		aq();
	  	}
	  	if(100 < xpos && xpos < 150 && 300 < ypos && ypos < 350){
	  		element = 20;
	  		aq();
	  	}
	  	if(100 < xpos && xpos < 150 && 350 < ypos && ypos < 400){
	  		element = 38;
	  		aq();
	  	}
	  	if(100 < xpos && xpos < 150 && 400 < ypos && ypos < 450){
	  		element = 56;
	  		aq();
	  	}
	  	if(100 < xpos && xpos < 150 && 450 < ypos && ypos < 500){
	  		element = 88;
	  		aq();
	  	}
	  	// Group 3
	  	if(150 < xpos && xpos < 200 && 300 < ypos && ypos < 350){
	  		element = 21;
	  		aq();
	  	}
	  	if(150 < xpos && xpos < 200 && 350 < ypos && ypos < 400){
	  		element = 39;
	  		aq();
	  	}
	  	if(150 < xpos && xpos < 200 && 400 < ypos && ypos < 450){
	  		element = 71;
	  		aq();
	  	}
	  	if(150 < xpos && xpos < 200 && 450 < ypos && ypos < 500){
	  		element = 103;
	  		aq();
	  	}
	  	// Group 4
	  	if(200 < xpos && xpos < 250 && 300 < ypos && ypos < 350){
	  		element = 22;
	  		aq();
	  	}
	  	if(200 < xpos && xpos < 250 && 350 < ypos && ypos < 400){
	  		element = 40;
	  		aq();
	  	}
	  	if(200 < xpos && xpos < 250 && 400 < ypos && ypos < 450){
	  		element = 72;
	  		aq();
	  	}
	  	if(200 < xpos && xpos < 250 && 450 < ypos && ypos < 500){
	  		element = 104;
	  		aq();
	  	}
	  	// Group 5
	  	if(250 < xpos && xpos < 300 && 300 < ypos && ypos < 350){
	  		element = 23;
	  		aq();
	  	}
	  	if(250 < xpos && xpos < 300 && 350 < ypos && ypos < 400){
	  		element = 41;
	  		aq();
	  	}
	  	if(250 < xpos && xpos < 300 && 400 < ypos && ypos < 450){
	  		element = 73;
	  		aq();
	  	}
	  	if(250 < xpos && xpos < 300 && 450 < ypos && ypos < 500){
	  		element = 105;
	  		aq();
	  	}
	  	// Group 6
	  	if(300 < xpos && xpos < 350 && 300 < ypos && ypos < 350){
	  		element = 24;
	  		aq();
	  	}
	  	if(300 < xpos && xpos < 350 && 350 < ypos && ypos < 400){
	  		element = 42;
	  		aq();
	  	}
	  	if(300 < xpos && xpos < 350 && 400 < ypos && ypos < 450){
	  		element = 74;
	  		aq();
	  	}
	  	if(300 < xpos && xpos < 350 && 450 < ypos && ypos < 500){
	  		element = 106;
	  		aq();
	  	}
	  	// Group 7
	  	if(350 < xpos && xpos < 400 && 300 < ypos && ypos < 350){
	  		element = 25;
	  		aq();
	  	}
	  	if(350 < xpos && xpos < 400 && 350 < ypos && ypos < 400){
	  		element = 43;
	  		aq();
	  	}
	  	if(350 < xpos && xpos < 400 && 400 < ypos && ypos < 450){
	  		element = 75;
	  		aq();
	  	}
	  	if(350 < xpos && xpos < 400 && 450 < ypos && ypos < 500){
	  		element = 107;
	  		aq();
	  	}
	  	// Group 8
	  	if(400 < xpos && xpos < 450 && 300 < ypos && ypos < 350){
	  		element = 26;
	  		aq();
	  	}
	  	if(400 < xpos && xpos < 450 && 350 < ypos && ypos < 400){
	  		element = 44;
	  		aq();
	  	}
	  	if(400 < xpos && xpos < 450 && 400 < ypos && ypos < 450){
	  		element = 76;
	  		aq();
	  	}
	  	if(400 < xpos && xpos < 450 && 450 < ypos && ypos < 500){
	  		element = 108;
	  		aq();
	  	}
	  	// Group 9
	  	if(450 < xpos && xpos < 500 && 300 < ypos && ypos < 350){
	  		element = 27;
	  		aq();
	  	}
	  	if(450 < xpos && xpos < 500 && 350 < ypos && ypos < 400){
	  		element = 45;
	  		aq();
	  	}
	  	if(450 < xpos && xpos < 500 && 400 < ypos && ypos < 450){
	  		element = 77;
	  		aq();
	  	}
	  	if(450 < xpos && xpos < 500 && 450 < ypos && ypos < 500){
	  		element = 109;
	  		aq();
	  	}
	  	// Group 10
	  	if(500 < xpos && xpos < 550 && 300 < ypos && ypos < 350){
	  		element = 28;
	  		aq();
	  	}
	  	if(500 < xpos && xpos < 550 && 350 < ypos && ypos < 400){
	  		element = 46;
	  		aq();
	  	}
	  	if(500 < xpos && xpos < 550 && 400 < ypos && ypos < 450){
	  		element = 78;
	  		aq();
	  	}
	  	if(500 < xpos && xpos < 550 && 450 < ypos && ypos < 500){
	  		element = 110;
	  		aq();
	  	}
	  	// Group 11
	  	if(550 < xpos && xpos < 600 && 300 < ypos && ypos < 350){
	  		element = 29;
	  		aq();
	  	}
	  	if(550 < xpos && xpos < 600 && 350 < ypos && ypos < 400){
	  		element = 47;
	  		aq();
	  	}
	  	if(550 < xpos && xpos < 600 && 400 < ypos && ypos < 450){
	  		element = 79;
	  		aq();
	  	}
	  	if(550 < xpos && xpos < 600 && 450 < ypos && ypos < 500){
	  		element = 111;
	  		aq();
	  	}
	  	// Group 12
	  	if(600 < xpos && xpos < 650 && 300 < ypos && ypos < 350){
	  		element = 30;
	  		aq();
	  	}
	  	if(600 < xpos && xpos < 650 && 350 < ypos && ypos < 400){
	  		element = 48;
	  		aq();
	  	}
	  	if(600 < xpos && xpos < 650 && 400 < ypos && ypos < 450){
	  		element = 80;
	  		aq();
	  	}
	  	if(600 < xpos && xpos < 650 && 450 < ypos && ypos < 500){
	  		element = 112;
	  		aq();
	  	}
	  	// Group 13
	  	if(650 < xpos && xpos < 700 && 200 < ypos && ypos < 250){
	  		element = 5;
	  		aq();
	  	}
	  	if(650 < xpos && xpos < 700 && 250 < ypos && ypos < 300){
	  		element = 13;
	  		aq();
	  	}
	  	if(650 < xpos && xpos < 700 && 300 < ypos && ypos < 350){
	  		element = 31;
	  		aq();
	  	}
	  	if(650 < xpos && xpos < 700 && 350 < ypos && ypos < 400){
	  		element = 49;
	  		aq();
	  	}
	  	if(650 < xpos && xpos < 700 && 400 < ypos && ypos < 450){
	  		element = 81;
	  		aq();
	  	}
	  	
	  	// Group 14
	  	if (700 < xpos && xpos < 750 && 200 < ypos && ypos < 250) {
			element = 6;
	  		aq();
		}
		if (700 < xpos && xpos < 750 && 250 < ypos && ypos < 300) {
			element = 14;
	  		aq();
		}
		if (700 < xpos && xpos < 750 && 300 < ypos && ypos < 350) {
			element = 32;
	  		aq();
		}
		if (700 < xpos && xpos < 750 && 350 < ypos && ypos < 400) {
			element = 50;
	  		aq();
		}
		if (700 < xpos && xpos < 750 && 400 < ypos && ypos < 450) {
			element = 82;
	  		aq();
		}
		
		// Group 15
		if (750 < xpos && xpos < 800 && 200 < ypos && ypos < 250) {
			element = 7;
	  		aq();
		}
		if (750 < xpos && xpos < 800 && 250 < ypos && ypos < 300) {
			element = 15;
	  		aq();
		}
		if (750 < xpos && xpos < 800 && 300 < ypos && ypos < 350) {
			element = 33;
	  		aq();
		}
		if (750 < xpos && xpos < 800 && 350 < ypos && ypos < 400) {
			element = 51;
	  		aq();
		}
		if (750 < xpos && xpos < 800 && 400 < ypos && ypos < 450) {
			element = 83;
	  		aq();
		}
		
		// Group 16
		if (800 < xpos && xpos < 850 && 200 < ypos && ypos < 250) {
			element = 8;
	  		aq();
		}
		if (800 < xpos && xpos < 850 && 250 < ypos && ypos < 300) {
			element = 16;
	  		aq();
		}
		if (800 < xpos && xpos < 850 && 300 < ypos && ypos < 350) {
			element = 34;
	  		aq();
		}
		if (800 < xpos && xpos < 850 && 350 < ypos && ypos < 400) {
			element = 52;
	  		aq();
		}
		if (800 < xpos && xpos < 850 && 400 < ypos && ypos < 450) {
			element = 84;
	  		aq();
		}
		
		// Group 17
		if (850 < xpos && xpos < 900 && 200 < ypos && ypos < 250) {
			element = 9;
	  		aq();
		}
		if (850 < xpos && xpos < 900 && 250 < ypos && ypos < 300) {
			element = 17;
	  		aq();
		}
		if (850 < xpos && xpos < 900 && 300 < ypos && ypos < 350) {
			element = 35;
	  		aq();
		}
		if (850 < xpos && xpos < 900 && 350 < ypos && ypos < 400) {
			element = 53;
	  		aq();
		}
		if (850 < xpos && xpos < 900 && 400 < ypos && ypos < 450) {
			element = 85;
	  		aq();
		}
		
		// Group 18
		if (900 < xpos && xpos < 950 && 200 < ypos && ypos < 250) {
			element = 2;
	  		aq();
		}
		if (900 < xpos && xpos < 950 && 250 < ypos && ypos < 300) {
			element = 10;
	  		aq();
		}
		if (900 < xpos && xpos < 950 && 300 < ypos && ypos < 350) {
			element = 18;
	  		aq();
		}
		if (900 < xpos && xpos < 950 && 350 < ypos && ypos < 400) {
			element = 36;
	  		aq();
		}
		if (900 < xpos && xpos < 950 && 400 < ypos && ypos < 450) {
			element = 54;
	  		aq();
		}
		if (900 < xpos && xpos < 950 && 450 < ypos && ypos < 500) {
			element = 86;
	  		aq();
		}
		// Lanthanides
		if (200 < xpos && xpos < 250 && 525 < ypos && ypos < 575) {
			element = 1;
	  		aq();
		}
		if (250 < xpos && xpos < 300 && 525 < ypos && ypos < 575) {
			element = 1;
	  		aq();
		}
		if (300 < xpos && xpos < 350 && 525 < ypos && ypos < 575) {
			element = 1;
	  		aq();
		}
		if (350 < xpos && xpos < 400 && 525 < ypos && ypos < 575) {
			element = 1;
	  		aq();
		}
		if (400 < xpos && xpos < 450 && 525 < ypos && ypos < 575) {
			element = 1;
	  		aq();
		}
		if (450 < xpos && xpos < 500 && 525 < ypos && ypos < 575) {
			element = 1;
	  		aq();
		}
		if (550 < xpos && xpos < 600 && 525 < ypos && ypos < 575) {
			element = 1;
	  		aq();
		}
		if (650 < xpos && xpos < 700 && 525 < ypos && ypos < 575) {
			element = 1;
	  		aq();
		}
		if (700 < xpos && xpos < 750 && 525 < ypos && ypos < 575) {
			element = 1;
	  		aq();
		}
		if (750 < xpos && xpos < 800 && 525 < ypos && ypos < 575) {
			element = 1;
	  		aq();
		}
		if (800 < xpos && xpos < 850 && 525 < ypos && ypos < 575) {
			element = 1;
	  		aq();
		}
		if (850 < xpos && xpos < 900 && 525 < ypos && ypos < 575) {
			element = 1;
	  		aq();
		}
		// Actinides
  		if (200 < xpos && xpos < 250 && 575 < ypos && ypos < 625) {
			element = 1;
	  		aq();
		}
		if (250 < xpos && xpos < 300 && 575 < ypos && ypos < 625) {
			element = 1;
	  		aq();
		}
		if (300 < xpos && xpos < 350 && 575 < ypos && ypos < 625) {
			element = 1;
	  		aq();
		}
		if (350 < xpos && xpos < 400 && 575 < ypos && ypos < 625) {
			element = 1;
	  		aq();
		}
		if (400 < xpos && xpos < 450 && 575 < ypos && ypos < 625) {
			element = 1;
	  		aq();
		}
		if (450 < xpos && xpos < 500 && 575 < ypos && ypos < 625) {
			element = 1;
	  		aq();
		}
		if (550 < xpos && xpos < 600 && 575 < ypos && ypos < 625) {
			element = 1;
	  		aq();
		}
		if (650 < xpos && xpos < 700 && 575 < ypos && ypos < 625) {
			element = 1;
	  		aq();
		}
		if (700 < xpos && xpos < 750 && 575 < ypos && ypos < 625) {
			element = 1;
	  		aq();
		}
		if (750 < xpos && xpos < 800 && 575 < ypos && ypos < 625) {
			element = 1;
	  		aq();
		}
		if (800 < xpos && xpos < 850 && 575 < ypos && ypos < 625) {
			element = 1;
	  		aq();
		}
		if (850 < xpos && xpos < 900 && 575 < ypos && ypos < 625) {
			element = 1;
	  		aq();
		}
 	}
	
 	//public void mousePressed (MouseEvent me) {}
	
 	public void mouseReleased (MouseEvent me) {} 
	
 	public void mouseEntered (MouseEvent me) {}
 	
 	public void mouseExited (MouseEvent me) {}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


		
}

