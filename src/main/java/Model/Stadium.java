package Model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@ToString
@Getter
@Setter
public class Stadium {
    private Integer stadiumId;
    private String stadiumName;
    private Timestamp stadiumCreatedAt;

    @Builder
    public Stadium(Integer stadiumId, String stadiumName, Timestamp stadiumCreatedAt) {
        this.stadiumId = stadiumId;
        this.stadiumName = stadiumName;
        this.stadiumCreatedAt = stadiumCreatedAt;
    }
}
