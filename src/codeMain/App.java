package codeMain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {

/*
*this program plays a game of rock, paper, scissors vs a computer
*it starts by the user picking an option then compared it to the computer to see who wins
 */

//objects on the panel
    private JPanel PanelMenu;
    private JRadioButton radRock;
    private JRadioButton radPaper;
    private JRadioButton radScissors;
    private JLabel lblCpuGeuss;
    private JLabel lblOutcome;
    private JRadioButton radRockCpu;
    private JRadioButton radPaperCpu;
    private JRadioButton radScissorsCpu;

    //global varubls
    int rock=1;
    int paper=2;
    int scissors=3;

    public App() {

        //disable the computer's pick
        radPaperCpu.setEnabled(false);
        radRockCpu.setEnabled(false);
        radScissorsCpu.setEnabled(false);

        //the rock button
        radRock.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                //disable the user's other options
                radPaper.setEnabled(false);
                radScissors.setEnabled(false);

                //calling a function
                cpuGuess();

                //creating a local varuble for the function
                int guess = cpuGuess();

                //checking to see if the player wins, loses or ties the computer
                if (guess==1){

                    //displays the outcome
                    lblCpuGeuss.setText("the Computer picked rock");
                    lblOutcome.setText("Tie");
                    radRockCpu.setSelected(true);
                }
                else if (guess==2){

                    //displays the outcome
                    lblCpuGeuss.setText("the Computer picked paper");
                    lblOutcome.setText("Computer wins");
                    radPaperCpu.setSelected(true);
                }
                else if (guess==3){

                    //displays the outcome
                    lblCpuGeuss.setText("the Computer picked Scissors");
                    lblOutcome.setText("Player wins");
                    radScissorsCpu.setSelected(true);
                }
            }
        });

        //the paper button
        radPaper.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                //calling a function
                cpuGuess();

                //creating a local varuble for the function
                int guess = cpuGuess();

                //disable the user's other options
                radRock.setEnabled(false);
                radScissors.setEnabled(false);

                //checking to see if the player wins, loses or ties the computer
                if (guess==1){

                    //displays the outcome
                    lblCpuGeuss.setText("the Computer picked rock");
                    lblOutcome.setText("Player wins");
                    radRockCpu.setSelected(true);
                }
                else if (guess==2){

                    //displays the outcome
                    lblCpuGeuss.setText("the Computer picked paper");
                    lblOutcome.setText("Tie");
                    radPaperCpu.setSelected(true);
                }
                else if (guess==3){

                    //displays the outcome
                    lblCpuGeuss.setText("the Computer picked Scissors");
                    lblOutcome.setText("Computer wins");
                    radScissorsCpu.setSelected(true);
                }
            }
        });

        //the scissor button
        radScissors.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                //calling a function
                cpuGuess();

                //creating a local varuble for the function
                int guess = cpuGuess();

                //disable the user's other options
                radPaper.setEnabled(false);
                radRock.setEnabled(false);

                //checking to see if the player wins, loses or ties the computer
                if (guess==1){

                    //displays the outcome
                    lblCpuGeuss.setText("the Computer picked rock");
                    lblOutcome.setText("Computer wins");
                    radRockCpu.setSelected(true);
                }
                else if (guess==2){

                    //displays the outcome
                    lblCpuGeuss.setText("The Computer picked paper");
                    lblOutcome.setText("Player wins");
                    radPaperCpu.setSelected(true);
                }
                else if (guess==3){

                    //displays the outcome
                    lblCpuGeuss.setText("the Computer picked Scissors");
                    lblOutcome.setText("Tie");
                    radScissorsCpu.setSelected(true);
                }

            }
        });
    }

    //the function for the computer guessing rock paper or scissors
    public static int cpuGuess(){

        //do da math
        int cpuPick = (int)(Math.random()*3+1);

        //return it
        return cpuPick;
    }

    //displaying the form
    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().PanelMenu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
