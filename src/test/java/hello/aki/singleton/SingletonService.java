package hello.aki.singleton;


/**
 *  섹션 5 -싱글톤 컨테이너
 *
 *        2. 싱글톤 패턴
 * */
public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance(){
        return instance;
    }

    private SingletonService(){
    }
    
    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
    

}
