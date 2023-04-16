// KtSpringbootApplication.kt
package josem111.kt_springboot
// ***************************************************

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import josem111.kt_springboot.utils.printURLInfo
// ***************************************************

@SpringBootApplication
class KtSpringbootApplication
// ***************************************************

fun main(args: Array<String>) {
	runApplication<KtSpringbootApplication>(*args)
	
	printURLInfo(url = "http://localhost:8080")
}
// ***************************************************
