//Problem4.java
/*A program which asks the user to enter their full name and then outputs
 * various characteristics on the name entered*/

import javax.swing.*;

public class Problem4 {
    public static void main(String[] args) {

        String fullName, numOfLetters, caps,  lastLetter;
        char initial;
        int l;

        fullName = JOptionPane.showInputDialog("Please enter your full name:");

        initial = fullName.charAt(0);

        caps = fullName.toUpperCase();

        l = fullName.length();

        lastLetter = fullName.substring(fullName.length() - 1);


        JOptionPane.showMessageDialog(null,"# of characters in your name: " + l);

        JOptionPane.showMessageDialog(null,"YOur first initial is: " + initial);

        JOptionPane.showMessageDialog(null,"Uppercase: " + caps);

        JOptionPane.showMessageDialog(null,"Last letter: " + lastLetter);




    }
}

