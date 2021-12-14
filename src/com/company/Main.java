package com.company;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Main {

    public static void main(String[] args) throws FileNotFoundException
    {

        File bat = new File("C:\\Users\\Jayden\\Documents\\batteries.txt");

        Scanner in = new Scanner(bat);
        int Batteries = in.nextInt();
        for (int i = 0; i < Batteries; i ++)
        {
            int Capacity = in.nextInt();
            double Voltage = in.nextDouble();
            double E = 3.6 * Capacity * Voltage;
            System.out.println("3.6 * " + Capacity + " * " + Voltage + " = " + E);
        }
    }
}