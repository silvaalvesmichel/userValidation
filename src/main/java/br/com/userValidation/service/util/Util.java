package br.com.userValidation.service.util;

import br.com.caelum.stella.validation.CPFValidator;

public class Util {

    public static boolean validaCPF(String cpf){
        CPFValidator cpfValidator = new CPFValidator();
        try{ cpfValidator.assertValid(cpf);
            return true;
        }catch(Exception e){
            return false;
        }
    }

}
