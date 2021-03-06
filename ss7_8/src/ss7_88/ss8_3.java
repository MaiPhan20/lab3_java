package ss7_8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ss8_3 {
    ArrayList marks = new ArrayList();
    public void storeMarks(){
        System.out.println("Storing marks. Please wait...");
        marks.add(67);
        marks.add(50);
        marks.add(45);
        marks.add(75);
    }
    public void displayMarks() {
        System.out.println("Marks are:");
        System.out.println("Iterating ArrayList using for loop:");
        for (int i = 0; i < marks.size(); i++) {
            System.out.println(marks.get(i));
        }
        System.out.println("-------------------------------------");
        Iterator imarks = marks.iterator();
        System.out.println("Iterating ArrayList using Iterator:");
        while (imarks.hasNext()) {
            System.out.println(imarks.next());
        }
        System.out.println("-------------------------------------");
        Collections.sort(marks);
        System.out.println("Sorted list is: " + marks);
    }

    public static void main(String[] args) {
        ArrayLists obj = new ArrayLists();
        obj.storeMarks();
        obj.displayMarks();
    }
}


