package com.example.githublist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.githublist.screen.UsersFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.fragmentContainer, UsersFragment(), "usersFragment").commit()
    }
}
