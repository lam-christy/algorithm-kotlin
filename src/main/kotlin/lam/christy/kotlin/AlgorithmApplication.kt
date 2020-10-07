package lam.christy.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AlgorithmApplication

fun main(args: Array<String>) {
	runApplication<AlgorithmApplication>(*args)
	println("Hello Japan!")
}
