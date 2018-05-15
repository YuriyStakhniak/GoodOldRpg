package model.profession.dwarf.mechanist.skill;

import lombok.Getter;
import model.profession.Ability;
import model.profession.dwarf.mechanist.MechanistAbilitiesStat;

@Getter
public class DroidToArms implements Ability {

    private String name;
    private int cooldown;
    private int consumption;

    DroidToArms() {
        this.name = MechanistAbilitiesStat.DROID_TO_ARMS.getAbilityName();
        this.cooldown = MechanistAbilitiesStat.DROID_TO_ARMS.getCoolDown();
        this.consumption = MechanistAbilitiesStat.DROID_TO_ARMS.getConsumption();
    }

    @Override
    public void getAbility() {
        // Do nothing because now this operation is not supported.
    }
}
