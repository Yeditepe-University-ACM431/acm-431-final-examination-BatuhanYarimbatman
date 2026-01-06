package com.yeditepe.finalexam.repository

import com.yeditepe.finalexam.api.TaskApi
import com.yeditepe.finalexam.model.Task
import com.yeditepe.finalexam.model.TaskDto


class TaskRepository(private val api: TaskApi) {

    suspend fun fetchTasks(): List<Task> {
        // TODO 1: Call API
        val taskDtoList = api.getTasks()

        // TODO 2: Convert TaskDto list to Task list
        return taskDtoList.map { taskDto ->
            Task(
                id = taskDto.id,
                title = taskDto.title,
                isCompleted = taskDto.completed
            )
            //   TODO("Provide the return value")
        }
    }
}
