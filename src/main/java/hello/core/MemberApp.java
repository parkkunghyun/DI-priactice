package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {
        //AppConfig appConfig = new AppConfig();
        //MemberService memberService = appConfig.memberService();
        // MemberService memberService = new MemberServiceImpl(memberRepository);
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        // spring은 AppicationContext가 컨테이너임! 애가 Bean을 모두 관리!
        // AnnotationConfigApplicationContext(AppConfig.class) AppConfig에 있는 환경설정을 가지고 이 안에 있는 bean을 컨테이너에 넣음
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class); // 이름과 타입

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

       Member findMember =  memberService.findMember(1L);
        System.out.println("new member = "+ member.getName());
        System.out.println("findMember = "+ findMember.getName());
    }
}
