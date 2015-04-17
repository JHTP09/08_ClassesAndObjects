package examples.section16;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

/**
 * @author Mohamed Elsayed
 */
public class DrawPanel extends JPanel
{
    private Random randomNumber = new Random();
    private MyLine[] lines;
    
    public DrawPanel()
    {
        setBackground(Color.WHITE );
        
        lines = new MyLine[ 5 + randomNumber.nextInt(5) ];
        
        for ( int i = 0; i < lines.length; i++ )
        {
            int x1 = randomNumber.nextInt( 300 );
            int y1 = randomNumber.nextInt( 300 );
            int x2 = randomNumber.nextInt( 300 );
            int y2 = randomNumber.nextInt( 300 );
            
            Color color = new Color( randomNumber.nextInt(256),
                    randomNumber.nextInt(256), randomNumber.nextInt(256) );
            
            lines[ i ] = new MyLine( x1, y1, x2, y2, color );
        }
    }
    
    @Override
    public void paintComponent( Graphics g )
    {
        super.paintComponent( g );
        
        for ( MyLine line : lines )
            line.draw( g );
    }
}
