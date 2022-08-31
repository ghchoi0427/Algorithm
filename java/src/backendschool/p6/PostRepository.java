package backendschool.p6;

import backendschool.p6.domain.Post;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PostRepository {
    private int sequence = 0;

    private HashMap<Integer, Post> map = new HashMap<>();

    public int getSequence() {
        return sequence;
    }

    public void save(Post post) {
        map.put(++sequence, post);
    }

    public List<Post> readAll() {
        return new ArrayList<>(map.values());
    }

}
