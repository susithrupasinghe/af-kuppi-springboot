package com.example.afspringboot.utils;

import com.example.afspringboot.dtos.studentDto;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class studentList {

    public List<studentDto> getAllStudents(){
        List<studentDto> students = new ArrayList<>();
        students.add(
                studentDto.builder()
                        .id(1)
                        .name("Ravindu Anajana")
                        .gender("Male")
                        .nickname("Bakara")
                        .email("ravindu@gmail.com").build());

        students.add(
                studentDto.builder()
                        .id(2)
                        .name("Shavindi Ekanayake")
                        .gender("Female")
                        .nickname("Shavi")
                        .email("shavi@gmail.com").build());

        students.add(
                studentDto.builder()
                        .id(2)
                        .name("Sasindu Nanayakkara")
                        .gender("Male")
                        .nickname("Sasi")
                        .email("sasindu@gmail.com").build());


        return  students;
    }
}
