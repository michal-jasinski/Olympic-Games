package netgloo.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private int questionNumber;

    private int groupNumber;

    @Column
    @ElementCollection(targetClass=Integer.class)
    private List<Integer> answers;

    public Question(){}

    public Question(int groupNumber, int questionNumber, int answersCount){
        answers=new ArrayList<>();
        this.questionNumber=questionNumber;
        this.groupNumber = groupNumber;
        for (int answer=1;answer<=answersCount;answer++){
            answers.add(0);
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public Integer getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(Integer groupNumber) {
        this.groupNumber = groupNumber;
    }

    public List<Integer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Integer> answers) {
        this.answers = answers;
    }
}
