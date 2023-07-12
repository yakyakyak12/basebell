import Dao.OutPlayerDao;
import Dao.PlayerDao;

import java.sql.Connection;

public class App {
    public static void main(String[] args) {
        Connection connection = db.DBConnection.getInstance();

//        PlayerDao playerDao = new PlayerDao(connection);
        OutPlayerDao outPlayerDao = new OutPlayerDao(connection);

        outPlayerDao.findAll();


    }
}
