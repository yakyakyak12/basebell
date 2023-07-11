package Model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.sql.Timestamp;

@ToString
@Getter
public class OutPlayer {
    private Integer outPlayerId;
    private Integer playerId;
    private String reason;
    private Timestamp createdAt;

    @Builder
    public OutPlayer(Integer outPlayerId, Integer playerId, String reason, Timestamp createdAt) {
        this.outPlayerId = outPlayerId;
        this.playerId = playerId;
        this.reason = reason;
        this.createdAt = createdAt;
    }

}
