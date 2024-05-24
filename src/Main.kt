import java.io.File

fun main() {
    val path = "C:\\Users\\Тимур\\IdeaProjects\\Kotel\\src\\Main.kt"
    val file = File(path)
    val source = file.readText()
    val lines = source.trimIndent().split("\n")
    for (line in lines) {
        println(line)
    }
}