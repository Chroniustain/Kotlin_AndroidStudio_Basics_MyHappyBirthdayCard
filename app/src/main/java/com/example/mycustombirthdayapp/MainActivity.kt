package com.example.mycustombirthdayapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mycustombirthdayapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.youButton.setOnClickListener {
            Toast.makeText(this, "SURPRISE!!!", Toast.LENGTH_SHORT).show()
            binding.sisterImage.setImageResource(R.drawable.funny_female_dog)
        }

        binding.meButton.setOnClickListener {
            Toast.makeText(this, "SURPRISE!!!", Toast.LENGTH_SHORT).show()
            binding.myImage.setImageResource(R.drawable.funny_male_dog)
        }

        binding.resetCurtainButton.setOnClickListener{
            Toast.makeText(this, "THE END.", Toast.LENGTH_SHORT).show()
            binding.sisterImage.setImageResource(R.drawable.theatre_curtains)
            binding.myImage.setImageResource(R.drawable.theatre_curtains)
        }
    }
}