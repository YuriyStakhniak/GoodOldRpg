package model.profession.dwarf;

import model.profession.MapKeys;
import model.profession.dwarf.mechanist.DwarfMechanist;
import model.profession.dwarf.warrior.DwarfWarrior;
import model.race.Race;

import java.util.HashMap;
import java.util.Map;

public class DwarfProfessionMap {
    public Map<String, Race> getDwarfProfession() {
        Map<String, Race> dwarfProfession = new HashMap<>();

        dwarfProfession.put(MapKeys.ONE.getKey(), new DwarfWarrior());
        dwarfProfession.put(MapKeys.TWO.getKey(), new DwarfMechanist());

        return dwarfProfession;
    }
}
