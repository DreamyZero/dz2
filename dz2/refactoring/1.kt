data class Book(val title: String, val author: String, val publicationYear: Int, val genre: String) {
    fun printDetails() {
        println("""
            Title: $title
            Author: $author
            Publication Year: $publicationYear
            Genre: $genre
        """.trimIndent())
    }


    fun isContemporary(): Boolean {
        val currentYear = 2024 // текущий год
        return publicationYear in (currentYear - 10)..currentYear
    }
}
//улучшение читаемости кода
//уменьшение println