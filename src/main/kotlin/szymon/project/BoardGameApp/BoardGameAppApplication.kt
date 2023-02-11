package szymon.project.BoardGameApp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BoardGameAppApplication

fun main(args: Array<String>) {
	runApplication<BoardGameAppApplication>(*args)
}
