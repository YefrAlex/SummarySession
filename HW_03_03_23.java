package SummarySession;

import java.util.*;

public class HW_03_03_23 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 4, 6, 7));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(1, 3, 4));
        ArrayList<Integer> list3 = new ArrayList<>(List.of(1, 2, 4, 6, 7, 47, 53, 3, 12));

        //getSummaryList(list1, list2);
         getMiddle(list3);
    }
//    Даны два ArrayList, элементы которых упорядочены. Объединить их в трерий ArrayList, элементы которого тоже должны быть отсортированы.
//    Example 1:
//    Input: list1 = [1,2,4], list2 = [1,3,4]
//    Output: [1,1,2,3,4,4]
//    Example 2:
//    Input: list1 = [], list2 = []
//    Output: []
//    Example 3:
//    Input: list1 = [], list2 = [0]
//    Output: [0]

    public static void getSummaryList(ArrayList list1, ArrayList list2) {
        ArrayList<Integer> listSum = new ArrayList<>();
//    Input: list1 = [1,2,4], list2 = [1,3,4]
        Iterator<Integer> list1It = list1.iterator();
        Iterator<Integer> list2It = list2.iterator();
        int first = list1It.next();
        int second = list2It.next();
        System.out.println(" ArrayList № 1 " + list1);
        System.out.println(" ArrayList № 2 " + list2);

        for (int k = 0; k < list1.size() + list2.size(); ) {
            if (first >= second) {
                listSum.add(k, second);
                k++;
                if (list2It.hasNext()) {
                    second = list2It.next();
                } else {
                    second = Integer.MAX_VALUE;
                }
            }
            if (first < second) {
                listSum.add(k, first);
                k++;
                if (list1It.hasNext()) {
                    first = list1It.next();
                } else {
                    first = Integer.MAX_VALUE;
                }
            }
        }
        System.out.println("Объедененный ArrayList  " + listSum);
    }

    //    Task 2.
//    Пусть дан ArrayList нечетной длины. Используя только Iterator (не прибегая к индексам и длине списка), вывести на экран элемент, находящийся ровно посередине списка.
//    Example 1:
//    Input: list = [1,2,4]
//    Output: 2
//    Example 2:
//    Input: list = [1,2,3,4,5]
//    Output: 3
//    Example 3:
//    Input: list = [1]
//    Output: 1
    public static void getMiddle(ArrayList list3) {
        System.out.println("Найти средний элемент в ArrayList " + list3);
        Iterator<Integer> firstFlag = list3.iterator();
        Iterator<Integer> secondFlag = list3.iterator();
        firstFlag.next();
        int a =secondFlag.next();
        
        while (firstFlag.hasNext()) {

            firstFlag.next();
            firstFlag.next();

            a = secondFlag.next();

        }
        System.out.println("средний элемент равен  " + a);
    }
}


