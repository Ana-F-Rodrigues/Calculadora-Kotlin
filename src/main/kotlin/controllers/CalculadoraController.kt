package projetoSprinKotlin.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/calculadora")
class CalculadoraController {

    @GetMapping("/soma")
    fun soma(n1: Int, n2: Int) = n1 + n2
}