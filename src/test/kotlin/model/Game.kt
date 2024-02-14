package model

data class Game(
    val company: String,
    val description: String,
    val dlcs: List<Dlc>,
    val gameId: Int,
    val genre: String,
    val isFree: Boolean,
    val price: Int,
    val publish_date: String,
    val rating: Int,
    val requiredAge: Boolean,
    val requirements: Requirements,
    val tags: List<String>,
    val title: String
)