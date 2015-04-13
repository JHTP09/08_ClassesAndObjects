package examples.section5;

/**
 * @author Mohamed
 */
public class TimeTest 
{
    public static void main( String[] args )
    {
        Time time1 = new Time();
        Time time2 = new Time( 2 );
        Time time3 = new Time( 21, 34 );
        Time time4 = new Time( 12, 25, 42 );
        Time time5 = new Time( time4 );
        
        System.out.println( "Constructed with:" );
        System.out.printf( "%s\n\t%s\n\t%6s\n", 
                "time1: all arguments defaulted",
                time1.toUniversalString(), time1 );
        
        System.out.printf( "%s\n\t%s\n\t%6s\n", 
                "time2: hour specified; minute and second defaulted",
                time2.toUniversalString(), time2 );
        
        System.out.printf( "%s\n\t%s\n\t%6s\n", 
                "time3: hour and minute specified; second defaulted",
                time3.toUniversalString(), time3 );
        
        System.out.printf( "%s\n\t%s\n\t%6s\n", 
                "time4: hour, minute and second specified",
                time4.toUniversalString(), time4 );
        
        System.out.printf( "%s\n\t%s\n\t%6s\n", 
                "time5: Time object",
                time5.toUniversalString(), time5 );
        
        try
        {
            Time time6 = new Time( 27, 67, 90 );
        }
        catch( IllegalArgumentException e )
        {
            System.out.printf( "Exception while initializing time6: %s\n", 
                    e.getMessage() );
        }
    }
}