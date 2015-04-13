package examples.section11;

/**
 *
 * @author Mohamed
 */
public class EmployeeTest 
{
    public static void main( String[] args )
    {
        System.out.printf( "Employee before instantiation: %d\n", 
                Employee.getCount() );
        
        Employee emp1 = new Employee( "Susan", "Baker" );
        Employee emp2 = new Employee( "Bob", "Blue" );
        
        System.out.println( "\nEmployees after instantiation:" );
        System.out.printf( "via emp1.getCount(): %d\n", emp1.getCount() );
        System.out.printf( "via emp2.getCount(): %d\n", emp2.getCount() );
        System.out.printf( "via Employee.getCount(): %d\n", Employee.getCount() );
        
        System.out.printf( "\nEmployee1: %s %s\n", 
                emp1.getFirstName(), emp1.getLastName() );
        System.out.printf( "Employee2: %s %s\n", 
                emp2.getFirstName(), emp2.getLastName() );
        
        emp1 = null;
        emp2 = null;
    }
}
