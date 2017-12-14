package ph.edu.dlsu.mobidev.machineprojectv1;

import java.sql.Timestamp;
import java.util.ArrayList;

/**
 * Created by Nikko on 11/12/2017.
 */

public class Achievement {
    String title;
    String description;
    ph.edu.dlsu.mobidev.machineprojectv1.Timestamp timestamp;
    String username;
    String achievement_id;
    int patsCount;
    int mehsCount;

    public String getAchievementId() {
        return achievement_id;
    }

    public void setAchievementId(String achievement_id) {
        this.achievement_id = achievement_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Achievement(String title, String description, ph.edu.dlsu.mobidev.machineprojectv1.Timestamp timestamp, String username, String achievement_id) {
        this.title = title;
        this.description = description;
        this.timestamp = timestamp;
        this.username = username;
        this.achievement_id = achievement_id;
    }

    public Achievement(String title, String description, ph.edu.dlsu.mobidev.machineprojectv1.Timestamp timestamp, String username, int pats, int mehs) {
        this.title = title;
        this.description = description;
        this.timestamp = timestamp;
        this.username = username;
        this.patsCount = pats;
        this.mehsCount = mehs;
    }

    public Achievement(String title, String description){
        this.title = title;
        this.description = description;
    }
    public Achievement(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ph.edu.dlsu.mobidev.machineprojectv1.Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(ph.edu.dlsu.mobidev.machineprojectv1.Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public int getPats() {
        return patsCount;
    }

    public void setPats(int pats) {
        this.patsCount = pats;
    }

    public int getMehs() {
        return mehsCount;
    }

    public void setMehs(int mehs) {
        this.mehsCount = mehs;
    }


}