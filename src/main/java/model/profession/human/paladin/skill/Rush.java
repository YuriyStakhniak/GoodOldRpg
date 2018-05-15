package model.profession.human.paladin.skill;

import lombok.Getter;
import model.profession.Ability;
import model.profession.human.paladin.PaladinAbilitiesStats;

@Getter
public class Rush implements Ability {

    private String name;
    private int cooldown;
    private int consumption;

    Rush() {
        this.name = PaladinAbilitiesStats.RUSH.getAbilityName();
        this.cooldown = PaladinAbilitiesStats.RUSH.getCooldown();
        this.consumption = PaladinAbilitiesStats.RUSH.getConsumption();
    }

    @Override
    public void getAbility() {
        // Do nothing because now this operation is not supported.
    }
}
