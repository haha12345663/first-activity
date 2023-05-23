package com.example.myapplication

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_first.view.btnOpenFragment2
import kotlinx.android.synthetic.main.fragment_second.view.btnOpenFragment3

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_second, container, false)
        view.btnOpenFragment3.setOnClickListener{ Navigation.findNavController(view).navigate(R.id.action_secondFragment_to_thirdFragment)}
        return view

    }

}