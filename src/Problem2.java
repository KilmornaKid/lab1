//Problem2.java
/*A program which converts GB to euro after prompting the user to enter
 * the current exchange rate*/

import javax.swing.*;
import java.awt.*;

public class Problem2 {
    public static void main(String[] args) {

        int inches;

        JTextArea textArea = new JTextArea(10,30);

        Font textAreaFont = new Font("monospaced", Font.PLAIN,12);
        textArea.setFont(textAreaFont);

        textArea.setText(String.format("%-10s%-10s","Yards "," Inches" ));

        for(int i = 1; i<10; i++){
            inches = i*36;

            textArea.append(String.format("\n%-10s%-10s",i,inches));
        }

        JOptionPane.showMessageDialog(null,textArea,"Conversion Demo",JOptionPane.PLAIN_MESSAGE);

        System.exit(0);
    }
}