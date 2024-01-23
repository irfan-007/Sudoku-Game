package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class sudoku_file extends JFrame {
    private JPanel mainPanel;
    private JButton e4b1;
    private JButton e4b2;
    private JButton e4b3;
    private JButton e4b4;
    private JButton e4b5;
    private JButton e4b6;
    private JButton e4b8;
    private JButton e4b9;
    private JButton e4b7;
    private JButton e5b1;
    private JButton e5b2;
    private JButton e5b3;
    private JButton e5b4;
    private JButton e5b7;
    private JButton e5b5;
    private JButton e5b6;
    private JButton e5b8;
    private JButton e5b9;
    private JPanel r1c1;
    private JPanel r1c2;
    private JPanel r1c3;
    private JPanel r3c3;
    private JPanel r3c2;
    private JPanel r3c1;
    private JPanel r2c3;
    private JPanel r2c2;
    private JPanel r2c1;
    private JButton e6b1;
    private JButton e6b2;
    private JButton e6b3;
    private JButton e6b4;
    private JButton e6b5;
    private JButton e6b6;
    private JButton e6b7;
    private JButton e6b8;
    private JButton e6b9;
    private JButton e7b1;
    private JButton e7b4;
    private JButton e7b2;
    private JButton e7b3;
    private JButton e7b6;
    private JButton e7b8;
    private JButton e7b7;
    private JButton e7b5;
    private JButton e7b9;
    private JButton e8b1;
    private JButton e8b2;
    private JButton e8b3;
    private JButton e8b4;
    private JButton e8b7;
    private JButton e8b5;
    private JButton e8b6;
    private JButton e8b9;
    private JButton e8b8;
    private JButton e9b1;
    private JButton e9b2;
    private JButton e9b3;
    private JButton e9b4;
    private JButton e9b7;
    private JButton e9b6;
    private JButton e9b5;
    private JButton e9b9;
    private JButton e9b8;
    private JButton e1b1;
    private JButton e1b2;
    private JButton e1b3;
    private JButton e1b4;
    private JButton e1b5;
    private JButton e1b6;
    private JButton e1b7;
    private JButton e1b8;
    private JButton e1b9;
    private JButton e3b2;
    private JButton e3b3;
    private JButton e3b4;
    private JButton e3b5;
    private JButton e3b6;
    private JButton e3b7;
    private JButton e3b8;
    private JButton e3b9;
    private JButton e3b1;
    private JButton e2b1;
    private JButton e2b2;
    private JButton e2b3;
    private JButton e2b4;
    private JButton e2b5;
    private JButton e2b6;
    private JButton e2b7;
    private JButton e2b8;
    private JButton e2b9;
    private JPanel nums;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JPanel controls;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;

    public sudoku_file(){
        setTitle("Sudoku Solver");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(600,650);
        setContentPane(mainPanel);

        e1b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e1b1.setText(turn);
                e1b1.setBackground(Color.lightGray);
            }
        });
        e1b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e1b2.setText(turn);
                e1b2.setBackground(Color.lightGray);
            }
        });
        e1b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e1b3.setText(turn);
                e1b3.setBackground(Color.lightGray);
            }
        });
        e1b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e1b5.setText(turn);
                e1b5.setBackground(Color.lightGray);
            }
        });
        e1b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e1b6.setText(turn);
                e1b6.setBackground(Color.lightGray);
            }
        });
        e1b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e1b8.setText(turn);
                e1b8.setBackground(Color.lightGray);
            }
        });
        e2b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e2b2.setText(turn);
                e2b2.setBackground(Color.lightGray);
            }
        });
        e2b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e2b3.setText(turn);
                e2b3.setBackground(Color.lightGray);
            }
        });
        e2b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e2b4.setText(turn);
                e2b4.setBackground(Color.lightGray);
            }
        });
        e2b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e2b7.setText(turn);
                e2b7.setBackground(Color.lightGray);
            }
        });
        e2b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e2b9.setText(turn);
                e2b9.setBackground(Color.lightGray);
            }
        });
        e3b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e3b5.setText(turn);
                e3b5.setBackground(Color.lightGray);
            }
        });
        e3b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e3b7.setText(turn);
                e3b7.setBackground(Color.lightGray);
            }
        });
        e3b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e3b9.setText(turn);
                e3b9.setBackground(Color.lightGray);
            }
        });
        e4b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e4b1.setText(turn);
                e4b1.setBackground(Color.lightGray);
            }
        });
        e4b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e4b2.setText(turn);
                e4b2.setBackground(Color.lightGray);
            }
        });
        e4b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e4b3.setText(turn);
                e4b3.setBackground(Color.lightGray);
            }
        });
        e4b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e4b4.setText(turn);
                e4b4.setBackground(Color.lightGray);
            }
        });
        e4b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e4b7.setText(turn);
                e4b7.setBackground(Color.lightGray);
            }
        });
        e4b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e4b9.setText(turn);
                e4b9.setBackground(Color.lightGray);
            }
        });
        e5b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e5b1.setText(turn);
                e5b1.setBackground(Color.lightGray);
            }
        });
        e5b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e5b4.setText(turn);
                e5b4.setBackground(Color.lightGray);
            }
        });
        e5b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e5b5.setText(turn);
                e5b5.setBackground(Color.lightGray);
            }
        });
        e5b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e5b6.setText(turn);
                e5b6.setBackground(Color.lightGray);
            }
        });
        e5b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e5b9.setText(turn);
                e5b9.setBackground(Color.lightGray);
            }
        });
        e6b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e6b1.setText(turn);
                e6b1.setBackground(Color.lightGray);
            }
        });
        e6b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e6b3.setText(turn);
                e6b3.setBackground(Color.lightGray);
            }
        });
        e6b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e6b6.setText(turn);
                e6b6.setBackground(Color.lightGray);
            }
        });
        e6b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e6b7.setText(turn);
                e6b7.setBackground(Color.lightGray);
            }
        });
        e6b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e6b8.setText(turn);
                e6b8.setBackground(Color.lightGray);
            }
        });
        e6b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e6b9.setText(turn);
                e6b9.setBackground(Color.lightGray);
            }
        });
        e7b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e7b1.setText(turn);
                e7b1.setBackground(Color.lightGray);
            }
        });
        e7b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e7b3.setText(turn);
                e7b3.setBackground(Color.lightGray);
            }
        });
        e7b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e7b5.setText(turn);
                e7b5.setBackground(Color.lightGray);
            }
        });
        e7b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e7b6.setText(turn);
                e7b6.setBackground(Color.lightGray);
            }
        });
        e8b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e8b1.setText(turn);
                e8b1.setBackground(Color.lightGray);
            }
        });
        e8b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e8b3.setText(turn);
                e8b3.setBackground(Color.lightGray);
            }
        });
        e8b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e8b6.setText(turn);
                e8b6.setBackground(Color.lightGray);
            }
        });
        e8b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e8b7.setText(turn);
                e8b7.setBackground(Color.lightGray);
            }
        });
        e8b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e8b8.setText(turn);
                e8b8.setBackground(Color.lightGray);
            }
        });
        e9b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e9b2.setText(turn);
                e9b2.setBackground(Color.lightGray);
            }
        });
        e9b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e9b4.setText(turn);
                e9b4.setBackground(Color.lightGray);
            }
        });
        e9b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e9b5.setText(turn);
                e9b5.setBackground(Color.lightGray);
            }
        });
        e9b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e9b7.setText(turn);
                e9b7.setBackground(Color.lightGray);
            }
        });
        e9b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e9b8.setText(turn);
                e9b8.setBackground(Color.lightGray);
            }
        });
        e9b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e9b9.setText(turn);
                e9b9.setBackground(Color.lightGray);
            }
        });


        /////////// pre values-- ---------------------------------------------------------------------------------------------------


        e1b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e1b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e1b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e2b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e2b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e2b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e2b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e3b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e3b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e3b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e3b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e3b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e3b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e4b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e4b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e4b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e5b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e5b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e5b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e5b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e6b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e6b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e6b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e7b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e7b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e7b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e7b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e7b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e8b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e8b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e8b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e8b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e9b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e9b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        e9b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sudoku_file.this,"already given","message",JOptionPane.INFORMATION_MESSAGE);
            }
        });


        /////////////////////  select buttons --------------------------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AssignTurn(button1);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AssignTurn(button2);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AssignTurn(button3);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AssignTurn(button4);
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AssignTurn(button5);
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AssignTurn(button6);
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AssignTurn(button7);
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AssignTurn(button8);
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AssignTurn(button9);
            }
        });


        ////////////////  control buttons ---------------------------------------------------->>>>>>>>>>

        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // RESET button :-
                JFrame frm=new JFrame("RESET");
                if(JOptionPane.showConfirmDialog(frm,"Are you sure you want to RESET ?","SUDOKU_PUZZLE",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                    resetNow();
                }

            }
        });
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // EXIT button :-
                JFrame frm=new JFrame("EXIT");
                if(JOptionPane.showConfirmDialog(frm,"Are you sure you want to EXIT ?","SUDOKU_PUZZLE",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                    System.exit(0);
                }
            }
        });

        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // solution button
                global_flag=(!global_flag);
                showSolution();
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                global_flag2=(!global_flag2);
                checkMoves();
            }
        });
    }

    private String turn="1";

    private boolean global_flag=false;
    private boolean global_flag2=false;

    private void AssignTurn(JButton btn){
        button1.setBackground(new java.awt.Color(151, 192, 178));
        button2.setBackground(new java.awt.Color(151, 192, 178));
        button3.setBackground(new java.awt.Color(151, 192, 178));
        button4.setBackground(new java.awt.Color(151, 192, 178));
        button5.setBackground(new java.awt.Color(151, 192, 178));
        button6.setBackground(new java.awt.Color(151, 192, 178));
        button7.setBackground(new java.awt.Color(151, 192, 178));
        button8.setBackground(new java.awt.Color(151, 192, 178));
        button9.setBackground(new java.awt.Color(151, 192, 178));
        btn.setBackground(new java.awt.Color(170, 255, 170));
        turn=btn.getText();

    }

    private void resetNow(){
        for(JButton b:btns){
            b.setText("");
            b.setBackground(new java.awt.Color(43, 45, 48));
        }
    }
    private String solveBoard[]={
            "2","9","8","1","6",
            "1","3","2","6",
            "5","3","9","1","8",
            "8","2","1","4","6","7",
            "5","6","9","7","1",
            "9","7","2","3","4","5",
            "1","2","8","3","7",
            "7","5","4","8","1",
            "7","2","4","5","3"
    };
    private JButton btns[]={
            e1b1,e1b2,e1b3,e2b2,e2b3,
            e1b5,e1b6,e2b4,e3b5,
            e1b8,e2b7,e2b9,e3b7,e3b9,
            e4b1,e4b2,e4b3,e5b1,e6b1,e6b3,
            e4b4,e5b4,e5b5,e5b6,e6b6,
            e4b7,e4b9,e5b9,e6b7,e6b8,e6b9,
            e7b1,e7b3,e8b1,e8b3,e9b2,
            e7b5,e7b6,e8b6,e9b4,e9b5,
            e8b7,e8b8,e9b7,e9b8,e9b9
    };

    private void showSolution(){
       if(global_flag==true){
           button12.setText(" Hide  it ");
           button12.setBackground(Color.black);
           for(int i=0;i<btns.length;i++){
                   // matching elements
                   btns[i].setBackground(Color.green);
                   btns[i].setText(solveBoard[i]);
           }
       }
       else{
           button12.setText("solution");
           button12.setBackground(new java.awt.Color(54, 142, 44));
           resetNow();
       }
    }
    private void checkMoves(){
        if(global_flag2==true){
            button10.setText("  Uncheck  it  ");
            button10.setBackground(Color.white);
            button10.setForeground(Color.black);
            for(int i=0;i<btns.length;i++){
                // matching elements
                if(btns[i].getText()!="" && btns[i].getText()!=solveBoard[i]){
                    btns[i].setBackground(Color.red);
                }
            }
        }
        else{
            button10.setText("check moves");
            button10.setForeground(Color.white);
            button10.setBackground(new java.awt.Color(81, 87, 82));
            for(int i=0;i<btns.length;i++){
                // matching elements
                if(btns[i].getText()!="" && btns[i].getText()!=solveBoard[i]){
                    btns[i].setBackground(Color.lightGray);
                }
            }
        }
    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
    public static void main(String[] args) {
        new sudoku_file();
    }


}

