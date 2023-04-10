package br.com.userValidation.resources;

import br.com.userValidation.resources.dto.UserValidationDTO;
import br.com.userValidation.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@AllArgsConstructor
@RestController
@Api(value = "User")
@RequestMapping(value = "/api")
public class UserResource {

    private UserService userService;

    @ApiOperation(value = "Valid user")
    @GetMapping("/users/valid/{cpf}")
    public ResponseEntity<UserValidationDTO> validUser(@PathVariable String cpf){
        UserValidationDTO response =userService.validUser(cpf);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
