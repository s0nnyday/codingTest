import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> playerIndexMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerIndexMap.put(players[i], i);
        }

        for (int i = 0; i < callings.length; i++) {
            String name = callings[i];
            int currentIndex = playerIndexMap.get(name); // 현재 이름의 인덱스 가져오기
            if (currentIndex > 0) { // currentIndex가 0보다 큰 경우에만 순서 변경
                String temp = players[currentIndex];
                players[currentIndex] = players[currentIndex - 1];
                players[currentIndex - 1] = temp;

                playerIndexMap.put(players[currentIndex], currentIndex);
                playerIndexMap.put(players[currentIndex - 1], currentIndex - 1);
            }
        }

        return players;
    }
}
