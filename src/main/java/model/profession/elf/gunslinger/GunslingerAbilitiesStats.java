package model.profession.elf.gunslinger;

import lombok.Getter;

@Getter
public enum GunslingerAbilitiesStats {

    BULLSEYE("Bulls eye", 3, 40), MULTISHOT("Multi shot", 2, 30), RAPIDFIRE("Rapid fire", 3, 30);

    private String abilityName;
    private int cooldown;
    private int consumption;

    GunslingerAbilitiesStats(String abilityName, int cooldown, int consumption) {
        this.abilityName = abilityName;
        this.cooldown = cooldown;
        this.consumption = consumption;
    }
}
