package com.company.players;

import com.company.boss.Boss;
import com.company.general.Abilitytype;

public class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage, Abilitytype.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
      heroes[0].setDamage(heroes[0].getDamage()+boss.getDamage());

    }
}
