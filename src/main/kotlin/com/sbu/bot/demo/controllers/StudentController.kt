package com.sbu.bot.demo.controllers

import com.sbu.bot.demo.pojos.Student
import com.sbu.bot.demo.services.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.util.UriComponentsBuilder
import org.springframework.web.util.UriComponents


/**
 * Created by danielamorais on 05/08/17.
 */
@RestController
class StudentController {

    @Autowired
    private lateinit var service: StudentService

    @PostMapping("/students", consumes = arrayOf("application/json"))
    fun createStudent(builder: UriComponentsBuilder, @RequestBody student: Student): ResponseEntity<Any> {
        var newStudent = com.sbu.bot.demo.domains.Student(null, student.email, student.password)
        var studentId = service.createStudent(newStudent)

        val uriComponents = builder.path("/customers/{id}").buildAndExpand(studentId)

        return ResponseEntity.created(uriComponents.toUri()).build()
    }

    @GetMapping("/students")
    fun getStudent(): Student {
        return Student("daniela", "teste")
    }
}
