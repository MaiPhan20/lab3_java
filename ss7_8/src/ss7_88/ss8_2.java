package ss7_8;

public class ss8_2 {
    int marks[][];

    public void storeMarks() {
        marks = new int[4][2]; // line 2
        System.out.println("Storing Marks. Please wait...");
        marks[0][0] = 23; // line 3
        marks[0][1] = 65;
        marks[1][0] = 42;
        marks[1][1] = 47;
        marks[2][0] = 60;
        marks[2][1] = 75;
        marks[3][0] = 75;
        marks[3][1] = 50;
    }

    public void displayMarks() {
        System.out.println("Marks are:");
        System.out.println("Roll no.1:" + marks[0][0]+ "," + marks[0][1]);
        System.out.println("Roll no.2:" + marks[1][0]+ "," + marks[1][1]);
        System.out.println("Roll no.3:" + marks[2][0]+ "," + marks[2][1]);
        System.out.println("Roll no.4:" + marks[3][0]+ "," + marks[3][1]);
    }

    public static void main(String[] args) {
        TwoDimension twoDimenObj = new TwoDimension();
        twoDimenObj.storeMarks();
        twoDimenObj.displayMarks();
    }
}

