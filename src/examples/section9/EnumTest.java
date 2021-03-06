package examples.section9;

import java.util.EnumSet;

/**
 *
 * @author Mohamed
 */
public class EnumTest 
{
    public static void main( String[] args )
    {
        System.out.println( "All books:" );
        
        for ( Book book : Book.values() )
            System.out.printf( "%-10s%-45s%s\n", book, 
                    book.getTitle() ,book.getCopyrightYear() );
        
        System.out.println( "\n\nDisplay a range of enum constants:" );
        
        for ( Book book : EnumSet.range( Book.JHTP, Book.CPPHTP) )
            System.out.printf( "%-10s%-45s%s\n", book, 
                    book.getTitle() ,book.getCopyrightYear() );
    }
}
