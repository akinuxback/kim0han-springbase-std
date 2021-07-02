package hello.aki.web;

import hello.aki.common.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.inject.Provider;

@Service
@RequiredArgsConstructor
public class LogDemoService {

    //private final Provider<MyLogger> myLoggerProvider;
    private final MyLogger myLogger;

    public void logic(String id) {
        myLogger.log("service id = " + id);
    }

}
