package org.jasoet.shopping.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class ShoppingItem(
    var priority: Int,
    var name: String? = null,
    @Id @GeneratedValue var id: Long? = null
)
