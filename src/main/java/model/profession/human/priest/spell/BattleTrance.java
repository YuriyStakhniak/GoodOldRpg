package model.profession.human.priest.spell;

import lombok.Getter;
import model.profession.Ability;
import model.profession.human.priest.PriestAbilitiesStats;

@Getter
public class BattleTrance implements Ability {

    private String name;
    private int cooldown;
    private int consumption;

    BattleTrance() {
        this.name = PriestAbilitiesStats.BATTLETRANCE.getAbilityName();
        this.cooldown = PriestAbilitiesStats.BATTLETRANCE.getCooldown();
        this.consumption = PriestAbilitiesStats.BATTLETRANCE.getConsumption();
    }

    @Override
    public void getAbility() {
        // Do nothing because now this operation is not supported.
    }
}
