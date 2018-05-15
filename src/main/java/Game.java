import model.team.Team;
import util.output.OutPutData;

class Game {
    public void startGame() {
        Team team = new Team();
        OutPutData.printDatumInfo();
        OutPutData.printRaceInfo();
        team.createTeam();
        for (int i = 0; i < team.getHeroes().size(); i++) {
            OutPutData.printHeroInfo(team, i);
        }
    }
}
