package com.sbu.bot.demo.domains

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document
data class Student(@Id var id: Long?, @Field var email:String, @Field var password: String)
