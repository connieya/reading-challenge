package org.example.chapter05.detailsleaked;

public class UserController {

    public void renameUser(int userId, String newName) {
        User user = getUserFromDatabase(userId);

        user.name = user.normalizeName(newName);

        saveUserToDatabase(user);
    }

    private void saveUserToDatabase(User user) {
    }

    private User getUserFromDatabase(int userID) {
        return new User();
    }
}
