package hello.aki;

import hello.aki.discount.DiscountPolicy;
import hello.aki.discount.RateDiscountPolicy;
import hello.aki.member.MemberRepository;
import hello.aki.member.MemberService;
import hello.aki.member.MemberServiceImpl;
import hello.aki.member.MemoryMemberRepository;
import hello.aki.order.OrderService;
import hello.aki.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(
                memberRepository(),
                discountPolicy()
        );

    }

    @Bean
    public DiscountPolicy discountPolicy() {
        //return new FixDiscountPolicy
        return new RateDiscountPolicy();
    }


}
