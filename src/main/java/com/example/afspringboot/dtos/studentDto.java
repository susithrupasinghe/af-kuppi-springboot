package com.example.afspringboot.dtos;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class studentDto {
    int id;
    String name;
    String email;
    String gender;
    String nickname;
}
