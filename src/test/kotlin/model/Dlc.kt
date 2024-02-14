package model

data class Dlc(
    val description: String,
    val dlcName: String,
    val isDlcFree: Boolean,
    val price: Int,
    val rating: Int,
    val similarDlc: SimilarDlc
)