package com.esrakaya.androidhilttestingtraining.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.esrakaya.androidhilttestingtraining.R
import com.esrakaya.androidhilttestingtraining.databinding.FragmentImageApiBinding

class ImageApiFragment: Fragment(R.layout.fragment_image_api) {

    private lateinit var binding:FragmentImageApiBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentImageApiBinding.bind(view)
    }
}