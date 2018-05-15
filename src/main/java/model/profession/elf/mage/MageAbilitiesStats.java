package model.profession.elf.mage;

import lombok.Getter;

@Getter
public enum MageAbilitiesStats {

    DISPEL("Dispel", 3, 20), FIREBALL("Fire ball", 3, 45), FROSTBALL("Frost ball", 1, 20),
    SPELLSHIELD("Spell shield", 2, 15), STONEGAZE("Stone gaze", 4, 20);

    private String abilityName;
    private int cooldown;
    private int consumption;

    MageAbilitiesStats(String abilityName, int cooldown, int consumption) {
        this.abilityName = abilityName;
        this.cooldown = cooldown;
        this.consumption = consumption;
    }
}
