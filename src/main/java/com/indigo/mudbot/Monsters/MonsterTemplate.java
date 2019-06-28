package com.indigo.mudbot.Monsters;

import java.util.Random;

public class MonsterTemplate {
    public String name;
    public String assetName;
    public int maxHP;
    public int currentHP;
    public int rewardXP;
    public int damage;
    public int spawnChance; // 1 through 5 (5 - most likely to spawn)
    //public String[] loot; // this probably should be somehow tied to Items tab but I dunno how to connect that
    public int speed;
    public int accuracy;

    public String getAssetName(){ return this.assetName; }
    public String getName(){ return this.name; }

    public int getHp(){
        return this.currentHP;
    }

    public void dealDamage(int damage){
        this.currentHP -= damage;
    }
    public int getAttack(){
        return this.damage;
    }
    public int getAccuracy(){
        return this.accuracy;
    }

    public int attack(){
        Random rnd = new Random();
        int r = rnd.nextInt(100);
        float boost =2-(r/50);
        
        if(r <= getAccuracy()/2) return Math.round(getAttack() * boost);
        else if(r <= getAccuracy()) return getAttack();
        else return 0;
    }
}//anyway Ill prob stop coding for today.. Ill push changes to github so you can do whatever you want,
//you can try replicating the session code to make a new status message
//altho it is kinda difficult so I understand if you cant/dont want to
//well, you can always go to each command and set its properties
// this.description = "something" will show on /help
// this.guildOnly should ALWAYS be false
//so you can do that. Then take some time off. Well need all energy we can muster for tommorow
//ok
//I'll try what I can do
//also I'll do the README.txt on github


