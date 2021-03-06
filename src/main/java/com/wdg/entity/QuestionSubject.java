package com.wdg.entity;

import java.io.Serializable;

public class QuestionSubject implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_subject.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_subject.question_id
     *
     * @mbg.generated
     */
    private Integer questionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_subject.subject_id
     *
     * @mbg.generated
     */
    private Integer subjectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table question_subject
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_subject.id
     *
     * @return the value of question_subject.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_subject.id
     *
     * @param id the value for question_subject.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_subject.question_id
     *
     * @return the value of question_subject.question_id
     *
     * @mbg.generated
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_subject.question_id
     *
     * @param questionId the value for question_subject.question_id
     *
     * @mbg.generated
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_subject.subject_id
     *
     * @return the value of question_subject.subject_id
     *
     * @mbg.generated
     */
    public Integer getSubjectId() {
        return subjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_subject.subject_id
     *
     * @param subjectId the value for question_subject.subject_id
     *
     * @mbg.generated
     */
    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_subject
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", questionId=").append(questionId);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}