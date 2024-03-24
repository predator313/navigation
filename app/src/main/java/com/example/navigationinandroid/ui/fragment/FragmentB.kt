package com.example.navigationinandroid.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.Navigation
import androidx.viewbinding.ViewBinding
import com.example.navigationinandroid.R
import com.example.navigationinandroid.databinding.FragmentBBinding


class FragmentB : BindingFragment<FragmentBBinding>() {
    override val bindingInflater: (LayoutInflater) -> ViewBinding
        get() = FragmentBBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvB.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentB_to_fragmentA)
        }
    }

}