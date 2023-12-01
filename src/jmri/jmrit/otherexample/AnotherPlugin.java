package jmri.jmrit.otherexample;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JMenu;

/**
 * Definition of this plugin
 *
 * @author Daniel Bergqvist (C) 2023
 */
public class AnotherPlugin implements jmri.Plugin {

    private static final AnotherExample _example = new AnotherExample();

    @Override
    public void init() {
    }

    @Override
    public void addToolsMenu(Object menu) {
        if (menu instanceof JMenu) {
            JMenu m = (JMenu)menu;
            m.addSeparator();
            m.add(new PluginAction());
        } else {
            throw new IllegalArgumentException("menu is not a JMenu");
        }
    }

    private static class PluginAction extends AbstractAction {

        public PluginAction() {
            super("Another Plugin");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            _example.helloWorld();
        }
    }

}
