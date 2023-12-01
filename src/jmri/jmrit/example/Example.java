package jmri.jmrit.example;

import javax.swing.JOptionPane;

/**
 * Example plugin
 *
 * @author Daniel Bergqvist (C) 2023
 */
public class Example {

    public void helloWorld() {
        JOptionPane.showMessageDialog(null, "Hello World", "Plugin example",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
