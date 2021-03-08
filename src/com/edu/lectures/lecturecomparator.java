package com.edu.lectures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class lecturecomparator implements Comparator<lecture>
{
    public int compare(lecture l1, lecture l2)
    {
        int res = l1.compareTo(l2);
        return res;
    }
    public void sort(ArrayList<lecture> a)
    {
        Collections.sort(a,new lecturecomparator());
    }

}
