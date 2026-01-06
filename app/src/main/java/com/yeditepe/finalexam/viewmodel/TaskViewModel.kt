package com.yeditepe.finalexam.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.yeditepe.finalexam.model.Task


class TaskViewModel : ViewModel() {

    // TODO 1: Create a mutable state list of Task objects
    // Initially add at least 2 tasks
    private val _tasks = mutableStateListOf<Task>(
        Task(1, "Finale çalış", false),
        Task(2, "Sınava gir.", true)
    )

    val tasks: List<Task> get() = _tasks


    fun toggleTask(taskId: Int) {
        // TODO 2: Update isCompleted for the given task
        val index = _tasks.indexOfFirst { it.id == taskId }
        if (index != -1) {
            val taks = _tasks[index]
            _tasks[index] = taks.copy(isCompleted = !taks.isCompleted)
        }
    }
}
