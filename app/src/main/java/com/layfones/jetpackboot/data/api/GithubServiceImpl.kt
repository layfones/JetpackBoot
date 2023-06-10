package com.layfones.jetpackboot.data.api

import retrofit2.Retrofit
import javax.inject.Inject

class GithubServiceImpl @Inject constructor(private val retrofit: Retrofit):GithubService {

    private val service by lazy { retrofit.create(GithubService::class.java) }

    override suspend fun listRepo(user: String) = service.listRepo(user)
}