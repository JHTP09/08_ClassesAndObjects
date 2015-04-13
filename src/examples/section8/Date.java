package examples.section8;

/**
 * @author Mohamed
 */
public class Date 
{
    private int day;
    private int month;
    private int year;
    
    private static final int[] daysOfMonth = 
    { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    
    public Date( int d, int m, int y )
    {
        month = checkMonth( m );
        day = checkDay( d );
        year = y;
        
        System.out.printf( "Date object constructor for date %s\n", this ); 
    }
    
    private int checkDay( int d )
    {
        if ( d > 0 && d <= daysOfMonth[ month ] )
            return d;
        
        if ( d == 29 && month == 2 && 
                ( year % 400 == 0 || ( year % 2 == 0 && year % 100 != 0 ) ) )
            return d;
        else
            throw new IllegalArgumentException( 
                    "day is out-of-range for the specified month and year " );
    }
    
    private int checkMonth( int m )
    {
        if ( m > 0 && m <= 12 )
            return m;
        else
            throw new IllegalArgumentException( "month must be 1-12" );
    }
    
    @Override
    public String toString()
    {
        return String.format( "%d/%d/%d", month, day, year );
    }
}