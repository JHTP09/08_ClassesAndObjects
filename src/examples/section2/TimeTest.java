package examples.section2;

/**
 * @author Mohamed
 */
public class TimeTest 
{
    public static void main( String[] args )
    {
        Time time = new Time();
        
        System.out.printf( "%s: %s\n",
                "The initial universal time is", time.toUniversalString() );
        System.out.printf( "%s: %s\n\n",
                "The initial standard time is", time );
        
        time.setTime( 13, 34, 50 );
        System.out.printf( "%s: %s\n",
                "Universal time after setTime is", time.toUniversalString() );
        System.out.printf( "%s: %s\n\n",
                "Standard time after setTime is", time );
        
        try
        {
            time.setTime( 99, 99, 99 );
        }
        catch( IllegalArgumentException e )
        {
            System.out.printf( "Exception: %s\n\n", e.getMessage() );
        }
        
        System.out.println( "After attempting invalid settings" );
        System.out.printf( "%s: %s\n",
                "Universal time", time.toUniversalString() );
        System.out.printf( "%s: %s\n\n",
                "Standard time", time );
    }
}
