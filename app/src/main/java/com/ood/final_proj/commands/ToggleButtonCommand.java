package com.ood.final_proj.commands;

import android.graphics.Color;
import android.widget.Button;

/**
 * Command to toggle the button states (enabled/disabled)
 */
public class ToggleButtonCommand {
    // changes the text color of buttons when not clickable. clickable = Gray, not clickable = White.
    public void execute(Button button) {
        if (button.isEnabled()) {
            button.setTextColor(Color.GRAY);
        } else {
            button.setTextColor(Color.WHITE);
        }
        button.setEnabled(!button.isEnabled());
    }
}
