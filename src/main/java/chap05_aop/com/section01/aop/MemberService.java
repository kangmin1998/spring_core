package chap05_aop.com.section01.aop;

import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.Map;

@Service // DAO를 호출해서 사용할 비지니스로직을 작성할 클래스
public class MemberService {

    private final MemberDAO memberDAO;

    public MemberService(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    public Map<Long, MemberDTO> selectMembers() {
        System.out.println("SelectMembers 메소드 실행");
        return memberDAO.selectMembers();
    }

    public MemberDTO selectMember(Long id) {
        System.out.println("SelectMember 메소드 실행");
        return memberDAO.selectMember(id);
    }
}
