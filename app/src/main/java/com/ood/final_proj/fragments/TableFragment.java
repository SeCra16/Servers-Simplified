package com.ood.final_proj.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.ood.final_proj.R;
import com.ood.final_proj.StaticData;
import com.ood.final_proj.TableDialog;
import com.ood.final_proj.adapters.TableGridViewAdapter;


public class TableFragment extends Fragment implements AdapterView.OnItemClickListener {

    public static GridView tableGrid;

    /**
     * Create the view
     * @param inflater Layout inflater
     * @param container View group
     * @param savedInstance Bundle
     * @return View
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        // Inflate the fragment
        View view = inflater.inflate(R.layout.fragment_table_list, container, false);

        // Initialize the GridView variable
        tableGrid = (GridView) view;

        // Set the adapter
        tableGrid.setAdapter(new TableGridViewAdapter(getActivity(),
                R.layout.fragment_table, StaticData.i().tables()));

        Toolbar toolbar = (Toolbar) getActivity().findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);

        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayShowHomeEnabled(false);

        // Assign the click listener
        tableGrid.setOnItemClickListener(this);
        return view;
    }

    /**
     * Open the table dialog when a table is clicked
     */
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        // Create the dialog
        TableDialog tableDialog = new TableDialog();

        // Set arguments
        Bundle args = new Bundle();
        args.putInt("table", position);
        tableDialog.setArguments(args);

        // Show the dialog
        tableDialog.show(getActivity().getSupportFragmentManager(), "TableDialog");
    }


}
