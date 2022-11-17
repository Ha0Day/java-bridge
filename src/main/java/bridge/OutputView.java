package bridge;

import java.util.List;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {

    public static void printStart() {
        System.out.println("다리 건너기 게임을 시작합니다.");
    }

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public static void printMap(StringBuilder[] map) {
        System.out.println("[ " + map[0] + "]\n[ " + map[1] + "]");
    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public static void printResult(StringBuilder[] map, boolean flag, int count) {
        System.out.println("\n최종 게임 결과");
        System.out.println("[ " + map[0] + "]\n[ " + map[1] + "]");
        System.out.print("\n게임 성공 여부: ");
        if (flag) System.out.println("성공");
        if (!flag) System.out.println("실패");
        System.out.println("총 시도한 횟수: " + count);
    }
}
