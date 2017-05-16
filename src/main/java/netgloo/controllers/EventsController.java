package netgloo.controllers;

import netgloo.models.Events;
import netgloo.models.EventsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * A class to test interactions with the MySQL database using the UserDao class.
 *
 * @author netgloo
 */
@Controller
public class EventsController {
    @Autowired
    private EventsRepository eventsRepository;

    //
//
//    @RequestMapping("/create")
//    @ResponseBody
//    public void create(Integer groupCount, Integer questionCount, Integer answersCount) {
////        questionRepository.deleteAll();
////        for (int group = 1; group <= groupCount; group++) {
////            for (int questionNumber = 1; questionNumber <= questionCount; questionNumber++) {
////                questionRepository.save(new Question(group, questionNumber, answersCount));
////            }
////        }
//    }
//
    @RequestMapping("/get")
    @ResponseBody
    public List<Events> get() {
        return eventsRepository.findAll();
    }
//
//    @RequestMapping("/plus")
//    @ResponseBody
//    public void plus(Integer group, Integer questionNumber, Integer answer) {
////        Question question = questionRepository.findByGroupNumberAndQuestionNumber(group, questionNumber);
////        List<Integer> answers = question.getAnswers();
////        answers.set(answer,answers.get(answer)+1);
////        question.setAnswers(answers);
////        questionRepository.save(question);
////    }
//
//    @RequestMapping("/minus")
//    @ResponseBody
//    public void minus(Integer group, Integer questionNumber, Integer answer) {
////        Question question = questionRepository.findByGroupNumberAndQuestionNumber(group, questionNumber);
////        List<Integer> answers = question.getAnswers();
////        answers.set(answer, answers.get(answer) - 1);
////        question.setAnswers(answers);
////        questionRepository.save(question);
//    }
}
