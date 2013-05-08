package me.guoyao.proxy;

/**
 * User: guoyao
 * Time: 05-08-2013 17:04
 */
public class GamePlayer implements IGamePlayer {

    private String name;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        System.out.println("login succeed, login name: " + user + ", player name: " + this.name);
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + " is fighting with boss.");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + " upgrade!");
    }
}
