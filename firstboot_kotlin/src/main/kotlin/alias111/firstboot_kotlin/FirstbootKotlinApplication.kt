package alias111.firstboot_kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FirstbootKotlinApplication

fun main(args: Array<String>) {
	runApplication<FirstbootKotlinApplication>(*args)
}
