package examples.section14.Test;

import examples.section14.Time;
/**
 *
 * @author Mohamed
 */
public class TimeTest 
{
    public static void main( String[] args )
    {
        Time time = new Time();
        
        System.out.printf( "The initial universal time is: %s\n",
                time.toUniversalString() );
        System.out.printf( "The initial standard time is: %s\n\n",
                time.toString() );
        
        time.setTime( 23, 23, 23 );
        System.out.printf( "Universal time after setTime is: %s\n", 
                time.toUniversalString() );
        System.out.printf( "Standard time after setTime is: %s\n",
                time.toString() );
        
        try
        {
            time.setTime( 99, 99, 99 );
        }
        catch( IllegalArgumentException e )
        {
            System.out.printf( "\nException: %s\n\n", e.getMessage() );
        }
        
        System.out.println( "After attempting invalid values:" );
        System.out.printf( "Universal time: %s\n", time.toUniversalString() );
        System.out.printf( "Standard time: %s\n", time );
    }
}
