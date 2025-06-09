import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.ConnectionUtil;

public class Lab {

    public void createSong(Song song) {
        try {
            Connection connection = ConnectionUtil.getConnection();
            String sql = "INSERT INTO songs (title, artist) VALUES (?, ?);";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, song.gettitle());
            ps.setString(2, song.getArtist());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Song> getAllSongs() {
        List<Song> songs = new ArrayList<>();
        try {
            Connection connection = ConnectionUtil.getConnection();
            String sql = "SELECT * FROM songs;";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String artist = rs.getString("artist");
                songs.add(new Song(id, title, artist));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return songs;
    }
}
