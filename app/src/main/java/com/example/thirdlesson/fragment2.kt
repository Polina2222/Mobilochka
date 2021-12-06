package com.example.thirdlesson

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.thirdlesson.databinding.FragmentFragment2Binding

class fragment2 : Fragment() {

    lateinit var binding: FragmentFragment2Binding

    private var uuid = 1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFragment2Binding.inflate(inflater, container, false)

        nextButtonClick()
        prevButtonClick()

        return binding.root
    }

    private fun nextButtonClick(){
        binding.next.setOnClickListener {
            val activityFunctions = requireActivity() as ActivityFunctions
            try{
                Calculate.second_field = binding.text2.text.toString().toInt()
            }
            catch (e: Exception){
                Calculate.second_field = null
            }
            activityFunctions.showNextFragment(uuid)
        }
    }

    private fun prevButtonClick(){
        binding.back.setOnClickListener {
            val activityFunctions = requireActivity() as ActivityFunctions
            activityFunctions.showPreviousFragment(uuid)
        }
    }

}