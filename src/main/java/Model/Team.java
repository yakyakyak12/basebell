package Model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter @ToString
public class Team {
    private Integer teamId;
    private String teamName;
    private Timestamp teamCreatedAt;

    @Builder
    public Team(Integer teamId, String teamName, Timestamp teamCreatedAt) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.teamCreatedAt = teamCreatedAt;
    }
}
