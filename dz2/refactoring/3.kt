fun isClassicGenre(): Boolean {
    return when (genre) {
        "Classic", "Classical" -> true
        else -> false
    }
}
}
//улучшение читаемости
//новый метод