package fr.esiea.ex4A.api_meet;
import org.springframework.stereotype.Repository;
import fr.esiea.ex4A.api_meet.Exceptions.*;

import java.util.ArrayList;
@Repository
public class UserRepository {
    private ArrayList<UserData> users ;
    public UserRepository() {
        users = new ArrayList<UserData>();
    }
    //save user in users list, method used during signup
    UserData save(String userName, String userEmail, String userTwitter, String userCountry, String userSex, String userSexPref) throws ForbiddenException {
        if(userName.isEmpty() || userEmail.isEmpty() || userTwitter.isEmpty() || userCountry.isEmpty() || userSex.isEmpty() || userSexPref.isEmpty())
            throw new ForbiddenException("user info are not filled correctly");
        UserData user = new UserData(userName, userEmail, userTwitter, userCountry, userSex, userSexPref);
        users.add(user);
        return user;
    }
}
