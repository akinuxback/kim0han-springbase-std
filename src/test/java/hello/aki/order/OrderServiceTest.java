package hello.aki.order;

import hello.aki.AppConfig;
import hello.aki.member.Grade;
import hello.aki.member.Member;
import hello.aki.member.MemberService;
import hello.aki.member.MemberServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderServiceTest {

    MemberService memberService;
    OrderService orderService;

    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }
    
    @Test
    public void createOrder() throws Exception{
        
        //given
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        //when
        Order order = orderService.createOrder(memberId, "itemA", 10000);
        //then
        assertThat(order.getDiscountPrice()).isEqualTo(1000);


    }

}