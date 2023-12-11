package se.bergqvist.jmri.example;

import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JMenu;

import jmri.jmrit.swing.ToolsMenuAction;
import jmri.util.swing.JmriAbstractAction;
import jmri.util.swing.JmriPanel;
import jmri.util.swing.WindowInterface;

import org.openide.util.lookup.ServiceProvider;

/**
 * Sample Action to create a new user-defined item in the Tools menu.
 *<P>
 * This is disabled by default so it doesn't appear in the default Tools menu.
 * Uncomment the line indicated below to allow this to appear in the Tools menu.
 *<P>
 * For more on why this inherits from {@link jmri.util.swing.JmriAbstractAction}
 * and the use of {@link jmri.util.swing.JmriPanel} and {@link jmri.util.swing.WindowInterface},
 * please see
 * <a href="https://www.jmri.org/help/en/html/doc/Technical/Swing.shtml">JMRI's Use of Swing page</a>.
 *
 * @author Paul Bender   Copyright (C) 2003
 * @author Bob Jacobsen  Copyright (C) 2023
 */

@ServiceProvider(service = jmri.jmrit.swing.ToolsMenuAction.class)
public class ToolsMenuItem extends JmriAbstractAction implements ToolsMenuAction {

    public ToolsMenuItem(String s, WindowInterface wi) {
        super(s, wi);
    }

    public ToolsMenuItem(String s, Icon i, WindowInterface wi) {
        super(s, i, wi);
    }

    public ToolsMenuItem(String s) {
        super(s);
    }

    public ToolsMenuItem() {
        this("Sample Tools Menu Item");  // better to use a bundle here
    }

    @Override
    public JmriPanel makePanel() {

        // create a new panel of your specific type here
        var retval = new SampleToolsMenuPanel();

        retval.initComponents();
        return retval;
    }


    // Example JmriPanel
    // Yours should be a separate class in a separate file usually.
    static class SampleToolsMenuPanel extends JmriPanel {

        /**
         * Your initialization code for your GUI goes here.
         * {@inheritDoc}
         */
        @Override
        public void initComponents() {
            super.initComponents();

            add(new JLabel("Sample Plugin Contents"));

        }

        /**
         * This is where you define the title of your new pane.
         * {@inheritDoc}
         */
        @Override
        public String getTitle() {
            return "Sample Plugin Frame's Title"; // this should come from a Bundle in your package
        }

        /**
         * This is where you define menus that go with your new panel.
         * {@inheritDoc}
         */
        @Override
        public List<JMenu> getMenus() {
            List<JMenu> menuList = new ArrayList<>();
            return menuList;
        }

    }

}
