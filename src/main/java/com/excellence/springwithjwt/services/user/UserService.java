package com.excellence.springwithjwt.services.user;

import com.excellence.springwithjwt.dto.SignupRequest;
import com.excellence.springwithjwt.dto.UserDto;

public interface UserService {

    UserDto createUser(SignupRequest signupRequest) throws Exception;

    Boolean hasUserWithEmail(String email);


}
