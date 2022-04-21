package co.com.devco.manualtest.utils;

import org.junit.Assert;

import javax.swing.*;

public class ManualTest {
    private ManualTest() {

    }

    public static void validate(String step, String nameScenario) {
        int YES = 1;
        String reason = "";
        String[] options = new String[]{"No", "Yes"};
        int optionSelected = JOptionPane.showOptionDialog(new JFrame(), "The step \"" + step + "\" was executed correctly?", nameScenario, -1, 1, (Icon) null, options, options[0]);
        if (optionSelected == 0) {
            reason = JOptionPane.showInputDialog("Enter the reason why the test did not run correctly");
        }

        Assert.assertEquals(reason, (long) YES, (long) optionSelected);
    }

}
