package cn.edu360.javase24.day05.lol;

import java.util.ArrayList;

public class Player {
    private String account;
    private String missionId;
    private String hero;
    private final ArrayList<String> equipments = new ArrayList<>();
    private int assistants;
    private int kills;
    private int killedSoldiers;
    private int missionScore;
    private int accumulatedScore;
    private int heroLevel;

    public void setAccount(String account) {
        this.account = account;
    }

    public void setMission(String missionId) {
        this.missionId = missionId;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    private void setHeroLevel() {
        if (this.missionScore < 100) {
            this.heroLevel = 1;
        } else if (this.missionScore < 200) {
            this.heroLevel = 2;
        } else if (this.missionScore < 300) {
            this.heroLevel = 3;
        } else {
            this.heroLevel = 4;
        }
    }

    public void addEquipments(String equipment) {
        this.equipments.add(equipment);
        this.missionScore += 5;
        setHeroLevel();
        this.accumulatedScore += 5;
    }

    public void addAssistants() {
        this.assistants++;
        this.missionScore += 10;
        setHeroLevel();
        this.accumulatedScore += 10;
    }

    public void addKills() {
        this.kills++;
        this.missionScore += 20;
        setHeroLevel();
        this.accumulatedScore += 20;
    }

    public void addKilledSoldier() {
        this.killedSoldiers++;
        this.missionScore += 2;
        setHeroLevel();
        this.accumulatedScore += 2;
    }

    public String getAccount() {
        return this.account;
    }

    public String getMissionId() {
        return this.missionId;
    }

    public ArrayList<String> getEquipments() {
        return equipments;
    }

    public int getAccumulatedScore() {
        return accumulatedScore;
    }

    public int getAssistants() {
        return assistants;
    }

    public int getHeroLevel() {
        return heroLevel;
    }

    public int getMissionScore() {
        return missionScore;
    }

    public String getHero() {
        return hero;
    }
}
