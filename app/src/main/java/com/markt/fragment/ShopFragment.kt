package com.markt.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.markt.R
import com.markt.databinding.FragmentShopBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class ShopFragment : Fragment() {

    private lateinit var binding: FragmentShopBinding

    private val TAG = this.javaClass.canonicalName;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = FragmentShopBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shop, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.i(TAG, "onViewCreated")

        this.binding.buttonPlaceOrder.setOnClickListener {
            findNavController().navigate(R.id.action_ShopFragment_to_LineFragment)
        }
    }
}