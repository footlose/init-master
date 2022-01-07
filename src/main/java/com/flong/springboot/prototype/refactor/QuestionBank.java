package com.flong.springboot.prototype.refactor;

import com.flong.springboot.prototype.matter.AnswerQuestion;
import com.flong.springboot.prototype.matter.ChoiceQuestion;
import com.flong.springboot.prototype.refactor.util.Topic;
import com.flong.springboot.prototype.refactor.util.TopicRandomUtil;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author wangshuai
 * @version 1.0
 * @description 题库类
 * @date 2021/10/19 8:57 上午
 */
public class QuestionBank implements Cloneable {
    // 考生
    @Getter
    @Setter
    private String candidate;
    // 考号
    @Getter
    @Setter
    private String number;

    @Getter
    private ArrayList<ChoiceQuestion> choiceQuestionList = new ArrayList<>();

    @Getter
    private ArrayList<AnswerQuestion> answerQuestionList = new ArrayList<>();

    /**
     * 添加一个选择题
     *
     * @param choiceQuestion
     * @return
     * @author wangshuai
     * @date 2021/10/19 9:17 上午
     */
    public QuestionBank append(ChoiceQuestion choiceQuestion) {
        choiceQuestionList.add(choiceQuestion);
        return this;
    }

    /**
     * 添加一个简答题
     *
     * @param answerQuestion
     * @return
     * @author wangshuai
     * @date 2021/10/19 9:17 上午
     */
    public QuestionBank append(AnswerQuestion answerQuestion) {
        answerQuestionList.add(answerQuestion);
        return this;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        QuestionBank questionBank = (QuestionBank) super.clone();
        questionBank.choiceQuestionList = (ArrayList<ChoiceQuestion>) choiceQuestionList.clone();
        questionBank.answerQuestionList = (ArrayList<AnswerQuestion>) answerQuestionList.clone();

        // 题目乱序
        Collections.shuffle(questionBank.choiceQuestionList);
        Collections.shuffle(questionBank.answerQuestionList);
        // 答案乱序
        List<ChoiceQuestion> choiceQuestionList = questionBank.choiceQuestionList;
        for (ChoiceQuestion question : choiceQuestionList) {
            Topic random = TopicRandomUtil.random(question.getOption(), question.getKey());
            question.setOption(random.getOption());
            question.setKey(random.getKey());
        }
        return questionBank;
    }

    @Override
    public String toString() {

        StringBuilder detail = new StringBuilder("考生：" + candidate + "\r\n" +
                "考号：" + number + "\r\n" +
                "--------------------------------------------\r\n" +
                "一、选择题" + "\r\n\n");

        for (int idx = 0; idx < choiceQuestionList.size(); idx++) {
            detail.append("第").append(idx + 1).append("题：").append(choiceQuestionList.get(idx).getName()).append("\r\n");
            Map<String, String> option = choiceQuestionList.get(idx).getOption();
            for (String key : option.keySet()) {
                detail.append(key).append("：").append(option.get(key)).append("\r\n");
            }
            detail.append("答案：").append(choiceQuestionList.get(idx).getKey()).append("\r\n\n");
        }

        detail.append("二、问答题" + "\r\n\n");

        for (int idx = 0; idx < answerQuestionList.size(); idx++) {
            detail.append("第").append(idx + 1).append("题：").append(answerQuestionList.get(idx).getName()).append("\r\n");
            detail.append("答案：").append(answerQuestionList.get(idx).getKey()).append("\r\n\n");
        }

        return detail.toString();
    }
}
