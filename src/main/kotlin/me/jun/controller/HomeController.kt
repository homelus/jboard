package me.jun.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {
    @RequestMapping("")
    fun home() = "Hello Jun World"
}