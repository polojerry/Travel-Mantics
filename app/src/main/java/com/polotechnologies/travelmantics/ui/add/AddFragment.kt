package com.polotechnologies.travelmantics.ui.add

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController

import com.polotechnologies.travelmantics.R
import com.polotechnologies.travelmantics.databinding.FragmentAddBinding


/**
 * A simple [Fragment] subclass.
 */
class AddFragment : Fragment() {

    private lateinit var mBinding: FragmentAddBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_add, container, false)


        setOnClickListeners()
        return mBinding.root
    }

    private fun setOnClickListeners() {
        mBinding.toolbarReportIncidents.setNavigationOnClickListener {
            findNavController().navigate(R.id.action_addFragment_to_homeFragment)
        }
    }

}
