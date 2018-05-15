package model.profession;

import model.profession.dwarf.DwarfProfessionMap;
import model.profession.elf.ElfProfessionMap;
import model.profession.human.HumanProfessionMap;
import model.race.Race;

import java.util.HashMap;
import java.util.Map;

public class ProfessionMap {

    public static Map<String, Map<String, Race>> getProfession() {
        Map<String, Map<String, Race>> profession = new HashMap<>();

        profession.put(MapKeys.ONE.getKey(), new ElfProfessionMap().getElfProfession());
        profession.put(MapKeys.TWO.getKey(), new DwarfProfessionMap().getDwarfProfession());
        profession.put(MapKeys.THREE.getKey(), new HumanProfessionMap().getHumanProfession());

        return profession;
    }

}
