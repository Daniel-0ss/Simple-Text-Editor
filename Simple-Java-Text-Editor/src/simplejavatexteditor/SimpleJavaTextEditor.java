/**
 * @name        Simple Java NotePad
 * @package     ph.notepad
 * @file        UI.java
 * @author      Daniel Gallego Granada
 * @email       gallegodaniel62@gmail.com
 * @link        https://github.com/Daniel-0ss
 * @copyright   Copyright Daniel Gallego, All Rights Reserved.
 */


package simplejavatexteditor;

import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SimpleJavaTextEditor extends JTextPane {

    private static final long serialVersionUID = 1L;
    public final static String AUTHOR_EMAIL = "gallegodaniel62@gmail.com";
    public final static String NAME = "PHNotePad";
    public final static String EDITOR_EMAIL = "gallegodaniel62@gmail.com";
    public final static double VERSION = 3.0;

    /**
     * @param args
     */
    public static void main(String[] args) {
    	try {
    		UIManager.setLookAndFeel ("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    	} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
    		e.printStackTrace();
    	}
    	
        new UI().setVisible(true);
    }

}
