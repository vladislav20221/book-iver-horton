package javaapplication1;

import java.awt.Color;
import java.awt.geom.Point2D;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vladislav
 */
public class Glava_5 {
    private static String [] text;
    
    public static void main ( String ... args ) {
        try {
            Class.forName( Animals.class.getName() );
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Glava_5.class.getName()).log(Level.SEVERE, null, ex);
        }
        Animals animal_0 = new Animals();
        Animals animal_1 = new Animals();
        Animals animal_2 = new Animals();
        Animals animal_3 = new Animals();
        Animals animal_4;
        animal_4 = new Animals();
        System.out.println( Animals.N );
    }

    public static void create ( final String [] text ) {        
    
    }
}

class Animals {
    public static int N = 0;
    private String name;
    private Color colorGlasses;
    private int age;
    private static int[] list;
    
    static {// Ститический инициализирующий блок
        System.out.println("Работа инициализирующего блока.");
        list = new int [100];
        for ( int i = 0; i < list.length; i++ )
            list[i] = (int)(Math.random()*50);
        for ( int i: list )
            System.out.print( i+" " );
        System.out.println();
    }
    // Обычный инициализирующий блок
    { N++; }
    
    public Animals ( String name, Color colorGlasses, int age ) {
        this.name = name;
        this.colorGlasses = colorGlasses;
        this.age = age;
    }
    public Animals () {}
    public static int getCount () { return N; }
}

class Сat {/**--- Детали определения ---**/}