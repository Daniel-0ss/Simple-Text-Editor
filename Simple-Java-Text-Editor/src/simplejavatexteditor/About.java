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

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class About {

    private final JFrame frame;
    private final JPanel panel;
    private String contentText;
    private final JLabel text;

    public About(UI ui) {
        panel = new JPanel(new FlowLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        frame = new JFrame();

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });


        frame.setVisible(true);
        frame.setSize(500,300);
        frame.setLocationRelativeTo(ui);
        text = new JLabel();
    }

    public void me() {
        frame.setTitle("About Me - " + SimpleJavaTextEditor.NAME);

        contentText =
        "<html><body><p>" +
        "Author: Daniel Gallego Granada<br />" +
        "Contact me at: " +
        "<a href='mailto:" + SimpleJavaTextEditor.AUTHOR_EMAIL + "?subject=About the NotePad PH Software'>" + SimpleJavaTextEditor.AUTHOR_EMAIL + "</a>" +
                "<br /><br />" +
                "Modified By: Daniel Gallego<br />" +
                "Contact me at: <a href='mailto:" + SimpleJavaTextEditor.EDITOR_EMAIL + "?subject=About the NotePad PH Software'>" + SimpleJavaTextEditor.EDITOR_EMAIL + "</a>" +
        "</p></body></html>";

        text.setText(contentText);
        panel.add(text);
        frame.add(panel);
    }

    public void software() {
        frame.setTitle("About Me - " + SimpleJavaTextEditor.NAME);

        contentText =
        "<html><body><p>" +
        "Name: " + SimpleJavaTextEditor.NAME + "<br />" +
        "Version: " + SimpleJavaTextEditor.VERSION +
        "</p></body></html>";

        text.setText(contentText);
        panel.add(text);
        frame.add(panel);
    }

}
