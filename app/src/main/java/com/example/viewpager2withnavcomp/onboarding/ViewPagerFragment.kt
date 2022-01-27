package com.example.viewpager2withnavcomp.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager2withnavcomp.R
import com.example.viewpager2withnavcomp.screen.FirstFragment
import com.example.viewpager2withnavcomp.screen.SecondFragment
import com.example.viewpager2withnavcomp.screen.ThirdFragment

class ViewPagerFragment : Fragment() {

    private lateinit var viewPager: ViewPager2
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

        viewPager = view.findViewById(R.id.view_page_2)
        val fragmentList = arrayListOf(
            FirstFragment(),
            SecondFragment(),
            ThirdFragment()
        )

        val adapter =
            ViewPagerAdapter(fragmentList, requireActivity().supportFragmentManager, lifecycle)

        viewPager.adapter = adapter
        return view
    }
}