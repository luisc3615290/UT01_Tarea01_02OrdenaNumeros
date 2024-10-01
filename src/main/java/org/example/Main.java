package org.example;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        if (args==null || args.length==0){
           System.err.println("No se ha recibido lista de primos del .jar anterior");
           System.exit(-1);
        }
         */
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader bf = new BufferedReader(isr);
            // Obtenemos el stream de lectura de la entrada estándar
            // utilizamos un lector con Buffered, para no perder ningún dato
            String lineaTeclado = null;
            try {
                //Mostramos que el proceso que está escribiendo es el que está
                //leyendo los datos.
                int i = 0;
                ArrayList<String> list = new ArrayList<String>();
                while ((lineaTeclado = bf.readLine()) != null) {
                    if (args==null || args.length==0){
                        System.err.println("No se ha recibido lista de primos del .jar anterior");
                        System.exit(-1);
                    }
                    else {
                        list.add(lineaTeclado);
                        i++;
                    }
                    //Vamos leyendo y mostrando los datos
                    //System.out.println(lineaTeclado);
                }
                String[] listaArrayString = new String[i];
                int j = 0;
                for (String element : list) {
                    listaArrayString[j] = element;
                    j++;
                    //System.out.println(element);
                }
                OrdenaArrays.OrdenarArray(OrdenaArrays.convertToIntArray(listaArrayString));

            } catch (IOException ex) {
                System.err.println("Se ha producido un error de E/S.");
                System.err.println(ex.toString());

        }
        //int [] array1 = {200, 6, 27, 3};
        //String [] array2 = {"200", "6", "27", "3"};
        //String[] array3 = args;
        //for (String arg : args){
        //    System.out.println(arg);
        //}
        //OrdenaArrays.OrdenarArray(args[0]);
        //OrdenaArrays.OrdenarArray(OrdenaArrays.convertToIntArray(args));
        //System.out.println(Arrays.toString(array1));


    }
}
