package com.example.githublist.screen

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.githublist.data.UsersApi
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.launch

@HiltViewModel
class UsersVM @Inject constructor(
    private val api: UsersApi

) : ViewModel() {

    fun a() {
        viewModelScope.launch {
            val a = api.getUsers()
            Log.d("TAG", "a: $a")
        }
    }
}
