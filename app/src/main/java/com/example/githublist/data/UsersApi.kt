package com.example.githublist.data

import com.example.githublist.model.UserResponse
import retrofit2.http.GET
import retrofit2.http.Header

interface UsersApi {
    @GET("users")
    suspend fun getUsers(
        @Header("Accept") accept: String = "application/vnd.github+json",
        @Header("Authorization") authorization: String = "",
        @Header("X-GitHub-Api-Version") apiVersion: String = "2022-11-28"
    ): List<UserResponse>
}
