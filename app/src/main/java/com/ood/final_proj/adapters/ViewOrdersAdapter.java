package com.ood.final_proj.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ood.final_proj.MainActivity;
import com.ood.final_proj.Order;
import com.ood.final_proj.R;

import java.util.ArrayList;

/**
 * Adapter for the View Orders dialog
 */
public class ViewOrdersAdapter extends RecyclerView.Adapter<OrdersViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<Order> orders = new ArrayList<>();

    /**
     * Construct the adapter
     * @param context Context
     * @param orders ArrayList of Orders
     */
    public ViewOrdersAdapter(Context context, ArrayList<Order> orders) {
        inflater = LayoutInflater.from(context);
        this.orders = orders;
    }

    /**
     * Create the view holder
     * @param parent Parent view group
     * @param viewType View type
     * @return Orders View Holder
     */
    @Override
    public OrdersViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.dialog_view_orders,parent,false);
        return new OrdersViewHolder(view);
    }

    /**
     * Set the order description on bind
     * @param holder View holder to modify
     * @param position Position in the ArrayList
     */
    @Override
    public void onBindViewHolder(OrdersViewHolder holder, int position) {
        holder.order_description.setText(orders.get(position).getOrderDescription());
        holder.order_cost.setText(MainActivity.context.getString(
                R.string.total_price, orders.get(position).getCost()));
    }

    /**
     * Get the count of orders to display
     * @return Order count
     */
    @Override
    public int getItemCount() {
        return orders.size();
    }
}

/**
 * Orders View Holder class
 */
class OrdersViewHolder extends RecyclerView.ViewHolder
{
    public TextView order_description;
    public TextView order_cost;
    public View mView;

    /**
     * Create an instance of the view holder
     * @param view view to use
     */
    public OrdersViewHolder(View view) {
        super(view);
        mView = view;
        order_description = (TextView) view.findViewById(R.id.order_description);
        order_cost = (TextView) view.findViewById(R.id.order_cost);
    }
}