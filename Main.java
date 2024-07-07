import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        1.Write a Java program to test if the first and the last element of an array of
//        integers are same. The length of the array must be greater than or equal to
//        2
//        Test Data:
//        array = 50, -20, 0, 30, 40, 60, 10
//        int[] no = new int[7];
//        no[0]=50;
//        no[1]=-20;
//        no[2]=0;
//        no[3]=30;
//        no[4]=40;
//        no[5]=60;
//        no[6]=50;
//        boolean result = ( no[0] == no[no.length - 1]);
//        System.out.println(result);

//        2.Write a Java program to find the numbers greater than the average of the
//        numbers of a given array.
//                Original Array:
//[1, 4, 17, 7, 25, 3, 100]
//        int[] avg = new int[7];
//        avg[0]=1;
//        avg[1]=4;
//        avg[2]=17;
//        avg[3]=7;
//        avg[4]=25;
//        avg[5]=3;
//        avg[6]=100;
//
//        int sum = 0;
//        for (int i = 0; i < avg.length; i++) {
//            sum += avg[i];
//        }
//
//        double avar = (double) sum / avg.length;
//        System.out.println("The average of the said array is: " + avar);
//
//        int Greater = 0;
//        for (int i = 0; i < avg.length; i++) {
//            if (avg[i] > avar) {
//                Greater++;
//                System.out.print("The number of elements greater than the average is: "+ avg[i] );
//
//
//            }
//
//        }
//        3.Write a Java program to get the larger value between first and last
//        element of an array of integers.
//        Original Array:
//[20, 30, 40]
//
//        ArrayList<Integer> no = new ArrayList<>();
//        ArrayList<Integer> swap = new ArrayList<>(no); // Q 4
//
//        no.add(10);
//        no.add(70);
//        no.add(40);
//        no.add(60);
//        int largerValue = Math.max(no.get(0), no.get(no.size() - 1));
//        System.out.println("Larger value between first and last element:"+ largerValue);
//        4.Write a Java program to swap the first and last elements of an array and
//        create a new array.
//
//        System.out.println("New array after swapping the first and last elements: "+ no);

//        System.out.println("Original list: " + no);
//
//        // Swap first and last elements
//        int temp = no.get(0);
//        no.set(0, no.get(no.size() - 1));
//        no.set(no.size() - 1, temp);
//        System.out.println("New array after swapping the first and last elements: " + no);
//        5. Write a program that places the odd elements of an array before the
//        even elements.
//        Original Array:
//[2,3,40,1,5,9,4,10,7]

//        ArrayList<Integer> no = new ArrayList<>();
//        ArrayList<Integer> odd = new ArrayList<>();
//        ArrayList<Integer> even = new ArrayList<>();
//
//        no.add(2);
//        no.add(3);
//        no.add(40);
//        no.add(1);
//        no.add(5);
//        no.add(9);
//        no.add(4);
//        no.add(10);
//        no.add(7);
//        System.out.println("Original List: " + no);
//        for (int num : no) {
//            if (num % 2 == 0) {
//                even.add(num);
//            } else {
//                odd.add(num);
//            }
//        }
//
//        ArrayList<Integer> newList = new ArrayList<>();
//        newList.addAll(odd);
//        newList.addAll(even);
//        System.out.println( newList);
//        Write a program that test the equality of two arrays.
//[2,3,6,6,4] [2,3,6,6,4]
//        int[] array1 = {2,3,6,6,4};
//        int[] array2 = {2,7,6,6,4};
//boolean test = (Arrays.equals(array1, array2));
//        System.out.println(test);

    }}