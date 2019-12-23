package com.company.players;

import com.company.boss.Boss;
import com.company.general.Abilitytype;

import java.util.Random;

public class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage, Abilitytype.HEAL);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        Random r = new Random(1);
        int run = r.nextInt(10);
        for (int i = 0; i <heroes.length ; i++) {
            heroes[i].setDamage(heroes[i].getDamage()+ run);
          

        }


    }
}
