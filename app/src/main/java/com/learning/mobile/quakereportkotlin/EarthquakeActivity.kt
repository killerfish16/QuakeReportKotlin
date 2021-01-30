package com.learning.mobile.quakereportkotlin

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.learning.mobile.quakereportkotlin.databinding.EarthquakeActivityBinding

class EarthquakeActivity : AppCompatActivity() {
    private lateinit var binding : EarthquakeActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = EarthquakeActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val earthQuakes: List<String> = listOf(
            "San Francisco",
            "London",
            "Tokyo",
            "Mexico City",
            "Moscow",
            "Rio de Janeiro",
            "Paris"
        )

        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, earthQuakes)

        binding.list.adapter = adapter
    }
}