package com.ood.final_proj.commands;

import android.support.v4.app.DialogFragment;
import com.ood.final_proj.StaticData;
import android.widget.Button;


public class SeatTableCommand implements TableReceiver{
    @Override
    public void execute(Button btnSeatTable, Button btnMakeAvailable, Button btnAddOrder,
                        Button btnViewOrders, int table, DialogFragment df) {
        // Set the table as seated
        StaticData.i().tables().set(table, false);

        // Toggle the button states
        ToggleButtonCommand toggleButtonCommand = new ToggleButtonCommand();
        toggleButtonCommand.execute(btnSeatTable);
        toggleButtonCommand.execute(btnMakeAvailable);
        toggleButtonCommand.execute(btnAddOrder);
        toggleButtonCommand.execute(btnViewOrders);

        // Reload the tables
        ReloadTablesCommand reloadTablesCommand = new ReloadTablesCommand();
        reloadTablesCommand.execute();
    }
}
