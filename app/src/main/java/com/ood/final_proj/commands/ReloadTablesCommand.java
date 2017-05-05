package com.ood.final_proj.commands;

import com.ood.final_proj.fragments.TableFragment;

/**
 * This command will reload all of the tables on the main screen. It is executed after both the
 * MakeAvailableCommand and SeatTableCommand classes.
 *
 */
public class ReloadTablesCommand {
    /**
     * Invalidate all views in the GridView and reload the adapter. This will change the color
     * of a table when it has been seating or made available.
     */
    public void execute() {
        TableFragment.tableGrid.invalidateViews();
        TableFragment.tableGrid.setAdapter(TableFragment.tableGrid.getAdapter());
    }
}
