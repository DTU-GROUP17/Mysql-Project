package connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Connector {
    public static Connection conn;
    private static Statement stm;

    public Connector(String server, int port, String database,
                     String username, String password)
            throws InstantiationException, IllegalAccessException,
            ClassNotFoundException, SQLException {
        conn = connectToDatabase("jdbc:mysql://" + server + ":" + port + "/" + database,
                username, password);
        stm = conn.createStatement();
    }

    public Connector() throws InstantiationException, IllegalAccessException,
            ClassNotFoundException, SQLException {
        this(Constant.server, Constant.port, Constant.database,
                Constant.username, Constant.password);
    }

    /**
     * To connect to a MySQL-server
     *
     * @param url must have the form
     *            "jdbc:mysql://<server>/<database>" for default port (3306)
     *            OR
     *            "jdbc:mysql://<server>:<port>/<database>" for specific port
     *            more formally "jdbc:subprotocol:subname"
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws SQLException
     */
    public static Connection connectToDatabase(String url, String username, String password)
            throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        // call the driver class' no argument constructor
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

        // get Connection-object via DriverManager
        return DriverManager.getConnection(url, username, password);
    }

    public static ResultSet doQuery(String cmd) throws DALException {
        try {
            return stm.executeQuery(cmd);
        } catch (SQLException e) {
            throw new DALException(e);
        }
    }

    public static int doUpdate(String cmd) throws DALException {
        try {
            return stm.executeUpdate(cmd);
        } catch (SQLException e) {
            throw new DALException(e);
        }
    }


}