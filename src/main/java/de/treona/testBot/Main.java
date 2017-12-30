package de.treona.testBot;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

import javax.security.auth.login.LoginException;

public class Main {

    private static String TOKEN;

    public static void main(String[] args){
        try {
            new JDABuilder(AccountType.BOT).setToken(TOKEN).buildBlocking();
        } catch (LoginException | InterruptedException | RateLimitedException e) {
            e.printStackTrace();
        }
    }
}
