package org.hsk.domain;

import java.util.List;

/**
 * Created by cartman on 2015-12-13.
 */
public class Team {

    private String name;

    private List<Player> players;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }


}
