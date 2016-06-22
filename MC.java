import javax.swing.*; //GUI components
import java.awt.*;
import java.awt.event.*; //for action events
import java.awt.image.*;
import javax.swing.event.*;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;

public class MC implements ActionListener{
   
   public JFrame frame;
   public JPanel totalGUI;
   private JButton b1;
   private JButton Lchev;
   private JButton Lstang;
   private JButton s;
   private JButton c;
   private JButton b00;
   private JButton b01;
   private JButton b02; 
   private JButton b03;
   private JButton comp;
   
   //Schedule a job for the event-dispatching thread:
   //creating and showing this application's GUI.
   public static void main(String[] args) {
      SwingUtilities.invokeLater(
            new Runnable() {
               public void run() {   
                  createAndShowGUI();
               }
            });
   }
   
   //create and setup the content pane
   private static void createAndShowGUI() {
      JFrame.setDefaultLookAndFeelDecorated(true);
      JFrame f = new JFrame("FORD MUSTANG & CHEVROLET CAMARO GUI");
  
      MC compare = new MC();
      
      f.setContentPane(compare.createContentPane());
      f.setExtendedState(JFrame.MAXIMIZED_BOTH);  
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setLocationRelativeTo(null);
      f.setSize(1000, 800);
      f.pack();
      f.setVisible(true);
      compare.Frame();
   }
   
   //creating a 'content pana' aka JPanel where all the graphics go (the second 'slide')
   public JPanel createContentPane (){
    
      totalGUI = new JPanel();
    	 
      JPanel mainPanel = new JPanel(new GridLayout(3, 2));
      mainPanel.setBackground(Color.black);
      
      b00 = new JButton("Chevy Camaro SS 2016");
      b00.setIcon(new ImageIcon("c16.png"));
      b00.setFont(new Font ("Bernard MT Condensed", Font.PLAIN, 10));
      b00.setForeground(Color.RED);
      b00.setOpaque(true);
      b00.setBackground(Color.black);
      b00.addActionListener(this);
            
      b01 = new JButton("Chevrolet Camaro ZL1 1969");
      b01.setIcon(new ImageIcon("c69.png"));
      b01.setFont(new Font ("Bernard MT Condensed", Font.PLAIN, 10));
      b01.setForeground(Color.RED);
      b01.setOpaque(true);
      b01.setBackground(Color.BLACK);
      b01.addActionListener(this);
      
      Lchev = new JButton("History of Chevrolet");
      Lchev.setFont(new Font ("Bernard MT Condensed", Font.PLAIN, 30));
      Lchev.setBackground(Color.BLACK);
      Lchev.setForeground(Color.GRAY);
      Lchev.setHorizontalAlignment(JLabel.CENTER);
      Lchev.setVerticalAlignment(JLabel.CENTER);
      Lchev.setOpaque(true);
      Lchev.setBorderPainted(false);
      Lchev.addActionListener(this); 

      Lstang = new JButton("History of Ford");
      Lstang.setFont(new Font ("Bernard MT Condensed", Font.PLAIN, 30));
      Lstang.setBackground(Color.BLACK);
      Lstang.setForeground(Color.GRAY);
      Lstang.setHorizontalAlignment(JLabel.CENTER);
      Lstang.setVerticalAlignment(JLabel.CENTER);
      Lstang.setOpaque(true);
      Lstang.setBorderPainted(false);
      Lstang.addActionListener(this);
      
      b02 = new JButton("Shelby Mustang GT350 2016");
      b02.setIcon(new ImageIcon("s16.png"));
      b02.setFont(new Font ("Bernard MT Condensed", Font.PLAIN, 10));
      b02.setForeground(Color.RED);
      b02.setOpaque(true);
      b02.setBackground(Color.BLACK);
      b02.addActionListener(this);
      
      b03 = new JButton("Shelby Mustang GT350 1965");
      b03.setIcon(new ImageIcon("s65.png"));
      b03.setFont(new Font ("Bernard MT Condensed", Font.PLAIN, 10));
      b03.setForeground(Color.RED);
      b03.setOpaque(true);
      b03.setBackground(Color.BLACK);
      b03.addActionListener(this);
    	 
      mainPanel.add(b00);
      mainPanel.add(b01);
      mainPanel.add(Lchev);
      mainPanel.add(Lstang);
      mainPanel.add(b02);
      mainPanel.add(b03);

      totalGUI.add(mainPanel);
      totalGUI.setOpaque(true);
      return totalGUI;
   }
   
   //creates the intro frame
   public void Frame(){
      frame = new JFrame("INTRO");
      frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
      frame.setSize(new Dimension(1200, 800));
      frame.setLocationRelativeTo(null);
    
      b1 = new JButton ("START");
      b1.setOpaque(true); 
      b1.setBorderPainted(false);
      b1.setBackground(Color.black);
      b1.setText("START");
      b1.setForeground(Color.RED);
      b1.setFont(new Font ("Bernard MT Condensed", Font.PLAIN, 30));
      b1.setSize(new Dimension (150, 30));
      b1.setIcon(new ImageIcon("intro.png"));
      b1.addActionListener(this);
    
      frame.add(b1);
      frame.setVisible(true);
   }
   
   //ActionEvent listener - performs actions when buttons clicked
   public void actionPerformed(ActionEvent e) {
      if(e.getSource() == b1)
      {
         JOptionPane.showMessageDialog(null, "Continue On");
         frame.setVisible(false);
      }
      if(e.getSource() == Lchev)
      {
         JFrame x = new JFrame();
         c = new JButton();
         c.setIcon(new ImageIcon("chevy.png"));
         c.setOpaque(true); 
         c.setBorderPainted(false);
         c.setBackground(Color.black);
         x.add(c);
         x.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
         x.setSize(new Dimension(700, 400));
         x.setLocationRelativeTo(null);
         c.addActionListener(this);
         x.setVisible(true);
      }
      if(e.getSource() == Lstang)
      {
         JFrame x2 = new JFrame();
         s = new JButton();
         s.setIcon(new ImageIcon("stang.png"));
         s.setOpaque(true); 
         s.setBorderPainted(false);
         s.setBackground(Color.black);
         x2.add(s);
         x2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
         x2.setSize(new Dimension(700, 400));
         x2.setLocationRelativeTo(null);
         s.addActionListener(this);
         x2.setVisible(true);
      
      }
      if(e.getSource() == c)
      {
         c.setIcon(new ImageIcon("frd.png")); 
      }
      if(e.getSource() == s)
      {
         s.setIcon(new ImageIcon("cc.jb")); 
      }
      if(e.getSource() == b00 ||e.getSource() == b01 || e.getSource() == b02 || e.getSource() == b03 )
      {
         frame.setVisible(false);
         JFrame n = new JFrame();
         comp = new JButton();
         comp.setIcon(new ImageIcon("chart.png"));
         comp.addActionListener(this);
         n.add(comp);
         n.setSize(new Dimension(800, 600));
         n.setLocationRelativeTo(null);
         n.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
         n.setVisible(true);
      }
      if(e.getSource() == comp)
      {
         JFrame end = new JFrame();
         JButton end1 = new JButton("DO YOU WANT TO END PROGRAM? Click the red x");
         end1.setOpaque(true); 
         end1.setBorderPainted(false);
         end1.setBackground(Color.black);
         end1.setForeground(Color.RED);
         end1.setFont(new Font ("Bernard MT Condensed", Font.PLAIN, 30));
         end.add(end1);
         end.setSize(new Dimension(800, 600));
         end.setLocationRelativeTo(null);
         end.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
         end.setVisible(true);
      }
   }

}
