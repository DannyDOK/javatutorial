package cn.edu360.javase24.day05.lol;

import java.util.ArrayList;

public class PlayerTest {
    public static void main(String[] args) {

        Player player1 = new Player();
        player1.setAccount("Danny");
        player1.setHero("Hero1");
        player1.setMission("Mission1");

        player1.addEquipments("Sword");
        player1.addEquipments("Shield");

        System.out.println(player1.getMissionScore());
    }

}
