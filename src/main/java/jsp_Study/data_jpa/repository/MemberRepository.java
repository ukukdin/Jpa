package jsp_Study.data_jpa.repository;

import jsp_Study.data_jpa.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long > {

}
