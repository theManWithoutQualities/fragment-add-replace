package com.konst007.myapplication

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit

class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            parentFragmentManager.commit {
                remove(this@FirstFragment)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("checkk", "first onCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.d("checkk", "first onResume")
    }

    override fun onStart() {
        super.onStart()
        Log.d("checkk", "first onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.d("checkk", "first onStop")
    }

    override fun onPause() {
        super.onPause()
        Log.d("checkk", "first onPause")
    }
}