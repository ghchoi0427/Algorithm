package backendschool.p6;

import backendschool.p6.domain.Post;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class PostController3 implements Controller{

    private static PostController3 instance = new PostController3();

    public static PostController3 getInstance() {
        return instance;
    }

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private HashMap<Integer, Post> map = new HashMap<>();
    private int sequence = 0;

    @Override
    public void read() {
        System.out.println("map.size() = " + map.size());
        System.out.println("번호 / 제목");
        System.out.println("----------------");
        map.forEach((key, value) -> System.out.println(key + " / " + value.getTitle()));
    }

    @Override
    public void write() {
        try {
            System.out.print("제목을 입력하세요 : ");
            String title = br.readLine();
            System.out.print("내용을 입력하세요 : ");
            String content = br.readLine();
            map.put(++sequence, new Post(title, content));
            System.out.println(sequence + "번 글이 작성되었습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
