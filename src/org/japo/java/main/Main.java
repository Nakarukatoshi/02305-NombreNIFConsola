/* 
 * Copyright 2019 Javier Monterde - javier.monterde.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Scanner;

/**
 *
 * @author Javier Monterde - javier.monterde.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN = new Scanner(System.in);

    public static void main(String[] args) {
        //Solicitamos al usuario su nombre.
        System.out.print("Por favor, introduzca su nombre: ");
        String nombre = SCN.nextLine();

        //Ponemos la primera letra en mayúscula
        //(no lo hemos visto, mejor lo comento, pero se qué hace, lo juro).
//        nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1);

        //Le devolvemos el valor introducido.
        System.out.println("Usted se llama: " + nombre + ".");
    }
}
