package com.trackexpense.enwallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.trackexpense.enwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvExpenses.layoutManager = LinearLayoutManager(this)
        listOfExpenses()
    }


    fun listOfExpenses() {
        val ExpenseOne = Expenses("","Salary","40000","1 July 2024")
        val ExpenseTwo = Expenses("","Rent","160000","2 July 2024")
        val ExpenseThree = Expenses("","Dividends","2400","4 July 2024")
        val ExpenseFour = Expenses("","Electricity","800","5 July 2024")
        val ExpenseFive = Expenses("","Internet","2500","5 July 2024")
        val ExpenseSix = Expenses("","Shopping","3500"," 5 July 2024")
        val ExpenseSeven = Expenses("","Bus Fare","500","5 July 2024")
        val ExpenseEight = Expenses("","Water bill","4000","11 July 2024")




        val myExpenses = listOf(ExpenseOne,ExpenseTwo,ExpenseThree,ExpenseFour,ExpenseFive,ExpenseSix,ExpenseSeven,ExpenseEight)

        val expenseAdapter = ExpenseAdapter(myExpenses)
        binding.rvExpenses.adapter = expenseAdapter


    }
}