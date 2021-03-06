package com.ciazhar.springkotlinrest.controller

import com.ciazhar.springkotlinrest.model.Costumer
import com.ciazhar.springkotlinrest.model.dto.request.RegisterForm
import com.ciazhar.springkotlinrest.model.dto.response.ResponseData
import com.ciazhar.springkotlinrest.service.CostumerService
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

/**
 * Created by ciazhar on 8/25/17.
 */

@RestController
@RequestMapping("/costumer")
class CostumerController(private val service : CostumerService){

    @GetMapping("/all")
    fun findAll() : ResponseData<*> {
        return service.findAll()
    }

    @GetMapping("/single")
    fun single(@RequestParam id : Int) : ResponseData<*>{
        return service.findOne(id)
    }

    @PostMapping("/register")
    fun register(@RequestBody @Valid register: RegisterForm) : ResponseData<*>{
        return service.register(register)
    }

    @PutMapping("/update")
    fun update(@RequestBody @Valid costumer: Costumer) : ResponseData<*>{
        return service.update(costumer)
    }

    @DeleteMapping("/delete")
    fun delete(@RequestParam id : Int) : ResponseData<*> {
        return service.delete(id)
    }



}