import Util.ConnectionUtil;
import Util.FileUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * SQL sublanguage: DML (Data Manipulation Language)
 *
 * Now that we know how to insert and remove records from a table, we are going to learn how to update a record.
 *
 * To update a record we utilize the UPDATE keyword. The syntax for updating a record is as follows:
 * UPDATE table_name SET col_1 = val_1, col_2 = val_2, ...col_N = val_N WHERE condition;
 *
 * NOTE: The WHERE condition is important because if you leave this out, that column will be updated throughout all the records in the table.
 */
public class UpdateARecord {

    /**
     *  site_user table:
     *  |   id  |     firstname        |        lastname        |
     *  ----------------------------------------------------------
     *  |1      |'Steve'               |'Garcia'                |
     *  |2      |'Alexa'               |'Smith'                 |
     *  |3      |'Steve'               |'Jones'                 |
     *  |4      |'Brandon'             |'Smith'                 |
     *  |5      |'Adam'                |'Jones'                 |
     */


    public void problem1() {
        /**
         * Problem 1: Update Alexa's last name to be 'Rush' in the site_user table.
         */
        String sql = "UPDATE site_user SET lastname = 'Rush' WHERE firstname = 'Alexa';";

        try {
            Connection connection = ConnectionUtil.getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("problem1: " + e.getMessage() + '\n');
        }
    }
}
