package com.company.players;

import com.company.boss.Boss;
import com.company.general.Abilitytype;

public class Medic extends Hero {
    private int healPoints;
    public Medic(int health, int damage) {
        super(health, damage, Abilitytype.BOOST);
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length ; i++) {
          heroes[i].setHealth(heroes[i].getHealth()+ healPoints);

        }

    }
}
