package javaapplication1;

import java.awt.Color;
/**
 * Выполнение заданий к первой главе книги
 * @author Vladislav
 */
public class Glava_2 {

    public static void main (String[] args) {        
        byte a = 1;
        System.out.println( "\tЗадание \u2116 1" );
        System.out.println( "Начальное значение: "+a+"\tумноженное 8 раз на 2: "+(a<<8) );
        
        double d = 1234.5678;
        long c = (long) Math.floor(d);
        short dd = (short) Math.floor((d-c)*10000);
        System.out.println( "\n\tЗадание \u2116 2" );
        System.out.println( "данное число (double): "+d
                           +"\nЦелая чать (long): "+c+"\tДробная часть (short): "+dd
                           +"\nСоставное число (long.short): "+c+"."+dd );
        
        double Ds = 865_000;
        double Dz = 7_600;
        double Vs = (4*Math.PI*Math.pow(Ds/2, 3))/3;
        double Vz = (4*Math.PI*Math.pow(Dz/2, 3))/3;
        double sz = Vs/Vz;
        System.out.println( "\n\tЗадание \u2116 3" );
        System.out.println( "Диаметр солнца: "+Ds+" миль\n"
                           +"Диаметр земли: "+Dz+" миль\n"
                           +"Объём солнца: "+Vs+" миль куб\n"
                           +"Объём земли: "+Vz+" миль куб\n"
                           +"Отношение объёма солнца к объёму земли: "+sz );
        
    }            
}

