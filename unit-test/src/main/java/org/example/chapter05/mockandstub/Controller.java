package org.example.chapter05.mockandstub;

public class Controller {

    private final IEmailGateway _emailGateway;
    private final IDatabase _database;

    public Controller(IEmailGateway _emailGateway) {
        this._emailGateway = _emailGateway;
        this._database = null;
    }

    public Controller(IDatabase _database) {
        this._database = _database;
        this._emailGateway = null;
    }

    public void greetUser(String userEmail) {
        _emailGateway.sendGreetingsEmail(userEmail);
    }

    public Report createReport() {
        int numberOfUsers = _database.getNumberOfUsers();
        return new Report(numberOfUsers);
    }
}
