package Service;

import Dao.OutPlayerDao;
import Dao.PlayerDao;

import java.util.Collection;

//구현해야할 기능 1. 퇴출 선수 등록 2. 퇴출 선수 목록
public class OutPlayerService {
    private OutPlayerDao outPlayerDao;
    private Collection collection;

    public OutPlayerService(OutPlayerDao outPlayerDao, Collection collection) {
        this.outPlayerDao = outPlayerDao;
        this.collection = collection;
    }
}
