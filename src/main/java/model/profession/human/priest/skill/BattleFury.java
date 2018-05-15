package model.profession.human.priest.skill;

import lombok.Getter;
import model.profession.Ability;
import model.profession.human.priest.PriestAbilitiesStats;

@Getter
public class BattleFury implements Ability {

    private String name;
    private int cooldown;
    private int consumption;

    BattleFury() {
        this.name = PriestAbilitiesStats.BATTLEFURY.getAbilityName();
        this.cooldown = PriestAbilitiesStats.BATTLEFURY.getCooldown();
        this.consumption = PriestAbilitiesStats.BATTLEFURY.getConsumption();
    }

    @Override
    public void getAbility() {
        // Do nothing because now this operation is not supported.
    }
}
