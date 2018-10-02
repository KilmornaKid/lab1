//Problem1.java
/*A program which converts GB to euro after prompting the user to enter
 * the current exchange rate*/

import javax.swing.JOptionPane;

public class Problem1 {
    public static void main(String[] args) {
        float exchangeRate, pound, euro;
        String exchangeAsStr, poundAsStr;

        exchangeAsStr = JOptionPane.showInputDialog(null,"Please enter the current exchange rate:");
        exchangeRate = Float.parseFloat(exchangeAsStr);
        poundAsStr = JOptionPane.showInputDialog(null,"Please enter the amount in pounds you wish to convert:","Exchange Rate: " + exchangeAsStr, JOptionPane.PLAIN_MESSAGE);
        pound = Float.parseFloat(poundAsStr);

        euro = pound*exchangeRate;

        JOptionPane.showMessageDialog(null, String.format("%.2f",pound) + " pound is equal to " + String.format("%.2f",euro) + " euro.","Exchange Rate: " + exchangeAsStr,JOptionPane.INFORMATION_MESSAGE);

    }
}