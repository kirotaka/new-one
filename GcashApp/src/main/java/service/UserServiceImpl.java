package service;

import dto.GcashResponse;
import dto.UserInfo;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchProperties;
import org.springframework.stereotype.Service;
import repository.UserRepository;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    GcashResponse gcashResponse
    @Override
    public GcashResponse createAccount(UserInfo userInfo) {

        User newUser = User.builder()
                .name(userInfo.getName())
                .email(userInfo.getEmail())
                .pin(userInfo.getPin())
                .build();

        return gcashResponse.builder()

                .build();








    }
}
