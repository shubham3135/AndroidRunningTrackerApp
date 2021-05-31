package com.example.runningtracker.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.runningtracker.R
import com.example.runningtracker.ui.viewModels.MainViewModel
import com.example.runningtracker.ui.viewModels.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment: Fragment(R.layout.fragment_stastistics) {
    private val viewModel: StatisticsViewModel by viewModels()
}