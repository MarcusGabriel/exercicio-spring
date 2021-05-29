package com.example.backend.dto;

import com.example.backend.enums.UserCanVote;
import com.example.backend.validators.validateCpf;

public class UserCanVoteDto {

    private UserCanVote status;

    public UserCanVote getStatus() {
        return status;
    }

    public void setStatus(UserCanVote status) {
        this.status = status;
    }

    public UserCanVoteDto(Boolean cpf_valid) {
        if (cpf_valid) {
            this.setStatus(UserCanVote.ABLE_TO_VOTE);
        } else {
            this.setStatus(UserCanVote.UNABLE_TO_VOTE);
        }
    }
}
