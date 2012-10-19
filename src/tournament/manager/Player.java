/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tournament.manager;

import java.util.List;

/**
 *
 * @author Muhedin
 */
public class Player {

    private String playerName;
    private String playerSurname;
    private String playerCategory;
    private String playerGender;
    private boolean playerWeight;

    //konstruktor
    private Player(String playerName, String playerSurname, String playerCategory, String playerGender, boolean playerWeight) {

        this.playerName = playerName;
        this.playerSurname = playerSurname;
        this.playerCategory = playerCategory;
        this.playerGender = playerGender;
        this.playerWeight = playerWeight;

    }
    Player p = new Player(playerName, playerSurname, playerCategory, playerGender, playerWeight);

       
    //Geteri i seteri
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerSurname() {
        return playerSurname;
    }

    public void setPlayerSurname(String playerSurname) {
        this.playerSurname = playerSurname;
    }

    public String getPlayerCategory() {
        return playerCategory;
    }

    public void setPlayerCategory(String playerCategory) {
        this.playerCategory = playerCategory;
    }

    public String getPlayerGender() {
        return playerGender;
    }

    public void setPlayerGender(String playerGender) {
        this.playerGender = playerGender;
    }

    public boolean isPlayerWeight() {
        return playerWeight;
    }

    public void setPlayerWeight(boolean playerWeight) {
        this.playerWeight = playerWeight;
    }
    
    //Player (List<String> playerName, playerSurname, playerCategory, playerGender, playerWeight);
}