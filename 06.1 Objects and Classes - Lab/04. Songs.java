import java.util.ArrayList;
import java.util.Scanner;

public class Songs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(scan.nextLine());
        ArrayList<Song> songs = new ArrayList<>();

        for (int i = 0; i < numberOfSongs; i++) {
            String line = scan.nextLine();
            String[] tokens = line.split("_");

            String typeList = tokens[0];
            String name = tokens[1];
            String time = tokens[2];

            Song song = new Song();

            song.setTypeList(typeList);
            song.setName(name);
            song.setTime(time);

            songs.add(song);
        }

        String command = scan.nextLine();

        if (command.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songs) {
                if (song.getTypeList().equals(command)) {
                    System.out.println(song.getName());
                }
            }
        }
    }

    public static class Song {
        private String typeList;
        private String name;
        private String time;

        public Song() {

        }

        public String getTypeList() {
            return typeList;
        }

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
