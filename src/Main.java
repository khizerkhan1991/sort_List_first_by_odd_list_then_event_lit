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

        sortList(unsortedList);

        unsortedList.clear();
        boolean doNeedAnotherValue = true;

        System.out.println("enter number for a new list to sort and write 'end'5 when you want to end user input");
        while (doNeedAnotherValue){

            Scanner sc= new Scanner(System.in);

            if(sc.hasNext("end")){
                System.out.println("the input is end");
                break;
            }
            else {

                int number = sc.nextInt();
                System.out.println("the input is "+number);
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
        BinarySearchTree evenTree = new BinarySearchTree();
        BinarySearchTree oddTree = new BinarySearchTree();
        List<Integer> sortedList = new ArrayList();


        for (Integer number : unsortedList){

            if(isNumberIsEven(number)){
                evenTree.insert(number);
                continue;
            }

            oddTree.insert(number);
        }

        sortedList.addAll(oddTree.getList());
        sortedList.addAll(evenTree.getList());

        System.out.println("sorted list "+sortedList);
    }
}
