package com.indigo.mudbot;

import com.indigo.mudbot.Classes.Class;
import com.indigo.mudbot.Classes.Fighter;
import com.indigo.mudbot.Commands.*;
import com.indigo.mudbot.Items.Bone;
import com.indigo.mudbot.Items.HealingPotion;
import com.indigo.mudbot.Items.Item;
import com.indigo.mudbot.Items.Slimeball;
import com.indigo.mudbot.Monsters.MonsterTemplate;
import com.indigo.mudbot.Monsters.Spider;
import com.indigo.mudbot.Weapons.*;
import com.jagrosh.jdautilities.command.Command;
import javafx.beans.binding.SetExpression;

import java.util.HashMap;
import java.util.Map;

public class Values {
    public static final String NO_ITEM = "<:InventoryMud:593844698666237983>";
    public static final String CURRENCY = "<:wisp:593315078539968532>";
    public static Command[] Commands = new Command[]{
            new Ping(),
            new CreateCharacter(Main.waiter),
            new JoinGame(Main.waiter),
            new Say(),
            new Inventory(Main.waiter),
            new Equip(Main.waiter),
            new Move()
    };
    public static Class[] playerClasses = new Class[]{
            new Fighter()
    };
    public static Map<Integer, Item> Items = new HashMap<>();
    public static Map<Integer, Weapon> Weapons = new HashMap<>();
    public static Map<Integer, Shop> Shops = new HashMap<>();
    public static Map<Integer, MonsterTemplate> Monsters = new HashMap<>();

    static{
        Items.put(1, new Battleaxe());
        Items.put(2, new Bow());
        Items.put(3, new Dagger());
        Items.put(4, new Flail());
        Items.put(5, new Hammer());
        Items.put(6, new Longsword());
        Items.put(7, new Rapier());
        Items.put(8, new Scythe());
        Items.put(9, new Shovel());
        Items.put(10, new Torch());
        Items.put(11, new Bone());
        Items.put(12, new HealingPotion());
        Items.put(13, new Slimeball());

        Weapons.put(1, new Battleaxe());
        Weapons.put(2, new Bow());
        Weapons.put(3, new Dagger());
        Weapons.put(4, new Flail());
        Weapons.put(5, new Hammer());
        Weapons.put(6, new Longsword());
        Weapons.put(7, new Rapier());
        Weapons.put(8, new Scythe());
        Weapons.put(9, new Shovel());
        Weapons.put(10, new Torch());

        Shops.put(1, new Shop(new Dagger(), new Torch(), new Shovel()));

        Monsters.put(1, new Spider());

        
    }
}
