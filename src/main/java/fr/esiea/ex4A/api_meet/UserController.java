package fr.esiea.ex4A.api_meet;
import fr.esiea.ex4A.api_meet.Exceptions.ForbiddenException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @PostMapping("/api/inscription")
    public ResponseEntity<?> createUser(@Valid @RequestBody Map<String, Object> request) throws ForbiddenException {
        String userEmail = (String) request.get("userEmail");
        String userName = (String) request.get("userName");
        String userTwitter = (String) request.get("userTweeter");
        String userCountry = (String) request.get("userCountry");
        String userSex = (String) request.get("userSex");
        String userSexPref = (String) request.get("userSexPref");
        UserData userData = userRepository.save(userName, userEmail, userTwitter, userCountry, userSex, userSexPref);
        return ResponseEntity.ok().body(userData);
    }
}
