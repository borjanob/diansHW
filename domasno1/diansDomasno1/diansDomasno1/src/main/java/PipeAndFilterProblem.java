package main.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PipeAndFilterProblem {
    public static void main (String[] args) throws FileNotFoundException {
        Pipe<String> pipe = new Pipe<>();
        ToLowerCaseFilter toLowerCaseFilter = new ToLowerCaseFilter();

        RemoveNameFilter removeNameFilter = new RemoveNameFilter();
        pipe.addFilter(removeNameFilter);

        //Scanner scanner = new Scanner (new File("C:\\Users\\pc\\Desktop\\bankomati.csv"));
        Scanner scanner = new Scanner (new File("diansDomasno1\\src\\main\\resources\\bankomati.csv"));
        scanner.useDelimiter(",");
        while(scanner.hasNextLine()) {
            System.out.println(pipe.runFilter(scanner.nextLine()));
        }
        scanner.close();
    }
}
