package SummarySession;

import java.util.Arrays;

public class HW_25_02_23 {
    public static void main(String[] args) {
        int arr[] = {11, 0, 1, 5, 4, 8, 9, 3, 2, 6, 12, 19, 7, -6, 50, 18, 14, 65, -37};
        int n = 12;
   // getTwoNumbers(arr,n);
        int arrNum[] = {9,9,9,9,9};
        getInkris(arrNum);
    }
/* Дан массив nums целых чисел и целое число target, найдите индексы двух элементов массива,
   чтобы сумма этих значений была равна target.
    Предполагается, что существует всегда только одно решение и нельзя использовать один и тот же элемент массива дважды.
 */
    public static void getTwoNumbers(int[] arr, int n) {
        int a = 0;
        int b = 0;
        for (int i = 0, j = i + 1; i < arr.length -1; j++) {
            a = arr[i];
            b = n - a;

            if (j == arr.length) {
                i = i + 1;
                j = i - 1; // если задать j = 0 - пары будут повторятся
            }
            if (b == arr[j]) {
                System.out.println("=========next indexs giv  " + n +" in summ===============");
                System.out.println("First index is: " + i);
                System.out.println("Second index is: " + j);
                // break;   если ещем только одну пару чисел останавливаем поиск
                i = i + 1;
                j = i - 1;// если задать j = 0 - пары будут повторятся
            }
        }
    }
    /* Дано целое число, представленное его разрядами, которые записаны в массив. Например, число 123 представляется массивом [1, 2, 3]. Получите массив, который преставляет сумму исходного числа и 1.


Example 1:


Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].*/

    public static void getInkris (int[] arrNum){
        String sum ="";


        for (int i = 0; i < arrNum.length; i++){
           sum = sum+arrNum[i];
           StringBuilder sb = new StringBuilder(sum);
        }
        int number = Integer.parseInt (sum) + 1;
        sum = number + "";
        StringBuilder sb = new StringBuilder(sum);
        char[] chars = sum.toCharArray();
        int []  numArr= new int [chars.length];

        for (int i = 0; i < numArr.length ; i++) {
            numArr[i] = Character.digit(chars[i],10);;
            System.out.print(numArr[i] + ",");
        }

    }
}
