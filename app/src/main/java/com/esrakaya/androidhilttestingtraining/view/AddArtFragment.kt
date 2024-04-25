package com.esrakaya.androidhilttestingtraining.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.esrakaya.androidhilttestingtraining.R
import com.esrakaya.androidhilttestingtraining.databinding.FragmentAddArtBinding

class AddArtFragment: Fragment(R.layout.fragment_add_art) {
    private lateinit var binding: FragmentAddArtBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentAddArtBinding.bind(view)
    }
}