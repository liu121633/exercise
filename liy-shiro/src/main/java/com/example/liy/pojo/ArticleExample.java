package com.example.liy.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ArticleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andArticleIdIsNull() {
            addCriterion("article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(Integer value) {
            addCriterion("article_id =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(Integer value) {
            addCriterion("article_id <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(Integer value) {
            addCriterion("article_id >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_id >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(Integer value) {
            addCriterion("article_id <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_id <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<Integer> values) {
            addCriterion("article_id in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<Integer> values) {
            addCriterion("article_id not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(Integer value1, Integer value2) {
            addCriterion("article_id between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_id not between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNull() {
            addCriterion("article_title is null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNotNull() {
            addCriterion("article_title is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleEqualTo(String value) {
            addCriterion("article_title =", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotEqualTo(String value) {
            addCriterion("article_title <>", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThan(String value) {
            addCriterion("article_title >", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThanOrEqualTo(String value) {
            addCriterion("article_title >=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThan(String value) {
            addCriterion("article_title <", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThanOrEqualTo(String value) {
            addCriterion("article_title <=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLike(String value) {
            addCriterion("article_title like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotLike(String value) {
            addCriterion("article_title not like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIn(List<String> values) {
            addCriterion("article_title in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotIn(List<String> values) {
            addCriterion("article_title not in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleBetween(String value1, String value2) {
            addCriterion("article_title between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotBetween(String value1, String value2) {
            addCriterion("article_title not between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleSketchIsNull() {
            addCriterion("article_sketch is null");
            return (Criteria) this;
        }

        public Criteria andArticleSketchIsNotNull() {
            addCriterion("article_sketch is not null");
            return (Criteria) this;
        }

        public Criteria andArticleSketchEqualTo(String value) {
            addCriterion("article_sketch =", value, "articleSketch");
            return (Criteria) this;
        }

        public Criteria andArticleSketchNotEqualTo(String value) {
            addCriterion("article_sketch <>", value, "articleSketch");
            return (Criteria) this;
        }

        public Criteria andArticleSketchGreaterThan(String value) {
            addCriterion("article_sketch >", value, "articleSketch");
            return (Criteria) this;
        }

        public Criteria andArticleSketchGreaterThanOrEqualTo(String value) {
            addCriterion("article_sketch >=", value, "articleSketch");
            return (Criteria) this;
        }

        public Criteria andArticleSketchLessThan(String value) {
            addCriterion("article_sketch <", value, "articleSketch");
            return (Criteria) this;
        }

        public Criteria andArticleSketchLessThanOrEqualTo(String value) {
            addCriterion("article_sketch <=", value, "articleSketch");
            return (Criteria) this;
        }

        public Criteria andArticleSketchLike(String value) {
            addCriterion("article_sketch like", value, "articleSketch");
            return (Criteria) this;
        }

        public Criteria andArticleSketchNotLike(String value) {
            addCriterion("article_sketch not like", value, "articleSketch");
            return (Criteria) this;
        }

        public Criteria andArticleSketchIn(List<String> values) {
            addCriterion("article_sketch in", values, "articleSketch");
            return (Criteria) this;
        }

        public Criteria andArticleSketchNotIn(List<String> values) {
            addCriterion("article_sketch not in", values, "articleSketch");
            return (Criteria) this;
        }

        public Criteria andArticleSketchBetween(String value1, String value2) {
            addCriterion("article_sketch between", value1, value2, "articleSketch");
            return (Criteria) this;
        }

        public Criteria andArticleSketchNotBetween(String value1, String value2) {
            addCriterion("article_sketch not between", value1, value2, "articleSketch");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIsNull() {
            addCriterion("article_type is null");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIsNotNull() {
            addCriterion("article_type is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTypeEqualTo(Integer value) {
            addCriterion("article_type =", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeNotEqualTo(Integer value) {
            addCriterion("article_type <>", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeGreaterThan(Integer value) {
            addCriterion("article_type >", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_type >=", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeLessThan(Integer value) {
            addCriterion("article_type <", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeLessThanOrEqualTo(Integer value) {
            addCriterion("article_type <=", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIn(List<Integer> values) {
            addCriterion("article_type in", values, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeNotIn(List<Integer> values) {
            addCriterion("article_type not in", values, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeBetween(Integer value1, Integer value2) {
            addCriterion("article_type between", value1, value2, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("article_type not between", value1, value2, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIsNull() {
            addCriterion("article_author is null");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIsNotNull() {
            addCriterion("article_author is not null");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorEqualTo(String value) {
            addCriterion("article_author =", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorNotEqualTo(String value) {
            addCriterion("article_author <>", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorGreaterThan(String value) {
            addCriterion("article_author >", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("article_author >=", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorLessThan(String value) {
            addCriterion("article_author <", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorLessThanOrEqualTo(String value) {
            addCriterion("article_author <=", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorLike(String value) {
            addCriterion("article_author like", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorNotLike(String value) {
            addCriterion("article_author not like", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIn(List<String> values) {
            addCriterion("article_author in", values, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorNotIn(List<String> values) {
            addCriterion("article_author not in", values, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorBetween(String value1, String value2) {
            addCriterion("article_author between", value1, value2, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorNotBetween(String value1, String value2) {
            addCriterion("article_author not between", value1, value2, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticlePostedtimeIsNull() {
            addCriterion("article_postedtime is null");
            return (Criteria) this;
        }

        public Criteria andArticlePostedtimeIsNotNull() {
            addCriterion("article_postedtime is not null");
            return (Criteria) this;
        }

        public Criteria andArticlePostedtimeEqualTo(Date value) {
            addCriterion("article_postedtime =", value, "articlePostedtime");
            return (Criteria) this;
        }

        public Criteria andArticlePostedtimeNotEqualTo(Date value) {
            addCriterion("article_postedtime <>", value, "articlePostedtime");
            return (Criteria) this;
        }

        public Criteria andArticlePostedtimeGreaterThan(Date value) {
            addCriterion("article_postedtime >", value, "articlePostedtime");
            return (Criteria) this;
        }

        public Criteria andArticlePostedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("article_postedtime >=", value, "articlePostedtime");
            return (Criteria) this;
        }

        public Criteria andArticlePostedtimeLessThan(Date value) {
            addCriterion("article_postedtime <", value, "articlePostedtime");
            return (Criteria) this;
        }

        public Criteria andArticlePostedtimeLessThanOrEqualTo(Date value) {
            addCriterion("article_postedtime <=", value, "articlePostedtime");
            return (Criteria) this;
        }

        public Criteria andArticlePostedtimeIn(List<Date> values) {
            addCriterion("article_postedtime in", values, "articlePostedtime");
            return (Criteria) this;
        }

        public Criteria andArticlePostedtimeNotIn(List<Date> values) {
            addCriterion("article_postedtime not in", values, "articlePostedtime");
            return (Criteria) this;
        }

        public Criteria andArticlePostedtimeBetween(Date value1, Date value2) {
            addCriterion("article_postedtime between", value1, value2, "articlePostedtime");
            return (Criteria) this;
        }

        public Criteria andArticlePostedtimeNotBetween(Date value1, Date value2) {
            addCriterion("article_postedtime not between", value1, value2, "articlePostedtime");
            return (Criteria) this;
        }

        public Criteria andArticleStateIsNull() {
            addCriterion("article_state is null");
            return (Criteria) this;
        }

        public Criteria andArticleStateIsNotNull() {
            addCriterion("article_state is not null");
            return (Criteria) this;
        }

        public Criteria andArticleStateEqualTo(Integer value) {
            addCriterion("article_state =", value, "articleState");
            return (Criteria) this;
        }

        public Criteria andArticleStateNotEqualTo(Integer value) {
            addCriterion("article_state <>", value, "articleState");
            return (Criteria) this;
        }

        public Criteria andArticleStateGreaterThan(Integer value) {
            addCriterion("article_state >", value, "articleState");
            return (Criteria) this;
        }

        public Criteria andArticleStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_state >=", value, "articleState");
            return (Criteria) this;
        }

        public Criteria andArticleStateLessThan(Integer value) {
            addCriterion("article_state <", value, "articleState");
            return (Criteria) this;
        }

        public Criteria andArticleStateLessThanOrEqualTo(Integer value) {
            addCriterion("article_state <=", value, "articleState");
            return (Criteria) this;
        }

        public Criteria andArticleStateIn(List<Integer> values) {
            addCriterion("article_state in", values, "articleState");
            return (Criteria) this;
        }

        public Criteria andArticleStateNotIn(List<Integer> values) {
            addCriterion("article_state not in", values, "articleState");
            return (Criteria) this;
        }

        public Criteria andArticleStateBetween(Integer value1, Integer value2) {
            addCriterion("article_state between", value1, value2, "articleState");
            return (Criteria) this;
        }

        public Criteria andArticleStateNotBetween(Integer value1, Integer value2) {
            addCriterion("article_state not between", value1, value2, "articleState");
            return (Criteria) this;
        }

        public Criteria andArticleBrowseIsNull() {
            addCriterion("article_browse is null");
            return (Criteria) this;
        }

        public Criteria andArticleBrowseIsNotNull() {
            addCriterion("article_browse is not null");
            return (Criteria) this;
        }

        public Criteria andArticleBrowseEqualTo(Integer value) {
            addCriterion("article_browse =", value, "articleBrowse");
            return (Criteria) this;
        }

        public Criteria andArticleBrowseNotEqualTo(Integer value) {
            addCriterion("article_browse <>", value, "articleBrowse");
            return (Criteria) this;
        }

        public Criteria andArticleBrowseGreaterThan(Integer value) {
            addCriterion("article_browse >", value, "articleBrowse");
            return (Criteria) this;
        }

        public Criteria andArticleBrowseGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_browse >=", value, "articleBrowse");
            return (Criteria) this;
        }

        public Criteria andArticleBrowseLessThan(Integer value) {
            addCriterion("article_browse <", value, "articleBrowse");
            return (Criteria) this;
        }

        public Criteria andArticleBrowseLessThanOrEqualTo(Integer value) {
            addCriterion("article_browse <=", value, "articleBrowse");
            return (Criteria) this;
        }

        public Criteria andArticleBrowseIn(List<Integer> values) {
            addCriterion("article_browse in", values, "articleBrowse");
            return (Criteria) this;
        }

        public Criteria andArticleBrowseNotIn(List<Integer> values) {
            addCriterion("article_browse not in", values, "articleBrowse");
            return (Criteria) this;
        }

        public Criteria andArticleBrowseBetween(Integer value1, Integer value2) {
            addCriterion("article_browse between", value1, value2, "articleBrowse");
            return (Criteria) this;
        }

        public Criteria andArticleBrowseNotBetween(Integer value1, Integer value2) {
            addCriterion("article_browse not between", value1, value2, "articleBrowse");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}