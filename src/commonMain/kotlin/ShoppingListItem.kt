import kotlinx.serialization.Serializable

@Serializable
data class ShoppingListItem(val id: Long = 0, val name: String, val priority: Int) {
    companion object {
        const val path = "/api/shop"
    }
}
