package de.kreth.visitor.reisebuero;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import de.kreth.visitor.reisebuero.objekte.Visitable;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;


public class HotelAnwendungTest extends JFrame {

   private static final long serialVersionUID = -3843337472475644762L;
   private JPanel contentPane;
   private JTextField textFieldVon;
   private JTextField textField;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {

         @Override
         public void run() {
            try {
               HotelAnwendungTest frame = new HotelAnwendungTest();
               frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the frame.
    */
   public HotelAnwendungTest() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 450, 300);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      contentPane.setLayout(new BorderLayout(0, 0));
      setContentPane(contentPane);
      
      JPanel panelOptions = new JPanel();
      contentPane.add(panelOptions, BorderLayout.NORTH);
      
      JLabel lblNewLabel = new JLabel("Zeitraum vom ");
      panelOptions.add(lblNewLabel);
      
      textFieldVon = new JTextField();
      textFieldVon.setText("");
      panelOptions.add(textFieldVon);
      textFieldVon.setColumns(10);
      
      JLabel lblNewLabel_1 = new JLabel(" bis ");
      panelOptions.add(lblNewLabel_1);
      
      textField = new JTextField();
      textField.setText("");
      panelOptions.add(textField);
      textField.setColumns(10);
      
      JPanel panelMain = new JPanel();
      contentPane.add(panelMain, BorderLayout.CENTER);
      
      JList<Visitable> listAngebote = new JList<>();
      contentPane.add(listAngebote, BorderLayout.EAST);
      
   }
}
