package com.pojo;

/**
 * ZDOrder
 */
public class ZDOrder {

    private String name;
    private int vote;

    public int getVote(){
        return vote;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setVote(int vote){
        this.vote=vote;
    }


}