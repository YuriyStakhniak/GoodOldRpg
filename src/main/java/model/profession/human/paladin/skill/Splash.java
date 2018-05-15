package model.profession.human.paladin.skill;

import lombok.Getter;
import model.profession.Ability;
import model.profession.human.paladin.PaladinAbilitiesStats;

@Getter
public class Splash implements Ability {

    private String name;
    private int cooldown;
    private int consumption;

    Splash() {
        this.name = PaladinAbilitiesStats.SPLASH.getAbilityName();
        this.cooldown = PaladinAbilitiesStats.SPLASH.getCooldown();
        this.consumption = PaladinAbilitiesStats.SPLASH.getConsumption();
    }

    @Override
    public void getAbility() {
        // Do nothing because now this operation is not supported.
    }
}
