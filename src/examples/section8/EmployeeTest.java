package examples.section8;

/**
 *
 * @author Mohamed
 */
public class EmployeeTest 
{
    public static void main( String[] args )
    {
        Date birth = new Date( 17, 5, 1980 );
        Date hire = new Date( 23, 11, 2000 );
        Employee emp = new Employee( "Ahmed", "Hassan", birth, hire );
        
        System.out.println( emp );
    }
}
