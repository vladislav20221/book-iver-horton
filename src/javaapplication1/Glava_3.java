package javaapplication1;

/**
 *
 * @author Vladislav
 */
public class Glava_3 {
    
    public static void main ( String [] args ) {
        int sum = 0;
        Loop0:
        for ( int i = 0; i<=20; i++ ) {            
            for ( int j = 0; j<=10; j++ ) {
                if ( i*j>20 ) continue Loop0;
                System.out.println( "i = "+i+" j = "+j+"\t"+sum );
            }
        }         
    }
}
