package com.edu.lectures;

public class lecture implements Comparable <lecture>{


    public String name;
    public Double start;
    public Double end;
    double getStart(){return start;}
    double getEnd(){return end;}
    @Override
    public String toString() {
        return name + ": " + start + " - " + end + " .";
    }
    public int compareTo(lecture l)
    {
        double b = (start-l.getStart())*100;
        if (b == 0)
            b = (l.getEnd() - end) * -100;
        int a = (int) b;
        return a;
    }
}
