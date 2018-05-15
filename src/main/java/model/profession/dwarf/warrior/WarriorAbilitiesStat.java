package model.profession.dwarf.warrior;

import lombok.Getter;

@Getter
public enum WarriorAbilitiesStat {

    STANDMYGROUND("Stand my ground", 4, 20), WHIRLINGAXE("Whirling axe", 2, 30);

    private String abilityName;
    private int cooldown;
    private int consumption;

    WarriorAbilitiesStat(String abilityName, int cooldown, int consumption) {
        this.abilityName = abilityName;
        this.cooldown = cooldown;
        this.consumption = consumption;
    }
}
