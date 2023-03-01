package com.tarc.edu.my.insurance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tarc.edu.my.insurance.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //Declare Binding Class
    //lateinit - late initialize (assign later on)
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //initialize the binding class
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalculate.setOnClickListener {
            //Get input from user
            var basic: Int = 0
            var extra: Int = 0
            var total: Int = 0

            val age: Int = binding.spinnerAge.selectedItemPosition
            if (age == 0){ //less than 17
                basic = 60
                total = basic + extra
            }
            if (age == 1){ //less than 17
                basic = 70
            }

            val gender: Int = binding.radioGroupGender.checkedRadioButtonId
            if (gender == binding.radioButtonMale.id){ //male // extra premium for male

            }else if (gender == binding.radioButtonFemale.id){

            }

            val smoker = binding.checkBoxSmoker.isChecked
            if (smoker){ //calculate extra premium for smoker

            }

            val premium = Premium(basic,extra,total)

            //assign premium to the UI
            binding.myPremium = premium
        }

        binding.buttonReset.setOnClickListener {

        }
    }
}