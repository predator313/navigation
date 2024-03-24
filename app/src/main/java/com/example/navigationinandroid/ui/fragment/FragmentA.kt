package com.example.navigationinandroid.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.Navigation
import androidx.viewbinding.ViewBinding
import com.example.navigationinandroid.R
import com.example.navigationinandroid.databinding.FragmentABinding


class FragmentA : BindingFragment<FragmentABinding>() {
    override val bindingInflater: (LayoutInflater) -> ViewBinding
        get() = FragmentABinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvA.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentA_to_fragmentB)
        }
    }

}