package com.example.thirdlesson

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.thirdlesson.databinding.FragmentFragment4Binding

class fragment4: Fragment() {

    lateinit var binding: FragmentFragment4Binding

    private var uuid = 3

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFragment4Binding.inflate(inflater, container, false)

        binding.result.text = Calculate.first_field.toString() + " " + Calculate.operation + " " + Calculate.second_field.toString() + " = " + Calculate.calculate().toString()

        prevButtonClick()

        return binding.root
    }

    private fun prevButtonClick(){
        binding.prev.setOnClickListener {
            val activityFunctions = requireActivity() as ActivityFunctions
            activityFunctions.showPreviousFragment(uuid)
        }
    }

}