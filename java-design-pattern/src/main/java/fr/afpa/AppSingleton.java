package fr.afpa;

import fr.afpa.singleton.PasswordVault;

/**
 * Hello world!
 */
public class AppSingleton {
    public static void main(String[] args) {
        PasswordVault passwordVault = PasswordVault.getInstance();
        passwordVault.addPassword("Gmail", "Soleil123");
        passwordVault.addPassword("Instagram", "Ciel456");

        System.out.println("Mdp Gmail: " + passwordVault.getPassword("Gmail"));
        System.out.println("Mdp Insta: " + passwordVault.getPassword("Instagram"));
    }
}
