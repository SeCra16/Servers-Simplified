package com.ood.final_proj.commands;

import android.support.v4.app.DialogFragment;
import android.widget.Button;


public interface TableReceiver {
    void execute(Button btnSeatTable, Button btnMakeAvailable, Button btnAddOrder,
                 Button btnViewOrders, int table, DialogFragment df);
}
