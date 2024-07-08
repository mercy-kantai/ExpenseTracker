package com.trackexpense.enwallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ExpenseAdapter(var expenseList: List<Expenses>):
    RecyclerView.Adapter<ExpenseAdapter.ExpensesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpensesViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.expenses_list, parent, false)
        return ExpensesViewHolder(itemView)

    }

    override fun getItemCount(): Int {
        return expenseList.size
    }

    override fun onBindViewHolder(holder: ExpensesViewHolder, position: Int) {
        val expense = expenseList[position]
        holder.name.text = expense.name
        holder.date.text = expense.date
        holder.amount.text = expense.amount


    }

    class ExpensesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name = itemView.findViewById<TextView>(R.id.idname)
        var amount = itemView.findViewById<TextView>(R.id.idamount)
        var date = itemView.findViewById<TextView>(R.id.iddate)
    }
}