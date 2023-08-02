import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


// Advent of Code 2022 Day 6   Part 2
//  Read about the problem here  https://adventofcode.com/2022/day/6#part2
public class Day06_02 {

    public static void main(String[] args) throws IOException, FileNotFoundException {
        Path current = Paths.get(".");
        String s = current.toAbsolutePath().toString();
        System.out.println("Path" + s);

        File inputTxt = new File("src/2022/day01/input.txt");
        BufferedReader input = new BufferedReader(new FileReader(inputTxt));
        String sections;

        char pos1, pos2, pos3, pos4, pos5, pos6, pos7, pos8, pos9, pos10, pos11, pos12, pos13, pos14;
        String dataLine = input.readLine();

        // Initial reading of the first 4 characters
        pos1=dataLine.charAt(0);
        pos2=dataLine.charAt(1);
        pos3=dataLine.charAt(2);
        pos4=dataLine.charAt(3);
        pos5=dataLine.charAt(4);
        pos6=dataLine.charAt(5);
        pos7=dataLine.charAt(6);
        pos8=dataLine.charAt(7);
        pos9=dataLine.charAt(8);
        pos10=dataLine.charAt(9);
        pos11=dataLine.charAt(10);
        pos12=dataLine.charAt(11);
        pos13=dataLine.charAt(12);
        pos14=dataLine.charAt(13);


        int position = 13;

        boolean allDifferent = AllDifferent(pos1, pos2, pos3, pos4, pos5, pos6, pos7, pos8, pos9, pos10, pos11, pos12, pos13, pos14);
        System.out.println("First Characters:" + pos1 + pos2 + pos3 + pos4);
        if (allDifferent)
            System.out.println("    They are different");
        else
            System.out.println("    Some are the same!");

        while (!allDifferent) {
            // what's the next character?
            position++;
            pos1 = pos2;
            pos2 = pos3;
            pos3 = pos4;
            pos4 = pos5;
            pos5 = pos6;
            pos6 = pos7;
            pos7 = pos8;
            pos8 = pos9;
            pos9 = pos10;
            pos10 = pos11;
            pos11 = pos12;
            pos12 = pos13;
            pos13 = pos14;
            pos14 = dataLine.charAt(position);

            allDifferent = AllDifferent(pos1, pos2, pos3, pos4, pos5, pos6, pos7, pos8, pos9, pos10, pos11, pos12, pos13, pos14);

        }
        position++;
        System.out.println("   At location " + position );
    }

    private static boolean AllDifferent(char pos1, char pos2, char pos3, char pos4, char pos5, char pos6, char pos7,
                                        char pos8, char pos9, char pos10, char pos11, char pos12, char pos13, char pos14) {
        System.out.println("Comparing:" + pos1 + pos2 + pos3 +pos4);
        if (pos1 == pos2 || pos1 == pos3 || pos1 == pos4 || pos1 == pos5 || pos1 == pos6 || pos1 == pos7 || pos1 == pos8 || pos1 == pos9 || pos1 == pos10 || pos1 == pos11 || pos1 == pos12 || pos1 == pos13  || pos1 == pos14 ||
            pos2 == pos3 || pos2 == pos4 || pos2 == pos5 || pos2 == pos6 || pos2 == pos7 || pos2 == pos8 || pos2 == pos9 || pos2 == pos10 || pos2 == pos11 || pos2 == pos12 || pos2 == pos13  || pos2 == pos14 ||
                pos3 == pos4 || pos3 == pos5 || pos3 == pos6 || pos3 == pos7 || pos3 == pos8 || pos3 == pos9 || pos3 == pos10 || pos3 == pos11 || pos3 == pos12 || pos3 == pos13  || pos3 == pos14 ||
                pos4 == pos5 || pos4 == pos6 || pos4 == pos7 || pos4 == pos8 || pos4 == pos9 || pos4 == pos10 || pos4 == pos11 || pos4 == pos12 || pos4 == pos13  || pos4 == pos14 ||
                pos5 == pos6 || pos5 == pos7 || pos5 == pos8 || pos5 == pos9 || pos5 == pos10 || pos5 == pos11 || pos5 == pos12 || pos5 == pos13  || pos5 == pos14 ||
                pos6 == pos7 || pos6 == pos8 || pos6 == pos9 || pos6 == pos10 || pos6 == pos11 || pos6 == pos12 || pos6 == pos13  || pos6 == pos14 ||
                pos7 == pos8 || pos7 == pos9 || pos7 == pos10 || pos7 == pos11 || pos7 == pos12 || pos7 == pos13  || pos7 == pos14 ||
                pos8 == pos9 || pos8 == pos10 || pos8 == pos11 || pos8 == pos12 || pos8 == pos13  || pos8 == pos14 ||
                pos9 == pos10 || pos9 == pos11 || pos9 == pos12 || pos9 == pos13  || pos9 == pos14 ||
                pos10 == pos11 || pos10 == pos12 || pos10 == pos13  || pos10 == pos14 ||
                pos11 == pos12 || pos11 == pos13 || pos11 == pos14 ||
                pos12 == pos13 || pos12 == pos14 ||
                pos13 == pos14 )

        {
            System.out.println( "      NOT  All different");
            return false;
        }
        else {
            System.out.println( "      All different");
            return true;
        }

    }


}