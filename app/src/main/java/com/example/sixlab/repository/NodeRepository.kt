package com.example.sixlab.repository

import com.example.sixlab.database.Node
import com.example.sixlab.database.NodeDao

class NodeRepository(private val nodeDao: NodeDao) {

    val nodes = nodeDao.getAll()

    @Suppress("RedundantSuspendModifier")
    suspend fun getNode(id: Int): Node? {
        return nodeDao.get(id)
    }

    @Suppress("RedundantSuspendModifier")
    suspend fun insert(node: Node): Long {
        return nodeDao.insert(node)
    }

    @Suppress("RedundantSuspendModifier")
    suspend fun update(node: Node) {
        nodeDao.update(node)
    }
}