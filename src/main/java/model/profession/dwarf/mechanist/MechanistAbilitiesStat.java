package model.profession.dwarf.mechanist;

import lombok.Getter;

@Getter
public enum MechanistAbilitiesStat {

    BOMBS("Bombs", 2, 25), DROID_TO_ARMS("Droid to arms", 3, 30);

    private String abilityName;
    private int coolDown;
    private int consumption;

    MechanistAbilitiesStat(String abilityName, int coolDown, int consumption) {
        this.abilityName = abilityName;
        this.coolDown = coolDown;
        this.consumption = consumption;
    }
}
