package com.sbu.bot.demo.services

import com.sbu.bot.demo.pojos.Student
import org.springframework.stereotype.Service

/**
 * Created by danielamorais on 05/08/17.
 */
@Service
class StudentService {

    fun createStudent(student: Student): Int {
        if (student.email.length <= 1 || student.password.length <= 1) {
            throw IllegalStateException("Email and password are required")
        }

        return 1
    }
}