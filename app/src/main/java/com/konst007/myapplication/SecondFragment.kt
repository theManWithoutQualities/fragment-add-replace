package com.konst007.myapplication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.commit
import androidx.navigation.fragment.findNavController

class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_second).setOnClickListener {
            parentFragmentManager.commit {
                remove(this@SecondFragment)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("checkk", "second onCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.d("checkk", "second onResume")
    }

    override fun onStart() {
        super.onStart()
        Log.d("checkk", "second onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.d("checkk", "second onStop")
    }

    override fun onPause() {
        super.onPause()
        Log.d("checkk", "second onPause")
    }
}