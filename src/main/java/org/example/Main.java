package org.example;

import java.util.List;



import static java.util.stream.Collectors.toList;


public class Main {
    public static void main(String[] args) {

        // Programacion Funcional

        // Interfaces Funcionales: Son interfaces con 1 unico metodo abstracto.
        // @FuncionalInterface
        // public void operacion(Integer x, Integer y);

        // Expresiones lambda: Representan una operación -> (flecha) / metodo implementado.
        // ej: s -> System.out.println(s)

        // (La flecha lambda se realiza con el signo menos seguido del signo mayor que - > )


        // Referencia a metodos: Utilizando el :: (operador de ambito), para hacer referencia a una funcion
        // de una clase especifica (System.out::println)

        // Streams: Encapsulamiento de Colecciones para trabajarlas mediante la concatenacion de diferentes
        // métodos y filtros (que no mantienen estado), es decir, que no modifican al original.

        //EJ:

        List<String> nombres = List.of ("Cristian", "Mariana", "Carlos", "Luciana");

        List<String> nombresConC = nombres.stream()
                .filter(nombre -> nombre.charAt(0) == 'C')
                .collect(toList());

        System.out.println("Lista original:");
        nombres.forEach(System.out::println);

        System.out.println("Lista filtrada:");
        nombresConC.forEach(System.out::println);

    }
}