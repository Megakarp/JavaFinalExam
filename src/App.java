/*
 * Name: Zachary Doubikin
 * Date: 11/6/22
 * Assignment: CIS319 Week 5 Final Practical Exam
 */

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\nDoubikin, Week 5 Final Practical Exam\n");

        //write to a text file
        PrintWriter logWriter = new PrintWriter("doubikin_log.txt");
        logWriter.println("Starting the application.");

        //polymorphism
        List<Building> buildings = new ArrayList<Building>();
        //use of constructors
        buildings.add(new House(5, new Door(56, "Dark Brown"), new Kitchen("Modern", ("Maytag"))));
        buildings.add(new House(4, new Door(48, "Blue"), new Kitchen("Country", ("Whirlpool"))));
        buildings.add(new House(8, new Door(36, "Green"), new Kitchen("Chef's", ("Bosch"))));
        buildings.add(new House(9, new Door(108, "Black"), new Kitchen("Farmhouse", ("GE"))));
        buildings.add(new House(3, new Door(96, "White"), new Kitchen("Minialist", ("Kenmore"))));

        logWriter.println("Buildings ArrayList created and filled.");

        System.out.println("\nIterative Printing of Buildings\n");
        iterativePrintBuildings(buildings);
        logWriter.println("Iterative print complete.");

        System.out.println("\nRecursive Printing of Buildings\n");
        recursivePrintBuildings(buildings);
        logWriter.println("Recursive print complete.");

        logWriter.println("Program terminating.");
        logWriter.close();

        //read from a text file
        System.out.println("Contents of Log File:");
        File logFile = new File("doubikin_log.txt");
        Scanner logReader = new Scanner(logFile);
        while (logReader.hasNextLine()) {
            String data = logReader.nextLine();
            System.out.println(data);
        }
        logReader.close();
    }

    //recursion
    private static void recursivePrintBuildings(List<Building> buildings) {
        if (buildings.size() > 0) {
            System.out.println(buildings.remove(0));
            recursivePrintBuildings(buildings);
        }
    }

    //iterative
    private static void iterativePrintBuildings(List<Building> buildings) {
        for (Building building : buildings) {
            System.out.println(building);
        }
    }
}
