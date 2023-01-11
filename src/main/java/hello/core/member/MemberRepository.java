package hello.core.member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);

}
//구현체 다른 패키지에 두는게 좋지만 간단히 같은패키지에 둬서 진행