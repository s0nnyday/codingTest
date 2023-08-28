import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        // 이름과 인덱스를 저장하는 해시맵을 생성
        HashMap<String, Integer> playerIndexMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerIndexMap.put(players[i], i);
        }

        // callings 배열을 순회하면서 순서를 바꿈
        for (int i = 0; i < callings.length; i++) {
            String name = callings[i];
            int currentIndex = playerIndexMap.get(name); // 현재 이름의 인덱스 가져옴
            if (currentIndex > 0) { // currentIndex가 0보다 큰 경우에만 순서 변경
                // 현재 이름과 바로 앞의 이름을 변경
                String temp = players[currentIndex];
                players[currentIndex] = players[currentIndex - 1];
                players[currentIndex - 1] = temp;

                // 해시맵의 인덱스 정보도 업데이트
                playerIndexMap.put(players[currentIndex], currentIndex);
                playerIndexMap.put(players[currentIndex - 1], currentIndex - 1);
            }
        }

        return players;
    }
}
