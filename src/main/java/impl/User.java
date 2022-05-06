package impl;

import lombok.Data;

@Data
public class User {
    private int userId;
    private String userName;
    private int userAge;
    private String userPwd;
    private String userAddress;
    private GirlFriend girlFriend;
}
