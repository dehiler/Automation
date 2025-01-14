package co.sample.poo;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
System.out.println("ingrese el primer numero: ");
double n1 = numeros.nextInt();
System.out.println(numeros);
System.out.println("ingrese el segundo numero: ");
double n2 = numeros.nextInt();
System.out.println(numeros);
System.out.println("ingrese el tercer numero: ");
double n3 = numeros.nextInt();
System.out.println(numeros);

        Calculadora c1;
            c1 = new Calculadora(n1, n2, n3);

            if (n2 == 0){
                System.out.println("Error: no se puede dividir entre cero");
            }

            if (c1.getNum1() < c1.getNum2()){
                System.out.println("no se puede realizar la operación");
            } else {
                System.out.println(c1.suma ());
                System.out.println(c1.resta ());
                System.out.println(c1.multi ());
                System.out.println(c1.divi ());
                System.out.println(c1.suma3 ());
            }
        }
    }
