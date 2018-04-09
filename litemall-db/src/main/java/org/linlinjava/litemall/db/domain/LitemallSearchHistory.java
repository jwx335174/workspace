package org.linlinjava.litemall.db.domain;

import java.time.LocalDate;

public class LitemallSearchHistory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_search_history.id
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_search_history.user_id
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_search_history.keyword
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    private String keyword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_search_history.from
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    private String from;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_search_history.add_time
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    private LocalDate addTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_search_history.id
     *
     * @return the value of litemall_search_history.id
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_search_history.id
     *
     * @param id the value for litemall_search_history.id
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_search_history.user_id
     *
     * @return the value of litemall_search_history.user_id
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_search_history.user_id
     *
     * @param userId the value for litemall_search_history.user_id
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_search_history.keyword
     *
     * @return the value of litemall_search_history.keyword
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_search_history.keyword
     *
     * @param keyword the value for litemall_search_history.keyword
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_search_history.from
     *
     * @return the value of litemall_search_history.from
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    public String getFrom() {
        return from;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_search_history.from
     *
     * @param from the value for litemall_search_history.from
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_search_history.add_time
     *
     * @return the value of litemall_search_history.add_time
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    public LocalDate getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_search_history.add_time
     *
     * @param addTime the value for litemall_search_history.add_time
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    public void setAddTime(LocalDate addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_search_history
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", keyword=").append(keyword);
        sb.append(", from=").append(from);
        sb.append(", addTime=").append(addTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_search_history
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
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
        LitemallSearchHistory other = (LitemallSearchHistory) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getKeyword() == null ? other.getKeyword() == null : this.getKeyword().equals(other.getKeyword()))
            && (this.getFrom() == null ? other.getFrom() == null : this.getFrom().equals(other.getFrom()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_search_history
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getKeyword() == null) ? 0 : getKeyword().hashCode());
        result = prime * result + ((getFrom() == null) ? 0 : getFrom().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table litemall_search_history
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id"),
        userId("user_id"),
        keyword("keyword"),
        from("from"),
        addTime("add_time");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_search_history
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_search_history
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_search_history
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_search_history
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_search_history
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_search_history
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.column + " ASC";
        }
    }
}