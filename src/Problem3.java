//Problem3.java
/*A program which calculates the cost of carpeting a room.*/

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        String name;
        double length, breath, costPer = 33.50, totalCost, totalArea;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        name = input.nextLine();

        System.out.print("Length of room: ");
        length = input.nextDouble();

        System.out.print("Breadth of room: ");
        breath = input.nextDouble();

        totalArea = length*breath;

        totalCost = totalArea*costPer;

        System.out.println("Name: " + name + "\nLength of room: " + String.format("%.2f",length) + " m." +
                "\nBreadth of room: " + String.format("%.2f",breath) + " m." + "\nTotal area of the room: " + String.format("%.2f",totalArea) +
                " sq. m." + "\nCost per square metre of carpet: " + String.format("%.2f",costPer) + " euro" +  "\nTotal cost of carpet: " +
                String.format("%.2f",totalCost) + " euro");


    }



}
