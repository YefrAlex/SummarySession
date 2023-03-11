package SummarySession;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class HW_10_03_23 {
    public static void main(String[] args) {

        int[] myArray  = new int[] {1, 1, 2, 2, 3,3,3,3,4,5,5,5,6,6,6,7,8,8,8,8,8,8,9,9};
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 1, 2, 2, 3,3,3,3,4,5,5,5,6,6,6,7,8,8,8,8,8,8,9,9));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(1, 2, 2, 3, 3,1,4));
//        getUniqNumber(list2);
        getUniqList(list1);
        getUniqArray(myArray);

    }
    /*
 1 уровень сложности: Task 1.
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
 */
    static void getUniqArray(int[] myArray){
        int[] uniqArray = new int [myArray.length];
        int a = myArray[0];
        int index = 1;
        uniqArray[0] = a;
        for (int i=1; i < myArray.length ; i++) {
            if (a != myArray[i]){
                a = myArray[i];
                uniqArray[index] = a;
                index++;
            }
         }
        System.out.println(Arrays.toString(uniqArray));

    }
// не верно прочитал условие поэтому сначала сделал вариант решения с  ArrayList
    static void getUniqList (ArrayList list1) {
        ArrayList<Integer> listUniq = new ArrayList<> ();
        Iterator<Integer>  first = list1.iterator();
        Iterator<Integer>  second = list1.iterator();
        int a =first.next();
        listUniq.add(a);
        while (first.hasNext()){
            int b = first.next();
            if (b != a){
                listUniq.add(b);
                a=b;
            }
        }
        System.out.println(listUniq);
    }

    /*
    Task 2.
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
Example 1:
Input: nums = [2,2,1]
Output: 1
     */
     static void getUniqNumber (ArrayList list2) {
        int uniqNumber = 0;
         for (int i = 0; i < list2.size(); i++) {
             uniqNumber ^= (int)list2.get(i);
         }
         System.out.println(uniqNumber);
     }
}
