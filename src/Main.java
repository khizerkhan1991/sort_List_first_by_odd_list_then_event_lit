import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer>  unsortedLinkList = new LinkedList<>();

        unsortedLinkList.add(1);
        unsortedLinkList.add(2);
        unsortedLinkList.add(4);
        unsortedLinkList.add(3);
        unsortedLinkList.add(7);
        unsortedLinkList.add(16);
        System.out.println("############################### EXAMPLE ###############################");
        sortList(unsortedLinkList);
        System.out.println("############################### EXAMPLE ###############################");

        unsortedLinkList.clear();
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
                unsortedLinkList.add(number);
                System.out.println("type end if you don't want to add more in the list");
            }
        }

        sortList(unsortedLinkList);
    }

    private static boolean isNumberIsEven(Integer number){

        return (number % 2 == 0) ? Boolean.TRUE : Boolean.FALSE;
    }

    public static void sortList(LinkedList<Integer> list){

        System.out.println("unsorted List "+list);


        LinkedList<Integer>  evenList = new LinkedList<>();
        LinkedList<Integer>  oddList = new LinkedList<>();

        for (Integer number : list){

            if(isNumberIsEven(number)){
                evenList.add(number);

                continue;
            }

            oddList.add(number);
        }

        oddList.addAll(evenList);
        System.out.println("sorted list "+oddList);
    }
}
