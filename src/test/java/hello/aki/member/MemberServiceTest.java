package hello.aki.member;

import hello.aki.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

   MemberService memberService;

   @BeforeEach
   public void beforeEach(){
       AppConfig appConfig = new AppConfig();
       memberService = appConfig.memberService();
   }

    @Test
    public void join() throws Exception{

       //given
        Member member = new Member(1L, "memberA", Grade.BASIC);
        memberService.join(member);

        //when
        Member findMember = memberService.findMember(1L);

        //then
        Assertions.assertThat(findMember).isEqualTo(member);
    }

}