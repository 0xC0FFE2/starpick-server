package nanu.swdg.starsnap

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

fun main(args: Array<String>) {
	runApplication<StarSnapServiceApplication>(*args)
}

@SpringBootApplication(scanBasePackages = [
	"nanu.swdg.starsnap",
	"nanu.swdg.starpick.core",
	"nanu.swdg.starpick.infrastructure",
	"nanu.swdg.starpick.persistence",
	"nanu.swdg.starpick.presentation"
])
class StarSnapServiceApplication