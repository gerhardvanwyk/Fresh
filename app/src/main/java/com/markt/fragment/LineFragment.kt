package com.markt.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.markt.R
import com.markt.databinding.FragmentLineBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class LineFragment : Fragment() {

    private lateinit var binding: FragmentLineBinding

    /**
     * Attache to the RootView of this Fragment
     */
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        this.binding = FragmentLineBinding.inflate(inflater, container, false);
        return this.binding.root;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonHome.setOnClickListener {
            findNavController().navigate(R.id.action_LineFragment_to_ShopFragment)
        }
    }
}