package com.sbu.bot.demo.repositories

import com.sbu.bot.demo.domains.Student
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

/**
 * Created by danielamorais on 05/08/17.
 */
@Repository
interface StudentRepository : MongoRepository<Student, Long>{

}