package model.profession.human.priest.skill;

import lombok.Getter;
import model.profession.Ability;
import model.profession.human.priest.PriestAbilitiesStats;

@Getter
public class LayOfFists implements Ability {

    private String name;
    private int cooldown;
    private int consumption;

    LayOfFists() {
        this.name = PriestAbilitiesStats.LAYOFFISTS.getAbilityName();
        this.cooldown = PriestAbilitiesStats.LAYOFFISTS.getCooldown();
        this.consumption = PriestAbilitiesStats.LAYOFFISTS.getConsumption();
    }

    @Override
    public void getAbility() {
        // Do nothing because now this operation is not supported.
    }
}
