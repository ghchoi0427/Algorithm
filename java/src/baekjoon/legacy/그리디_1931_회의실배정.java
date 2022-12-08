package baekjoon.legacy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class 그리디_1931_회의실배정 {
    static List<Schedule> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(str.nextToken());
            int end = Integer.parseInt(str.nextToken());
            list.add(new Schedule(start, end));

        }
        list.sort(Comparator.comparing(Schedule::getEnd).thenComparing(Schedule::getStart));
        System.out.println(greedy());
    }

    static int greedy() {
        int time = 0;
        int count = 0;

        for (Schedule s : list) {
            if (time <= s.start) {
                time = s.end;
                count++;
            }
        }
        return count;
    }
}

class Schedule {
    public int getStart() {
        return start;
    }

    int start;
    int end;

    public int getEnd() {
        return end;
    }

    public Schedule(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
