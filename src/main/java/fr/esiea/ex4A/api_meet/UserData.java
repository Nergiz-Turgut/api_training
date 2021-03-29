package fr.esiea.ex4A.api_meet;
import com.fasterxml.jackson.annotation.JsonProperty;
public class UserData {
    //Attibuts
    private String userName;
    private String userEmail;
    private String userTwitter;
    private String userCountry;
    private String userSex;
    private String userSexPref;
    public UserData(String userName, String userEmail, String userTwitter, String userCountry, String userSex, String userSexPref) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userTwitter = userTwitter;
        this.userCountry = userCountry;
        this.userSex = userSex;
        this.userSexPref = userSexPref;
    }
    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserTwitter() {
        return userTwitter;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public String getUserSex() {
        return userSex;
    }

    public String getUserSexPref() {
        return userSexPref;
    }
}
