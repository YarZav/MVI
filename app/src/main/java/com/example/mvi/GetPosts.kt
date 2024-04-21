package com.example.mvi

import com.example.mvi.api.PostApi
import com.example.mvi.network.model.Post
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.lang.Exception

class GetPosts(
    private val postApi: PostApi
) {
    fun execute(): Flow<DataState<List<Post>>> {
        return flow {
            DataState.Loading<Boolean>(true)
            try {
                val posts = postApi.getPosts()
                emit(DataState.Success(posts))
            } catch (exception: Exception) {
                exception.printStackTrace()
                emit(DataState.Error(UIComponent.Toast(exception.message ?: "Unknown error")))
            } finally {
                DataState.Loading<Boolean>(false)
            }
        }
    }
}