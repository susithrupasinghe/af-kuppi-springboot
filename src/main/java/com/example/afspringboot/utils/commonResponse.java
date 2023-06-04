package com.example.afspringboot.utils;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class commonResponse {
    boolean success;
    Object data;
}
