package org.jasoet.shopping.repository

import org.jasoet.shopping.model.ShoppingItem
import org.springframework.data.repository.CrudRepository

interface ShoppingItemRepository : CrudRepository<ShoppingItem, Long> {
    fun findByName(slug: String): ShoppingItem?
}

