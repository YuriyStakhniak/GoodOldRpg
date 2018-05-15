package model.hero;

import lombok.Getter;
import lombok.Setter;
import model.race.Race;

@Getter
@Setter
public class Hero {

    private String heroName;
    private String raceName;
    private String professionName;
    private HeroStat heroStat;
    private double health;
    private double manaPoint;
    private double ragePoint;
    private HeroRanks heroRank;

    public Hero(String heroName, HeroRanks rank, Race race) {
        this.heroName = heroName;
        this.raceName = race.getRaceName();
        this.professionName = race.getProfessionName();
        this.heroStat = new HeroStat(race);
        this.heroRank = rank;
        this.health = StatUtil.calculateHealth(this.heroStat);
        this.manaPoint = StatUtil.calculateMana(this.heroStat);
        this.ragePoint = StatUtil.calculateRage(this.heroStat);
    }
}
