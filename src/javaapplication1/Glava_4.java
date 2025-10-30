package javaapplication1;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author Vladislav
 */
public class Glava_4 {
    public static void main ( String ... args ) {
        //String a = "number number number number number number";
        //String c = ""+5+5;
        //a += c;
        //String b = "Number "+5+5;
        //System.out.println( a );        
        //System.out.println( a.substring( 14, 14+6 ) );        
        String str = "Проезжая по улочкам деревень и малых городков,\n"
                    +"в которых еще сохранились деревянные традиционные\n"
                    +"домики с резными наличниками и не тронутые вирусом\n"
                    +"пластикового сайдинга, я всегда краем глаза смотрю\n"
                    +"на окошки. И всегда радуюсь, когда вижу на окошке кошку.";        
        String str2 = "hellow word 1235";
        StringBuffer buf = new StringBuffer ();
        buf.append( str );
        buf.insert( 9, (str2+" ").toCharArray(), 0, 7 );
        String strN = buf.toString();
        System.out.println( strN );
    }
    private static void divisionText () {
        String str = "Проезжая по улочкам деревень и малых городков, "
                    +"в которых еще сохранились деревянные традиционные "
                    +"домики с резными наличниками и не тронутые вирусом "
                    +"пластикового сайдинга, я всегда краем глаза смотрю "
                    +"на окошки. И всегда радуюсь, когда вижу на окошке кошку.";
        int length = str.length();
        int pdt = length/30;
        StringBuffer buf = new StringBuffer ();
        //buf.ensureCapacity( 0 );
        //System.out.println( "Минимальная ёмкость: "+38 );
        for ( int index = 0; index < length; index += pdt ) {
            if ( index+pdt > length )
                buf.append( str, index, length );
            else
                buf.append( str, index, index+pdt );
            System.out.println( "Дилна строки: "+buf.length()+
                                " Ёмкость: "+buf.capacity()+
                                " По умолчанию: "+(buf.length()+16) );
        }
        System.out.println( buf.toString() );
    }
    private static void separatorSubString () {
        String str = "Проезжая по улочкам деревень и малых городков, "
                    +"в которых еще сохранились деревянные традиционные "
                    +"домики с резными наличниками и не тронутые вирусом "
                    +"пластикового сайдинга, я всегда краем глаза смотрю "
                    +"на окошки. И всегда радуюсь, когда вижу на окошке кошку.";
        char separator = ' ';   // Символ разделитель между словами
        int index = 0;
        int count = 0;
        do {
            count++;
            index = str.indexOf( separator, ++index );
        } while ( index != -1 );
        System.out.println( "count: "+count );
        String [] line = new String [count];
        index = 0;
        int endIndex;
        for ( int i = 0; i<count; i++ ) {
            endIndex = str.indexOf( separator, index );
            if ( endIndex == -1 )
                line[i] = str.substring(index);
            else
                line[i] = str.substring(index, endIndex);
            index = ++endIndex;
        }
        for ( String s: line )
            System.out.println( s );
    }
    private static void copyArrayRange () {
        byte[] b = new byte [10];
        for ( int i = 0; i < b.length; i++ )
            b[i] = (byte)(Math.random()*128);
        System.out.println( Arrays.toString( b ) );
        byte[] a = Arrays.copyOfRange( b, 5, 20 );        
        System.out.println( Arrays.toString( a ) );
    }
    private static void copyArray () {
        byte[] b = new byte [10];
        for ( int i = 0; i < b.length; i++ )
            b[i] = (byte)(Math.random()*128);
        System.out.print( "-" );
        for ( byte z: b )
            System.out.print( z+"-" );
        byte[] bS = Arrays.copyOf( b, 20 );
        System.out.print( "\n-" );
        for ( byte z: bS )
            System.out.print( z+"-" );
        System.out.println();
    }
    private static void standartSearch () {
        byte[] b = new byte [10_000];
        for ( int i = 0; i < b.length; i++ )
            b[i] = (byte)(Math.random()*128);              
        long time1 = System.currentTimeMillis();
        int index = Arrays.binarySearch( b, (byte) 50 );
        long time2 = System.currentTimeMillis();
        System.out.println( "time: "+(time2-time1)+" ms\t element: "+index );
    }
}
