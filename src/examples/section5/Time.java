package examples.section5;

/**
 * @author Mohamed
 */
public class Time 
{
    private int hour;
    private int minute;
    private int second;
 
    // Constructors
    public Time()
    {
        this( 0, 0, 0 );
    }
    
    public Time( int h )
    {
        this( h, 0, 0 );
    }
    
    public Time( int h, int m )
    {
        this( h, m, 0 );
    }
    public Time( int h, int m, int s )
    {
        setTime( h, m, s );
    }
    
    public Time( Time t )
    {
        this( t.getHour(), t.getMinute(), t.getSecond() );
    }
    
    // Mutator methods
    public void setTime( int h, int m, int s )
    {
        setHour( h );
        setMinute( m );
        setSecond( s );
    }
    
    public void setHour( int h )
    {
        if ( h >= 0 && h < 24 )
            hour = h;
        else
            throw new IllegalArgumentException( "Hour must be 0-23" );
    }
    
    public void setMinute( int m )
    {
        if ( m >= 0 && m < 60 )
            minute = m;
        else
            throw new IllegalArgumentException( "Minute must be 0-59" );
    }
    
    public void setSecond( int s )
    {
        if ( s >= 0 && s < 60 )
            second = s;
        else
            throw new IllegalArgumentException( "Second must be 0-59" );
    }
    
    // Query/Accessor methods
    public int getHour()
    {
        return hour;
    }
    
    public int getMinute()
    {
        return minute;
    }
    
    public int getSecond()
    {
        return second;
    }
    
    public String toUniversalString()
    {
        return String.format( "%02d:%02d:%02d",
                getHour(), getMinute(), getSecond() );
    }
    
    @Override
    public String toString()
    {
        return String.format( "%d:%02d:%02d %s", 
                ( ( getHour() == 0 || getHour() == 12 ) ? 12 : getHour() % 12 ),
                getMinute(), getSecond(), ( ( getHour() < 12 ) ? "AM" : "PM" ) );
    }
}