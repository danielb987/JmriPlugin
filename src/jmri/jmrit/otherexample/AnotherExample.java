package jmri.jmrit.otherexample;

import javax.swing.JOptionPane;

/**
 * Example plugin
 *
 * @author Daniel Bergqvist (C) 2023
 */
public class AnotherExample {

    public void helloWorld() {
        JOptionPane.showMessageDialog(null, "Hello Another World", "Plugin example",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
