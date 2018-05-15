package model.hero;

import lombok.Getter;

@Getter
public enum HeroRanks {
    LEADER("Leader"), COMRADE("Comrade");

    private String rank;

    HeroRanks(String rankName) {
        this.rank = rankName;
    }
}
