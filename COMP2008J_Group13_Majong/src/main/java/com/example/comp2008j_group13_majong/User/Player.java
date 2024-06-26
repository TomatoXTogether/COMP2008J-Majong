package com.example.comp2008j_group13_majong.User;

import com.example.comp2008j_group13_majong.Tile.MahjongTile;

import java.util.ArrayList;

public class Player extends User{

    //public String position;

    public Player(String name, ArrayList<MahjongTile> tiles, String position) {
        this.name = name;
        this.score = 0;
        this.position = position;
        this.handTiles = tiles;
        this.isTurn = false;
        this.usedTiles = new ArrayList<>();
        this.inOrderTiles = new ArrayList<>();
    }

    @Override
    public MahjongTile playTiles() {
        return null;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public void setTurn(boolean turn) {

    }
    @Override
    public int getIndex() {
        return index;
    }
    @Override
    public void setIndex(int index) {
        this.index = index;
    }
}
