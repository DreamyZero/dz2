data class Book(val title: String, val author: String, val publicationYear: Int, val genre: String) {
    fun printDetails() {
        println("Title: $title")
        println("Author: $author")
        println("Publication Year: $publicationYear")
        println("Genre: $genre")
    }

    fun isMysteryGenre(): Boolean {
        return genre == "Mystery"
    }

    fun isContemporary(): Boolean {
        val currentYear = 2024
        return publicationYear >= currentYear - 10 && publicationYear <= currentYear
    }
}
