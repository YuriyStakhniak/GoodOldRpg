package model.profession.elf.gunslinger.spell;

import lombok.Getter;
import model.profession.Ability;
import model.profession.elf.gunslinger.GunslingerAbilitiesStats;

@Getter
public class Multishot implements Ability {

    private String name;
    private int cooldown;
    private int consumption;

    Multishot() {
        this.name = GunslingerAbilitiesStats.MULTISHOT.getAbilityName();
        this.cooldown = GunslingerAbilitiesStats.MULTISHOT.getCooldown();
        this.consumption = GunslingerAbilitiesStats.MULTISHOT.getConsumption();
    }

    @Override
    public void getAbility() {
        // Do nothing because now this operation is not supported.
    }
}
