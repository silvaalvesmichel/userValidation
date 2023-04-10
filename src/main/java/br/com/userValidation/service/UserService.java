package br.com.userValidation.service;

import br.com.userValidation.resources.dto.UserValidationDTO;
import br.com.userValidation.service.util.Util;
import org.springframework.stereotype.Service;


import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UserService {

    public UserValidationDTO validUser(String cpf) {
        var valid = new UserValidationDTO();
        if (cpf != null || !cpf.equals("")) {
            if (Util.validaCPF(cpf)) {
                valid.setStatus("ABLE_TO_VOTE");
                return valid;
            }
            valid.setStatus("UNABLE_TO_VOTE");
            return valid;
        }
        valid.setStatus("UNABLE_TO_VOTE");
        return valid;
    }

}
