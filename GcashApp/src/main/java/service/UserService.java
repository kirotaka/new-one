package service;

import dto.GcashResponse;
import dto.UserInfo;

public interface UserService {
    GcashResponse createAccount(UserInfo userInfo);
}
