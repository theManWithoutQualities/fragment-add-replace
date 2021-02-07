package com.konst007.myapplication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.fragment.app.commit
import androidx.lifecycle.Lifecycle

class MainFragment : Fragment(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_first_replace).setOnClickListener {
            childFragmentManager.commit {
                replace(R.id.container, FirstFragment())
            }
        }

        view.findViewById<Button>(R.id.button_first_add).setOnClickListener {
            childFragmentManager.commit {
                add(R.id.container, FirstFragment())
            }
        }

        view.findViewById<Button>(R.id.button_second_replace).setOnClickListener {
            childFragmentManager.commit {
                replace(R.id.container, SecondFragment())
            }
        }

        view.findViewById<Button>(R.id.button_second_add).setOnClickListener {
            childFragmentManager.commit {
                val fragment = SecondFragment()
                add(R.id.container, fragment)
                setMaxLifecycle(fragment, Lifecycle.State.RESUMED)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("checkk", "main onCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.d("checkk", "main onResume")
    }

    override fun onStart() {
        super.onStart()
        Log.d("checkk", "main onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.d("checkk", "main onStop")
    }

    override fun onPause() {
        super.onPause()
        Log.d("checkk", "main onPause")
    }
}