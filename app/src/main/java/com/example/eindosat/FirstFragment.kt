package com.example.eindosat

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.eindosat.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
        ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.topUp.setOnClickListener{
            val i = Intent(this@FirstFragment.requireContext(), TopupActivity::class.java)
            startActivity(i)
        }
        binding.transfer.setOnClickListener{
            val i = Intent(this@FirstFragment.requireContext(), Transfer::class.java)
            startActivity(i)
        }
        return view
    }
}