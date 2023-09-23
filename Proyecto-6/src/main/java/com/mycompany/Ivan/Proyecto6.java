package com.mycompany.Ivan;
import java.util.Scanner;
public class Proyecto6 {
public static void main(String[] args) {
      Scanner lectura = new Scanner (System.in);
      float n1,n2,r;
      System.out.print("Ingresa el primer numero :");
      n1=lectura.nextFloat();
      System.out.print("Ingresa el segundo numero :");
      n2=lectura.nextFloat();
      r=n1+n2;
      System.out.print("El resultado es"+r);
    }
}
