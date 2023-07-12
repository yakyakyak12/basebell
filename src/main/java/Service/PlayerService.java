package Service;

import Dao.PlayerDao;

import java.util.Collection;

//구현해야할 기능 1. 선수 등록 2. 팀별 선수 목록
public class PlayerService {

    private PlayerDao playerDao;
    private Collection collection;

    public PlayerService(PlayerDao playerDao, Collection collection) {
        this.playerDao = playerDao;
        this.collection = collection;
    }
}
