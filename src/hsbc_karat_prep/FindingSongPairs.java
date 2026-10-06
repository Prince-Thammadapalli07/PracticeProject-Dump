package hsbc_karat_prep;

import java.util.*;

public class FindingSongPairs {
    static void main() {
        String[][] songTimes1 = {
                {"Hey Hey What Can I Do", "4:00"},
                {"Rock and Roll", "3:41"},
                {"Communication Breakdown", "2:29"},
                {"Going to California", "3:30"},
                {"On The Run", "3:50"},
                {"The Wrestler", "3:50"},
                {"Black Mountain Side", "2:11"},
                {"Brown Eagle", "2:20"}
        };
        List<String> songPairs = findSongPairsOptimizedApproach(songTimes1);
        System.out.println(songPairs);
    }

    //this is pure bruteforce approach
    private static List<String> findSongPairs(String[][] songs) {
        //we need target first to compare the songs duration and find the pair
        int target = 420; // 7 * 60secs - 420
        List<String> pairSongs = new ArrayList<>();

        for (int i = 0; i < songs.length; i++) {
            String[] song1 = songs[i];
            String songName1 = song1[0];
            int duration1 = convertToDuration(song1[1]);

            for (int j = i+1; j < songs.length; j++) {
                String[] song2 = songs[j];
                String songName2 = song2[0];
                int duration2 = convertToDuration(song2[1]);

                //if 2 songs combined to target then add that pair to the list
                //we are adding all the pair that satisfy the condition.
                int totalDuration = duration1 + duration2;
                if (totalDuration == target) {
                    pairSongs.add("{"+songName1+","+songName2+"}");
                }
            }
        }

        return pairSongs;
    }

    //optimized approach
    static List<String> findSongPairsOptimizedApproach(String[][] songs) {
        int target = 420;
        //we are creating the empty hashmap for fast lookup for iterated songs
        Map<Integer, String> seenDurations = new HashMap<>();
        List<String> songPairs = new ArrayList<>();

        for (String[] song : songs) {
            String songName = song[0];
            int duration = convertToDuration(song[1]);
            int targetPairDuration = target - duration;
            if (seenDurations.containsKey(targetPairDuration)) {
                songPairs.add("{"+songName+","+seenDurations.get(targetPairDuration)+"}");
            } else {
                seenDurations.put(duration, songName);
            }
        }
        return songPairs;
    }

    private static int convertToDuration(String time) {
        String[] parts = time.split(":");
        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[1]);
        return minutes * 60 + seconds;
    }
}
