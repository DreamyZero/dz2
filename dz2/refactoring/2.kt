data class Book(val title: String, val author: String, val publicationYear: Int, val genre: String) {
    fun printDetails() {
        println(getDetailsString())
    }

    private fun getDetailsString(): String {
        return buildString {
            appendln("Title: $title")
            appendln("Author: $author")
            appendln("Publication Year: $publicationYear")
            appendln("Genre: $genre")
        }
    }
//сокращение кода с помощью buildString
//может использоваться в других частях класса