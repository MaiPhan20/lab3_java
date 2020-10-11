package ss7_8;

public class ss8_6 {
    String[] empID = new String[5];
    public void createArray() {
        System.out.println("Creating Array. Please wait...");

        for(int count = 1; count < empID.length; count++){

            empID[count]= "E00"+count;
        }
    }

    public void printArray() {
        System.out.println("The Array is:");
        for(int count = 1; count < empID.length; count++){
            System.out.println("Employee ID is: "+ empID[count]);
        }
    }

    public static void main(String[] args) {

        StringArray objStrArray = new StringArray(); // line 1

        objStrArray.createArray();

        objStrArray.printArray();
    }
}
