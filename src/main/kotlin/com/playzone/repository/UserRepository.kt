package com.playzone.repository

import com.playzone.models.AuthResponse
import com.playzone.models.SignInParams
import com.playzone.models.SignUpParams
import com.playzone.util.Response

interface UserRepository {

    suspend fun signUp(params: SignUpParams): Response<AuthResponse>

    suspend fun signIn(params: SignInParams): Response<AuthResponse>
}