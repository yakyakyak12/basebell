package Dao;

import lombok.Getter;

import java.sql.Connection;

@Getter
public class PlayerDao {
    public Connection connection;

    public PlayerDao(Connection connection) {
        this.connection = connection;
    }
}
