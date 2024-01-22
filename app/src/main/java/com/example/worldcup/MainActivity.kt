package com.example.worldcup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1-Adapter view - Listview
        val listview:ListView=findViewById(R.id.listview)

        //2-Data source
        fun generateData():ArrayList<CountryModel>{
            val countriesList= ArrayList<CountryModel>()
            val country1= CountryModel(
                "Brazil",
                "5",
                R.drawable.brazil
            )
            val country2= CountryModel(
            "France",
            "4",
            R.drawable.france
            )
            val country3= CountryModel(
                "Germany",
                "3",
                R.drawable.germany
            )
            val country4= CountryModel(
                "Saudi Arabia",
                "2",
                R.drawable.saudiarabia
            )
            val country5= CountryModel(
                "United Kingdom",
                "2",
                R.drawable.unitedkingdom
            )
            val country6= CountryModel(
                "United States",
                "1",
                R.drawable.unitedstates
            )
            val country7 = CountryModel(
                "Spain",
                "1",
                R.drawable.spain
            )


            countriesList.add(country1)
            countriesList.add(country2)
            countriesList.add(country3)
            countriesList.add(country4)
            countriesList.add(country5)
            countriesList.add(country6)
            countriesList.add(country7)

            return countriesList

        }

        //3-Adapter
        val adapter=MyAdapter(this,generateData())
        listview.adapter =adapter
        adapter.notifyDataSetChanged()


    }
}