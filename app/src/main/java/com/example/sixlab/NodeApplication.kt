package com.example.sixlab

import android.app.Application
import com.example.sixlab.database.NodeDatabase
import com.example.sixlab.repository.NodeRepository

class NodeApplication : Application() {
    val database by lazy { NodeDatabase.getDatabase(this) }
    val repository by lazy { NodeRepository(database.nodeDao()) }
}