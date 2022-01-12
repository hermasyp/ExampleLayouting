package com.catnip.examplelayouting

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.catnip.examplelayouting.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    /*
        Cara lama

        private lateinit var flChoice1 : FrameLayout
        private lateinit var flChoice2 : FrameLayout
        private lateinit var flChoice3 : FrameLayout

       */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        bindViews()
        setClickListeners()
    }

    private fun bindViews() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        /*
            cara lama

            flChoice1 = findViewById(R.id.fl_choice_1)
            flChoice2 = findViewById(R.id.fl_choice_2)
            flChoice3 = findViewById(R.id.fl_choice_3)
         */
    }

    private fun setClickListeners() {
        binding.flChoice1.setOnClickListener {
            binding.flChoice1.setBackgroundColor(ContextCompat.getColor(this, R.color.purple_200))
            binding.flChoice2.setBackgroundColor(0)
            binding.flChoice3.setBackgroundColor(0)
        }
        binding.flChoice2.setOnClickListener {
            binding.flChoice1.setBackgroundColor(0)
            binding.flChoice2.setBackgroundColor(ContextCompat.getColor(this, R.color.purple_200))
            binding.flChoice3.setBackgroundColor(0)
        }
        binding.flChoice3.setOnClickListener {
            binding.flChoice1.setBackgroundColor(0)
            binding.flChoice2.setBackgroundColor(0)
            binding.flChoice3.setBackgroundColor(ContextCompat.getColor(this, R.color.purple_200))
        }
/*        flChoice1.setOnClickListener {
            flChoice1.setBackgroundColor(ContextCompat.getColor(this, R.color.purple_200))
            flChoice2.setBackgroundColor(0)
            flChoice3.setBackgroundColor(0)
        }
        flChoice2.setOnClickListener {
            flChoice1.setBackgroundColor(0)
            flChoice2.setBackgroundColor(ContextCompat.getColor(this, R.color.purple_200))
            flChoice3.setBackgroundColor(0)
        }
        flChoice3.setOnClickListener {
            flChoice1.setBackgroundColor(0)
            flChoice2.setBackgroundColor(0)
            flChoice3.setBackgroundColor(ContextCompat.getColor(this, R.color.purple_200))
        }*/
    }
}