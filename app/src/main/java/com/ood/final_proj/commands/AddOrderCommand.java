package com.ood.final_proj.commands;

import com.ood.final_proj.R;
import com.ood.final_proj.TableDialog;
import com.ood.final_proj.fragments.MenuFragment;

/**
 * This command will close the TableDialog and open the MenuFragment
 *
 */
public class AddOrderCommand {
    /**
     * Invalidate all views in the GridView and reload the adapter. This will change the color
     * of a table when it has been seating or made available.
     */
    public static int table;
    public void execute(TableDialog dialog,int table) {
        AddOrderCommand.table = table;

        // Close the dialog
        dialog.dismiss();

        // Open the MenuFragment
        dialog.getActivity()
                .getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_layout, new MenuFragment())
                .addToBackStack("MenuFragment")
                .commit();
    }
}
