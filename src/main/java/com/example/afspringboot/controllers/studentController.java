package com.example.afspringboot.controllers;

import com.example.afspringboot.dtos.studentDto;
import com.example.afspringboot.utils.commonResponse;
import com.example.afspringboot.utils.studentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("/students")
public class studentController {


    @Autowired
    studentList studentList;

    List<studentDto> students;

    public studentController(studentList studentList) {
        this.studentList = studentList;
        this.students = this.studentList.getAllStudents();
    }


    @GetMapping("")
    public ResponseEntity getAllStudents() throws Exception {

        try {
            return  ResponseEntity.ok(commonResponse.builder()
                    .success(true)
                    .data(students).build());
        }
        catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @PostMapping("")
    public ResponseEntity addStudnet(@RequestBody studentDto student) throws Exception {

        try {
            student.setId(students.size() +1);
            students.add(student);

            return  ResponseEntity.status(201).body(commonResponse.builder()
                    .success(true)
                    .data(student).build());
        }
        catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }
}
