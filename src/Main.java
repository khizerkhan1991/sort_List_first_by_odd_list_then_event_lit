import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Integer> unsortedList = new ArrayList();
        unsortedList.add(1);
        unsortedList.add(2);
        unsortedList.add(4);
        unsortedList.add(3);
        unsortedList.add(7);
        unsortedList.add(16);
        System.out.println("############################### EXAMPLE ###############################");
        sortList(unsortedList);
        System.out.println("############################### EXAMPLE ###############################");

        unsortedList.clear();
        boolean doNeedAnotherValue = true;

        System.out.println("enter number for a new list to sort and write 'end' when you want to end user input");
        while (doNeedAnotherValue){

            Scanner sc= new Scanner(System.in);

            if(sc.hasNext("end")){
                System.out.println("the input is end");
                break;
            }
            else {

                int number = sc.nextInt();
                unsortedList.add(number);
                System.out.println("type end if you don't want to add more in the list");
            }
        }

        sortList(unsortedList);
    }

    private static boolean isNumberIsEven(Integer number){

        return (number % 2 == 0) ? Boolean.TRUE : Boolean.FALSE;
    }

    public static void sortList(List<Integer> unsortedList){

        System.out.println("unsorted List "+unsortedList);

        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        List<Integer> sortedList = new ArrayList();


        for (Integer number : unsortedList){

            if(isNumberIsEven(number)){
                evenList.add(number);
                continue;
            }

            oddList.add(number);
        }

        Collections.sort(oddList);
        Collections.sort(evenList);
        sortedList.addAll(oddList);
        sortedList.addAll(evenList);

        System.out.println("sorted list "+sortedList);
    }
}
