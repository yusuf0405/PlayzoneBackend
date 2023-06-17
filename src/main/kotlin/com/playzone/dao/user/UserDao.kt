package com.playzone.dao.user

import com.playzone.models.SignUpParams
import com.playzone.models.User

interface UserDao {

    suspend fun insert(params: SignUpParams): User?

    suspend fun findByEmail(email: String): User?
}