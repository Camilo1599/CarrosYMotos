import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad maxima del taller: ");
        int maxEmployees = scanner.nextInt();

        String[] employeesName = new String[maxEmployees];

        String[][] vehicleType = new String[maxEmployees][2];

        String[][][] vehicleDetails = new String[maxEmployees][2][4];
        


        scanner.close();

    }
}