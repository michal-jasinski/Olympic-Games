package netgloo.models;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface QuestionRepository extends JpaRepository<Question, Integer> {


    List<Question> findByGroupNumber(Integer groupNumber);
    Question findByGroupNumberAndQuestionNumber(Integer groupNumber, Integer questionNumber);


}
