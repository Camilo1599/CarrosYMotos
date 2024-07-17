import java.util.Scanner;


public class CarrosMotos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean flag = true;
        System.out.println("Ingrese la cantidad maxima del taller: ");
        int maxEmployees = scanner.nextInt();
        String workerName = "";
        
        String[] employeesName = new String[maxEmployees];        
        String[][] vehicleType = new String[maxEmployees][2];        
        String[][][] vehicleDetails = new String[maxEmployees][2][4];
        System.out.println("Ingrese el numero de trabajos a registrar: ");
        int maxJobs = scanner.nextInt();
        

        do {
            if(maxJobs > maxEmployees){
                System.out.println("La cantidad de trabajos excede el limite\nPor favor ingrese un valor valido.");

                System.out.println("Ingrese el numero de trabajos a registrar: ");
                maxJobs = scanner.nextInt();

                
            }else{
                flag = false;
                
            }
            
        } while (flag);
        
        flag = true;

        do {
        System.out.println("Cual es tu opcion: \n1. Registrar un nuevo vehiculo \n2. Mostrar Tabla de vehiculos \n3. Buscar vehiculo \n4. Actualizar Estado del vehiculo \n5. Salir");
            int option = scanner.nextInt();

            if(option == 5){
                flag = false;
            } else if( option == 1){
                System.out.println("Ingrese el nombre del Empleado: ");
                workerName = scanner.next().toLowerCase();

                for(int i = 0; i < maxEmployees; i++){
                    if(employeesName[i] == null){
                        employeesName[i] = workerName;
                        break;
                    }else if(employeesName[i] != null){

                        System.out.println(employeesName[i] + "\n\n");
                    }
                }
                System.out.println("Ingrese el nombre tipo de vehiculo: \n1. Carro \n2. Moto");
                int vehicleTypeOption = scanner.nextInt();

                if(vehicleTypeOption == 1){
                    for(int i=0; i < maxEmployees; i++){

                    }
                }

                
            }else if(option == 2){

            }
        

        } while (flag);
        


        scanner.close();

    }
}