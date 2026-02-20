import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notas[] = new double[10];
        //Asignamos valores a cada posicion
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese la nota del estudiante " + i);
            notas[i] = sc.nextDouble();
        }
        System.out.println("El promedio de las notas es: " + promedio(notas));
        System.out.println("La nota maxima del curso es: " + notaMaxima(notas));
        System.out.println("La nota minima del curso es: " + notaMinima(notas));
        System.out.println("Cantidad de estudiantes aprobados: " + cantidadAprobados(notas));
    }

    public static double promedio(double[] notas) {
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / notas.length;
    }
}

public static double notaMaxima(double notas[]) {
    double notaMax = 0;
    for(double nota : notas) {
        if(nota > notaMax) {
            notaMax = nota;
        }
    }
    return notaMax;
}

public static double notaMinima(double notas[]) {
    double notaMin = 5;
    for(double nota : notas) {
        if(nota < notaMin) {
            notaMin = nota;
        }
    }
    return notaMin;
}

public static byte cantidadAprobados(double notas[]) {
    byte cant = 0;
    for (double nota : notas) {
        if (nota >= 3) {
            cant++;
            }
        }
        return cant;
    }
}