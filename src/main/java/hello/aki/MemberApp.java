package hello.aki;

import hello.aki.member.Grade;
import hello.aki.member.Member;
import hello.aki.member.MemberService;
import hello.aki.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();

        MemberService memberService = appConfig.memberService();
        Member memberA = new Member(1L, "MemberA", Grade.VIP);
        memberService.join(memberA);

        Member findMember = memberService.findMember(1L);
        System.out.println("new Member  " + memberA.getName());
        System.out.println("find Member  " + findMember.getName());

    }

}
