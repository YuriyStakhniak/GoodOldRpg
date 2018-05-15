package model.profession.human.paladin;

import lombok.Getter;

@Getter
public enum PaladinAbilitiesStats {

    RUSH("Rush", 1, 25), SPLASH("Splash", 2, 20);

    private String abilityName;
    private int cooldown;
    private int consumption;

    PaladinAbilitiesStats(String abilityName, int cooldown, int consumption) {
        this.abilityName = abilityName;
        this.cooldown = cooldown;
        this.consumption = consumption;
    }
}
