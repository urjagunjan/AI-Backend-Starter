package com.urja.aibackendstarter.dto;

import jakarta.validation.constraints.NotBlank;

public record AskRequest(

        @NotBlank(message = "Question cannot be empty")
        String question

) {
}
