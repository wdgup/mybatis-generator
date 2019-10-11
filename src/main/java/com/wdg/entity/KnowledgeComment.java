package com.wdg.entity;

import java.io.Serializable;
import java.util.Date;

public class KnowledgeComment implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge_comment.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge_comment.knowledge_id
     *
     * @mbg.generated
     */
    private Integer knowledgeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge_comment.review_id
     *
     * @mbg.generated
     */
    private Integer reviewId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge_comment.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge_comment.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge_comment.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table knowledge_comment
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge_comment.id
     *
     * @return the value of knowledge_comment.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge_comment.id
     *
     * @param id the value for knowledge_comment.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge_comment.knowledge_id
     *
     * @return the value of knowledge_comment.knowledge_id
     *
     * @mbg.generated
     */
    public Integer getKnowledgeId() {
        return knowledgeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge_comment.knowledge_id
     *
     * @param knowledgeId the value for knowledge_comment.knowledge_id
     *
     * @mbg.generated
     */
    public void setKnowledgeId(Integer knowledgeId) {
        this.knowledgeId = knowledgeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge_comment.review_id
     *
     * @return the value of knowledge_comment.review_id
     *
     * @mbg.generated
     */
    public Integer getReviewId() {
        return reviewId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge_comment.review_id
     *
     * @param reviewId the value for knowledge_comment.review_id
     *
     * @mbg.generated
     */
    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge_comment.create_time
     *
     * @return the value of knowledge_comment.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge_comment.create_time
     *
     * @param createTime the value for knowledge_comment.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge_comment.update_time
     *
     * @return the value of knowledge_comment.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge_comment.update_time
     *
     * @param updateTime the value for knowledge_comment.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge_comment.status
     *
     * @return the value of knowledge_comment.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge_comment.status
     *
     * @param status the value for knowledge_comment.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knowledge_comment
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
        sb.append(", knowledgeId=").append(knowledgeId);
        sb.append(", reviewId=").append(reviewId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}