package com.example.liy.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Article implements Serializable {
    /**
     * 文章id
     */
    private Integer articleId;

    /**
     * 文章标题
     */
    private String articleTitle;

    /**
     * 简述
     */
    private String articleSketch;

    /**
     * 文章类型
     */
    private Integer articleType;

    /**
     * 作者
     */
    private String articleAuthor;

    /**
     * 发表时间
     */
    private Date articlePostedtime;

    /**
     * 状态
     */
    private Integer articleState;

    /**
     * 浏览次数
     */
    private Integer articleBrowse;

    /**
     * 文章内容
     */
    private String articleContent;

    private static final long serialVersionUID = 1L;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleSketch() {
        return articleSketch;
    }

    public void setArticleSketch(String articleSketch) {
        this.articleSketch = articleSketch;
    }

    public Integer getArticleType() {
        return articleType;
    }

    public void setArticleType(Integer articleType) {
        this.articleType = articleType;
    }

    public String getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleAuthor(String articleAuthor) {
        this.articleAuthor = articleAuthor;
    }

    public Date getArticlePostedtime() {
        return articlePostedtime;
    }

    public void setArticlePostedtime(Date articlePostedtime) {
        this.articlePostedtime = articlePostedtime;
    }

    public Integer getArticleState() {
        return articleState;
    }

    public void setArticleState(Integer articleState) {
        this.articleState = articleState;
    }

    public Integer getArticleBrowse() {
        return articleBrowse;
    }

    public void setArticleBrowse(Integer articleBrowse) {
        this.articleBrowse = articleBrowse;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Article other = (Article) that;
        return (this.getArticleId() == null ? other.getArticleId() == null : this.getArticleId().equals(other.getArticleId()))
            && (this.getArticleTitle() == null ? other.getArticleTitle() == null : this.getArticleTitle().equals(other.getArticleTitle()))
            && (this.getArticleSketch() == null ? other.getArticleSketch() == null : this.getArticleSketch().equals(other.getArticleSketch()))
            && (this.getArticleType() == null ? other.getArticleType() == null : this.getArticleType().equals(other.getArticleType()))
            && (this.getArticleAuthor() == null ? other.getArticleAuthor() == null : this.getArticleAuthor().equals(other.getArticleAuthor()))
            && (this.getArticlePostedtime() == null ? other.getArticlePostedtime() == null : this.getArticlePostedtime().equals(other.getArticlePostedtime()))
            && (this.getArticleState() == null ? other.getArticleState() == null : this.getArticleState().equals(other.getArticleState()))
            && (this.getArticleBrowse() == null ? other.getArticleBrowse() == null : this.getArticleBrowse().equals(other.getArticleBrowse()))
            && (this.getArticleContent() == null ? other.getArticleContent() == null : this.getArticleContent().equals(other.getArticleContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getArticleId() == null) ? 0 : getArticleId().hashCode());
        result = prime * result + ((getArticleTitle() == null) ? 0 : getArticleTitle().hashCode());
        result = prime * result + ((getArticleSketch() == null) ? 0 : getArticleSketch().hashCode());
        result = prime * result + ((getArticleType() == null) ? 0 : getArticleType().hashCode());
        result = prime * result + ((getArticleAuthor() == null) ? 0 : getArticleAuthor().hashCode());
        result = prime * result + ((getArticlePostedtime() == null) ? 0 : getArticlePostedtime().hashCode());
        result = prime * result + ((getArticleState() == null) ? 0 : getArticleState().hashCode());
        result = prime * result + ((getArticleBrowse() == null) ? 0 : getArticleBrowse().hashCode());
        result = prime * result + ((getArticleContent() == null) ? 0 : getArticleContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", articleId=").append(articleId);
        sb.append(", articleTitle=").append(articleTitle);
        sb.append(", articleSketch=").append(articleSketch);
        sb.append(", articleType=").append(articleType);
        sb.append(", articleAuthor=").append(articleAuthor);
        sb.append(", articlePostedtime=").append(articlePostedtime);
        sb.append(", articleState=").append(articleState);
        sb.append(", articleBrowse=").append(articleBrowse);
        sb.append(", articleContent=").append(articleContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}