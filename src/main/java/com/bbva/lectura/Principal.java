package com.bbva.lectura;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Principal {

    //Declaración de constante
    static final String propFileName = "Configuration.properties";

    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        ClassLoader classLoader = Principal.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(propFileName);

        prop.load(inputStream);
        System.out.println("La cadena de conexión de la bbdd es " +
                            prop.get("db.connectionstring"));

        int resultado = max(6,7,9,8,25,32,4);
        System.out.println("El resultado máximo es " + resultado);

        Castings();
    }

    //Un método con varargs es aquel que recibe un número variable de argumentos
    public static int max(int... valores){
        int max = Integer.MIN_VALUE;
        for(int valor : valores) {
            if(valor > max)
                max = valor;
        }
        return max;
    }

    //Un casting es una conversion de tipo
    public static void Castings(){
        double d = 100.04;

        //casting de tipo
        long l = (long)d;

        //casting de tipo
        int i = (int)l;
        System.out.println("Valor Double "+d);

        //parte fraccionaria perdida
        System.out.println("Valor Long "+l);

        //parte fraccionaria perdida
        System.out.println("Valor Int "+i);
    }
}
