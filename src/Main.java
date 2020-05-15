import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> unsortedList = new ArrayList();
        unsortedList.add(1);
        unsortedList.add(2);
        unsortedList.add(4);
        unsortedList.add(3);
        unsortedList.add(7);
        unsortedList.add(16);
        unsortedList.add(21);
        unsortedList.add(101);
        unsortedList.add(8);

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

        System.out.println(sortedList);
    }

    private static boolean isNumberIsEven(Integer number){

        return (number % 2 == 0) ? Boolean.TRUE : Boolean.FALSE;
    }
}
