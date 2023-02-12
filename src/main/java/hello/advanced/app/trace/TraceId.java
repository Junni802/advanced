package hello.advanced.app.trace;

import java.util.UUID;

public class TraceId {

    private String id;
    private int level;

    // TraceID 생성자
    public TraceId() {
        this.id = createId();
        this.level = 0;
    }

    // TraceId 생성자(매개변수)
    private TraceId(String id, int level){
        this.id = id;
        this.level = level;
    }

    // creadId 랜덤번호 메서드
    private String createId(){
        // UUID.randomUUID() = 랜덤번호생성
        return UUID.randomUUID().toString().substring(0, 8);
    }

    // TraceId level증가 메소드
    public TraceId createNextId(){
        return new TraceId(id, level+1);
    }

    // TraceId level감소 메소드
    public TraceId createPreviousId(){
        return new TraceId(id, level-1);
    }

    // TraceId 첫번째 레벨 확인유무 메소드
    public boolean isFirstLevel(){
        return level == 0;
    }

    public String getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }
}
