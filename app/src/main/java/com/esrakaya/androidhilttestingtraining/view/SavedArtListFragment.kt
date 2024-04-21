package com.esrakaya.androidhilttestingtraining.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.esrakaya.androidhilttestingtraining.R
import com.esrakaya.androidhilttestingtraining.databinding.FragmentSavedArtsListBinding

class SavedArtListFragment : Fragment(R.layout.fragment_saved_arts_list) {

    private lateinit var binding: FragmentSavedArtsListBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentSavedArtsListBinding.bind(view)

        binding.fab.setOnClickListener {
          //  Navigation.findNavController(view).navigate(R.id.action_addArtFragment_to_imageApiFragment) err
            findNavController().navigate(R.id.action_savedArtListFragment_to_addArtFragment)
        }
    }
}