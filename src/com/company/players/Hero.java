package com.company.players;

import com.company.general.Abilitytype;
import com.company.general.GameEntity;

public abstract class Hero extends GameEntity implements HavingAbility {
    private Abilitytype abilitytype;

    public Abilitytype getAbilitytype() {
        return abilitytype;
    }

    public void setAbilitytype(Abilitytype abilitytype) {
        this.abilitytype = abilitytype;
    }

    public Hero(int health, int damage, Abilitytype abilitytype) {
        super(health, damage);
        this.abilitytype = abilitytype;
    }
}
