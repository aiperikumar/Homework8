package com.company.players;

import com.company.boss.Boss;
import com.company.general.Abilitytype;

import java.util.Random;

public class Hunter extends Hero {
    public Hunter(int health, int damage) {
        super(health, damage, Abilitytype.CRITICAL_DAMAGE);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        Random r = new Random(2);
        int run = r.nextInt(4);
        heroes[2].setDamage(heroes[2].getDamage()*run);


    }
}
