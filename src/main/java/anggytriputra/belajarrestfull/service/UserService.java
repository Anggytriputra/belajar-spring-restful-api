package anggytriputra.belajarrestfull.service;

import anggytriputra.belajarrestfull.entity.User;
import anggytriputra.belajarrestfull.model.RegisterUserRequest;
import anggytriputra.belajarrestfull.repository.UserRepository;
import anggytriputra.belajarrestfull.security.BCrypt;
import exception.ApiException;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service


public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Validator validator;

    @Transactional
    public void  register(RegisterUserRequest request){

        Set<ConstraintViolation<RegisterUserRequest>> constraintViolations = validator.validate(request);
        if (constraintViolations.size() != 0){
//            error
            throw new ConstraintViolationException(constraintViolations);
        }
//jika username sudah terdaftar
        if (userRepository.existsById(request.getUsername())){
            throw new ApiException("Username already registered");
        }

        User user = new User();
        user.setUsername(request.getUsername());
        user.setUsername(BCrypt.hashpw(request.getPassword(), BCrypt.gensalt()));
        user.setName(request.getName());

        userRepository.save(user);
    }
}
