package ph.edu.dlsu.mobidev.patapp;

import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

public class Achievement {
    String description;
    ph.edu.dlsu.mobidev.patapp.Timestamp timestamp;
    String username;
    String achievement_id;
    int patCount = 0;
    int mehCount = 0;
    Map<String, Boolean> pats = new HashMap<>();
    Map<String, Boolean> mehs = new HashMap<>();
    long timestamps;
    String usernameKey;

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

    public Achievement(String description, ph.edu.dlsu.mobidev.patapp.Timestamp timestamp, String username, String achievement_id) {
        this.description = description;
        this.timestamp = timestamp;
        this.username = username;
        this.achievement_id = achievement_id;
    }

    public Achievement(String description, ph.edu.dlsu.mobidev.patapp.Timestamp timestamp, String username) {
        this.description = description;
        this.timestamp = timestamp;
        this.username = username;
    }

    public Achievement(String description){
        this.description = description;
    }

    public Achievement(){}

    @Exclude
    public Map<String, Object> toMap(){
        HashMap<String, Object> result = new HashMap<>();
        result.put("description", description);
        result.put("timestamp", timestamp);
        result.put("timestamps", timestamps);
        result.put("username", username);
        result.put("patCount", patCount);
        result.put("pats", pats);
        result.put("mehCount", mehCount);
        result.put("mehs", mehs);
        result.put("usernameKey", usernameKey);

        return result;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ph.edu.dlsu.mobidev.patapp.Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(ph.edu.dlsu.mobidev.patapp.Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getAchievement_id() {
        return achievement_id;
    }

    public void setAchievement_id(String achievement_id) {
        this.achievement_id = achievement_id;
    }

    public Map<String, Boolean> getPats() {
        return pats;
    }

    public void setPats(Map<String, Boolean> pats) {
        this.pats = pats;
    }

    public Map<String, Boolean> getMehs() {
        return mehs;
    }

    public void setMehs(Map<String, Boolean> mehs) {
        this.mehs = mehs;
    }

    public int getPatCount() {
        return patCount;
    }

    public void setPatCount(int patCount) {
        this.patCount = patCount;
    }

    public int getMehCount() {
        return mehCount;
    }

    public void setMehCount(int mehCount) {
        this.mehCount = mehCount;
    }

    public long getTimestamps() {
        return timestamps;
    }

    public void setTimestamps(long timestamps) {
        this.timestamps = timestamps;
    }

    public String getUsernameKey() {
        return usernameKey;
    }

    public void setUsernameKey(String usernameKey) {
        this.usernameKey = usernameKey;
    }
}