package examples.section8;

/**
 *
 * @author Mohamed
 */
public class Employee 
{
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;
    
    public Employee( String first, String last, Date birth, Date hire )
    {
        firstName = first;
        lastName = last;
        birthDate = birth;
        hireDate = hire;
    }
    
    @Override
    public String toString()
    {
        return String.format( "%s, %s  Birthday: %s  Hired: %s",
                firstName, lastName, birthDate, hireDate );
    }
}
