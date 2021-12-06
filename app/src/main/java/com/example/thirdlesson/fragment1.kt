package com.example.thirdlesson


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.thirdlesson.databinding.FragmentFragment1Binding



class fragment1 : Fragment() {

    lateinit var binding: FragmentFragment1Binding

    private var uuid = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFragment1Binding.inflate(inflater, container, false)
        nextButtonClick()
        return binding.root
    }

    private fun nextButtonClick(){
        binding.nextButton.setOnClickListener {
            val activityFunctions = requireActivity() as ActivityFunctions
            try {
                Calculate.first_field = binding.text1.text.toString().toInt()
            }
            catch (e: Exception){
                Calculate.first_field = null
            }
            activityFunctions.showNextFragment(uuid)
        }
    }


}