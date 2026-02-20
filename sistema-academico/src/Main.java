import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notas[] = new double[10];
        //Asignamos valores a cada posicion
        for(int i=0; i < notas.length; i++){
            System.out.println("Ingrese la nota del estudiante "+ i);
            notas[i] = sc.nextDouble();
        }
        System.out.println("El promedio de las notas es: "+ promedio(notas));
    }

    public static double promedio(double []notas){
        double suma = 0;
        for (int i = 0; i < notas.length; i++){
            suma += notas[i];
        }
        return suma / notas.length;
    }
}