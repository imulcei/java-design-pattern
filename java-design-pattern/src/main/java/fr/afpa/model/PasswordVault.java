package fr.afpa.model;

import java.util.HashMap;

public class PasswordVault {
    private static PasswordVault INSTANCE;
    private HashMap<String, String> passwords;

    private PasswordVault() {
        passwords = new HashMap<>();
    }

    public static PasswordVault getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PasswordVault();
        }
        return INSTANCE;
    }

    public void addPassword(String service, String password) {
        passwords.put(service, password);
    }

    public String getPassword(String service) {
        return passwords.get(service);
    }

}
