package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) {

        for (int i = 0; i < records.length; i++) {
            String[] userInformation = records[i].split(":");
            if (userInformation[0].equals(email)) {
                return Integer.parseInt(userInformation[1]);
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
