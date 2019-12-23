package com.company.general;

import com.company.boss.Boss;
import com.company.players.*;

public class RPGGame {
    public static void startGame() {
        Boss boss = new Boss(400, 30);
        Warrior warrior = new Warrior(100, 20);
        Medic medic = new Medic(100, 0);
        medic.setHealPoints(5);
        Hunter hunter = new Hunter(100, 20);
        Magic magic = new Magic(100, 20);
        Hero[] heroes = {warrior, medic, hunter, magic};
        printStatistics(heroes, boss);
        while (!isFinished(heroes, boss)) {
            round(heroes, boss);
        }
    }

    private static boolean isFinished(Hero[] heroes, Boss boss) {
        if (boss.getHealth() <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }
        boolean allHeroesDead = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                allHeroesDead = false;
                break;
            }

        }
        if (allHeroesDead){
            System.out.println("Boss won!!!");
        }
        return allHeroesDead;

    }

    private static void bossHit(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setHealth(heroes[i].getHealth() - boss.getDamage());

        }
    }

    private static void heroesHit(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            boss.setHealth(boss.getHealth() - heroes[i].getDamage());

        }
    }
    private static void heroesUseSuperAbility(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
           heroes[i].useAbility(heroes,boss);

        }
    }

    private static void printStatistics(Hero[] heroes, Boss boss) {
        System.out.println("___________________________");
        System.out.println("Boss health: " + boss.getHealth());
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].getClass().getSimpleName() + "health : " + heroes[i].getHealth());
        }
        System.out.println("___________________________");
    }

    private static void round(Hero[] heroes, Boss boss) {
        heroesHit(heroes, boss);
        bossHit(heroes, boss);
        heroesUseSuperAbility(heroes,boss);
        printStatistics(heroes, boss);

    }

}