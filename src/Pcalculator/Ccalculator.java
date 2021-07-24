package Pcalculator;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ccalculator implements ActionListener {
    JFrame frame =new JFrame("Calculator");
    JPanel panel=new JPanel();
    JTextArea textfield =new JTextArea(2,10);

    JButton button1=new JButton("1");
    JButton button2=new JButton("2");
    JButton button3=new JButton("3");
    JButton button4=new JButton("4");
    JButton button5=new JButton("5");
    JButton button6=new JButton("6");
    JButton button7=new JButton("7");
    JButton button8=new JButton("8");
    JButton button9=new JButton("9");
    JButton button0=new JButton("0");
    JButton buttonadd=new JButton("+");
    JButton buttonsub=new JButton("-");
    JButton buttonmulti=new JButton("*");
    JButton buttondiv=new JButton("/");
    JButton buttondot=new JButton(".");
    JButton buttonclear=new JButton("AC");
    JButton buttoncalculate=new JButton("=");

    double num1,num2,result;

    int addc=0,subc=0,multic=0,divc=0;

    public Ccalculator(){
        frame.setSize(450,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
//        frame.setTitle("Calculator");


        frame.setResizable(false);
        frame.add(panel);
        panel.setBackground(Color.gray);
        Border border=BorderFactory.createLineBorder(Color.black,4);

        panel.add(textfield);
        textfield.setBackground(Color.black);
        Border tborder=BorderFactory.createLineBorder(Color.lightGray,3);
        textfield.setBorder(tborder);
        Font font=new Font("Arial",Font.BOLD,45);
        textfield.setFont(font);
        textfield.setForeground(Color.white);

        textfield.setPreferredSize(new Dimension(3,10));
        textfield.setLineWrap(true);

        button1.setPreferredSize(new Dimension(97,45));
        button2.setPreferredSize(new Dimension(97,45));
        button3.setPreferredSize(new Dimension(97,45));
        button4.setPreferredSize(new Dimension(97,45));
        button5.setPreferredSize(new Dimension(97,45));
        button6.setPreferredSize(new Dimension(97,45));
        button7.setPreferredSize(new Dimension(97,45));
        button8.setPreferredSize(new Dimension(97,45));
        button9.setPreferredSize(new Dimension(97,45));
        button0.setPreferredSize(new Dimension(97,45));
        buttondot.setPreferredSize(new Dimension(97,45));
        buttondot.setBackground(Color.lightGray);
        buttonadd.setPreferredSize(new Dimension(97,45));
        buttonadd.setBackground(Color.lightGray);
        buttonsub.setPreferredSize(new Dimension(97,45));
        buttonsub.setBackground(Color.lightGray);
        buttonmulti.setPreferredSize(new Dimension(97,45));
        buttonmulti.setBackground(Color.lightGray);
        buttondiv.setPreferredSize(new Dimension(97,45));
        buttondiv.setBackground(Color.lightGray);
        buttoncalculate.setPreferredSize(new Dimension(400,45));
        buttoncalculate.setBackground(Color.lightGray);
        buttonclear.setPreferredSize(new Dimension(97,45));
        buttonclear.setBackground(Color.lightGray);


        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(buttonadd);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(buttonsub);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonmulti);
        panel.add(buttonclear);
        panel.add(button0);
        panel.add(buttondot);
        panel.add(buttondiv);
        panel.add(buttoncalculate);


        button1.addActionListener((ActionListener)this);
        button2.addActionListener((ActionListener)this);
        button3.addActionListener((ActionListener)this);
        button4.addActionListener((ActionListener)this);
        button5.addActionListener((ActionListener) this);
        button6.addActionListener((ActionListener)this);
        button7.addActionListener((ActionListener)this);
        button8.addActionListener((ActionListener)this);
        button9.addActionListener((ActionListener)this);
        button0.addActionListener((ActionListener)this);
        buttonadd.addActionListener((ActionListener)this);
        buttonsub.addActionListener((ActionListener)this);
        buttonmulti.addActionListener((ActionListener)this);
        buttondiv.addActionListener((ActionListener)this);
        buttondot.addActionListener((ActionListener)this);
        buttoncalculate.addActionListener((ActionListener)this);
        buttonclear.addActionListener((ActionListener)this);



    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source=(Object) e.getSource();
        if(source==buttonclear){
//            double number1=0.0;
//            double number2=0.0;
            textfield.setText("");
        }
        if (source==button1){
            textfield.append("1");
        }
        if (source==button2){
            textfield.append("2");
        }
        if (source==button3){
            textfield.append("3");
        }
        if (source==button4){
            textfield.append("4");
        }
        if (source==button5){
            textfield.append("5");
        }
        if (source==button6){
            textfield.append("6");
        }
        if (source==button7){
            textfield.append("7");
        }
        if (source==button8){
            textfield.append("8");
        }
        if (source==button9){
            textfield.append("9");
        }
        if (source==button0){
            textfield.append("0");
        }
        if (source==buttondot){
            textfield.append(".");
        }
        if (source==buttonadd){
            num1=number_reader();
            textfield.setText("");
            addc=1;
            subc=0;
            multic=0;
            divc=0;
        }
        if (source==buttonsub){
            num1=number_reader();
            textfield.setText("");
            addc=0;
            subc=1;
            multic=0;
            divc=0;
        }
        if (source==buttonmulti){
            num1=number_reader();
            textfield.setText("");
            addc=0;
            subc=0;
            multic=1;
            divc=0;
        }
        if (source==buttondiv){
            num1=number_reader();
            textfield.setText("");
            addc=0;
            subc=0;
            multic=0;
            divc=1;
        }
        if (source==buttoncalculate){
            num2=number_reader();
            if (addc>0){
                result=num1+num2;
                textfield.setText(Double.toString(result));
                addc=0;
            }
            else if (subc>0){
                result=num1-num2;
                textfield.setText(Double.toString(result));
                subc=0;
            }
            else if (multic>0){
                result=num1*num2;
                textfield.setText(Double.toString(result));
                multic=0;
            }
            else if (divc>0){
                result=num1/num2;
                textfield.setText(Double.toString(result));
                divc=0;
            }



        }




    }
    public double number_reader(){
        double num1;
        String s;
        s= textfield.getText();
        num1=Double.valueOf(s);
        return num1;


    }

}
