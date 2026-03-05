package com.example.board_command.consumer.model;

import lombok.Getter;
import lombok.ToString;

public class MessageDto {

    @Getter
    @ToString
    public static class MessageCommand {
        private Long idx;
        private String a01;

    }
}
