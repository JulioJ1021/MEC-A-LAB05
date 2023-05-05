package com.mycompany.leerexcel;
import java.io.File;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

public class LeerExcel {

    public static void main(String[] args) {
        String archivo = "nacimientos.csv";
        Map<String, Integer> dic = new HashMap<>() {{
            put("Peso", 4);
            put("Talla", 5);
            put("T_Gestacion", 9);
            put("Cons_Pren", 10);
        }}; 

        try {
            Scanner scanner = new Scanner(new File("nacimientos.csv"));
            Scanner scn = new Scanner(System.in);
            String esp = scn.nextLine();
            // Leer cada línea del archivo
            if(scanner.hasNextLine()){
                System.out.println("Si");
            }else
                System.out.println("no ");
                
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] valores = linea.split(",");
                
                // Imprimir los valores separados
                /*for (String valor : valores) {
                    System.out.print(valor + " ");
                }
                System.out.println();*/
                System.out.println(valores[dic.get(esp)]);
            }

            // Cerrar el objeto Scanner
            scanner.close();
        }  catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
