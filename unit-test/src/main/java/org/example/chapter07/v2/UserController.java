package org.example.chapter07.v2;

public class UserController {

    private Database _database = new Database();
    private MessageBus _messageBus = new MessageBus();

    public void changeEmail(int userId, String newEmail) {
        Object[] data = _database.getUserById(userId);

        String email = (String) data[1];
        UserType userType = (UserType) data[2];
        User user = new User(userId, email, userType);

        Object[] companyData = _database.getCompany();

        Company company = CompanyFactory.create(companyData);

        user.changeEmail(newEmail, company);

        _database.saveCompany(company);
        _database.saveUser(user);
        _messageBus.sendEmailChangedMessage(userId, newEmail);

    }
}
