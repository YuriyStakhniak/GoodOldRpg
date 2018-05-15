package model.profession.human;

import model.profession.MapKeys;
import model.profession.human.paladin.HumanPaladin;
import model.profession.human.priest.HumanPriest;
import model.race.Race;

import java.util.HashMap;
import java.util.Map;

public class HumanProfessionMap {

    public Map<String, Race> getHumanProfession() {
        Map<String, Race> humanProfession = new HashMap<>();

        humanProfession.put(MapKeys.ONE.getKey(), new HumanPriest());
        humanProfession.put(MapKeys.TWO.getKey(), new HumanPaladin());

        return humanProfession;
    }
}
