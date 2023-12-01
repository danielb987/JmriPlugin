package jmri.jmrit.otherexample;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JMenu;

// import jmri.jmrit.Menus;
// import jmri.util.ThreadingUtil;

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
    public void addToolsMenu(JMenu menu) {
        menu.addSeparator();
        menu.add(new PluginAction());
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
