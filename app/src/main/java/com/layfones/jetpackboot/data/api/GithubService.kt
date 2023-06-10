package com.layfones.jetpackboot.data.api

import com.layfones.jetpackboot.data.model.resp.RepoResp
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubService {

    @GET("users/{user}/repos")
    suspend fun listRepo(@Path("user") user: String) :RepoResp

}