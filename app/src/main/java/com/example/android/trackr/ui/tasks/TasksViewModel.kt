/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.trackr.ui.tasks

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

import com.example.android.trackr.data.Task

import com.example.android.trackr.db.dao.TaskDao

class TasksViewModel(private val taskDao: TaskDao) : ViewModel() {

    // TODO(b/163065333): add a UseCase instead of directly using the DAO here?
    val tasks: LiveData<List<Task>>
        get() = taskDao.getTasks()
}