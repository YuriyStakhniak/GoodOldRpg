package model.team;

import lombok.Getter;
import lombok.Setter;
import model.hero.Hero;
import model.hero.HeroRanks;
import model.hero.StatUtil;
import model.labirinth.Room;
import model.profession.ProfessionMap;
import util.GameConst;
import util.input.InputData;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Team implements GameConst {

    private List<Hero> heroes  = new ArrayList<>();
    private Room actualPosition;
    private Room previousPosition;

    public void createTeam(){
        heroes.add(createLiederHero());
        StatUtil.addHeroStat(heroes.get(0));
        for (int i = 1; i < TEAM_MEMBERS; i++) {
            System.out.println("Create " + i + " comrade hero");
            heroes.add(createComradeHero());
            StatUtil.addHeroStat(heroes.get(i));
        }
    }

    private Hero createComradeHero() {
        String heroName = InputData.getHeroName();
        String race = InputData.getRaceName();
        return new Hero(heroName, HeroRanks.COMRADE,
                ProfessionMap.getProfession().get(race).get(InputData.getProfessionName(race)));
    }

    private Hero createLiederHero() {
        System.out.println("Create leader hero");
        String heroName = InputData.getHeroName();
        String race = InputData.getRaceName();
        return new Hero(heroName, HeroRanks.LEADER,
                ProfessionMap.getProfession().get(race).get(InputData.getProfessionName(race)));
    }
}
