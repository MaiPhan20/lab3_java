package ss7_8;

public class ss8_1 {
    int marks[];

    public void storeMarks() {

        marks = new int[4];
        System.out.println("Storing Marks. Please wait...");
        marks[0] = 65; // line 3
        marks[1] = 47;
        marks[2] = 75;
        marks[3] = 50;
    }

    public void displayMarks() {
        System.out.println("Marks are:");
        // Display the marks
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
    }

    public static void main(String[] args) {

        OneDimension oneDimenObj = new OneDimension();

        oneDimenObj.storeMarks();

        oneDimenObj.displayMarks();
    }
}

