package com.edu;
import java.util.Scanner;
import java.util.ArrayList;
import com.edu.lectures.lecture;
import com.edu.lectures.lecturecomparator;

public class Main {

    public static void main(String[] args)
    {
        ArrayList<lecture> lecturelist = new ArrayList<lecture>();
        System.out.print("Enter N: \n");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        lecture templecture;
        for (int i = 1; i <= N; i++)
        {
            templecture = new lecture();
            System.out.print("Enter name: \n");
            templecture.name = in.next();
            System.out.print("Enter start: \n");
            templecture.start = in.nextDouble();
            System.out.print("Enter end: \n");
            templecture.end = in.nextDouble();
            lecturelist.add(templecture);
            templecture = null;
        }
        lecturecomparator lcomparat = new lecturecomparator();
        lcomparat.sort(lecturelist);
        System.out.println("Sorted lectures: ");
        for (lecture Lecture : lecturelist)
        {
            System.out.println(Lecture.toString());
        }
    }
}
