package model.profession.human.priest;

import lombok.Getter;

@Getter
public enum PriestAbilitiesStats {

    BATTLEFURY("Battle fury", 4, 30), LAYOFFISTS("Lay of fists", 3, 10), BATTLETRANCE("Battle trance", 4, 65),
    HANDOFGOD("Hand of god", 2, 25);

    private String abilityName;
    private int cooldown;
    private int consumption;

    PriestAbilitiesStats(String abilityName, int cooldown, int consumption) {
        this.abilityName = abilityName;
        this.cooldown = cooldown;
        this.consumption = consumption;
    }
}
