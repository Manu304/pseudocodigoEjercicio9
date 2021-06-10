import java.util.Scanner;

//202030799 Manuel Rojas
//Se leen desde teclado pares de temperaturas (T1 y T2)
//hasta que T1 sea cero. Hallar el promedio de las
//temperaturas ingresadas que est�n comprendidas entre 5� y 15� (incluidos)
public class Ejercicio9Parte2 {
    public static void main(String[] args) {
        int totalTemp = 0, contadorTemp = 0;
        int t1, t2;
        float promedio;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese la primera temperatura: ");
            t1 = scanner.nextInt();
            System.out.print("Ingrese la segunda temperatura: ");
            t2 = scanner.nextInt();
            if(t1 != 0){
                if((t1 >= 5) && (t1 <= 15)){
                    totalTemp += t1;
                    contadorTemp++;
                }
                if((t2 >= 5) && (t2 <= 15)){
                    totalTemp += t2;
                    contadorTemp++;
                }
            } 
        } while (t1 != 0);
        if (contadorTemp == 0){
            promedio = (float) 0;
        }else{
            promedio = (float) (totalTemp / contadorTemp);
        }
        System.out.println("El promedio de las temperaturas ingresadas que estan comprendidas entre 5° y 15° es: " + promedio + "°.");
    } 
}