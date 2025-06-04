import Util.ConnectionUtil;
import Util.FileUtil;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

/**
 * SQL sublanguage: DQL (Data Query Language)
 *
 * The GROUP BY clause allows you to group your results and can be used with the ORDER BY clause. Group By is
 * used in conjunction with aggregate functions. However, you cannot group by the output of the function.
 */
public class GroupByActivity {

    /**
     *   song table
     *   | id |     artist     |        album        |         song         |
     *   --------------------------------------------------------------------
     *   |1   |'The Beatles'   |'Abbey Road'         |'Come Together'       |
     *   |2   |'The Beatles'   |'Let It Be'          |'Let It Be'           |
     *   |3   |'Led Zeppelin'  |'IV'                 |'Black Dog'           |
     *   |4   |'Led Zeppelin'  |'Physical Graffiti'  |'Kashmir'             |
     *   |5   |'Led Zeppelin'  |'IV'                 |'Going to California' |
     *   |6   |'The Eagles'    |'Hotel California'   |'Hotel California'    |
     */

    public Map<String, Integer> problem1() {
        /**
         * Problem 1: Use the GROUP BY clause with the COUNT() aggregate function to query the song table for the
         * number of songs by each artist. Your SQL query should select both the artist column and the COUNT(song)
         * column, while also leveraging the group by clause.
         */

        String sql = FileUtil.parseSQLFile("problem1.sql"); // Make sure this file contains the correct query

        Map<String, Integer> counts = new HashMap<>();
        try {
            Connection connection = ConnectionUtil.getConnection();
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                counts.put(rs.getString("artist"), rs.getInt("song_count")); // Use alias from SQL
            }

            rs.close();
            s.close();
            connection.close(); // optional, based on how your ConnectionUtil is implemented
        } catch (SQLException e) {
            System.out.println("problem1: " + e.getMessage() + '\n');
        }

        return counts;
    }
}
