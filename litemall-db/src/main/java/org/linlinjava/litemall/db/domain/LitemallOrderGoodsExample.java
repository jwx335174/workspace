package org.linlinjava.litemall.db.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LitemallOrderGoodsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table litemall_order_goods
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table litemall_order_goods
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table litemall_order_goods
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_goods
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    public LitemallOrderGoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_goods
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_goods
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_goods
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_goods
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_goods
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_goods
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_goods
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_goods
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_goods
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_goods
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_goods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public LitemallOrderGoodsExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order_goods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public LitemallOrderGoodsExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table litemall_order_goods
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> goodsSpecificationIdsCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            goodsSpecificationIdsCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getGoodsSpecificationIdsCriteria() {
            return goodsSpecificationIdsCriteria;
        }

        protected void addGoodsSpecificationIdsCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            goodsSpecificationIdsCriteria.add(new Criterion(condition, value, "org.linlinjava.litemall.db.mybatis.JsonIntegerArrayTypeHandler"));
            allCriteria = null;
        }

        protected void addGoodsSpecificationIdsCriterion(String condition, Integer[] value1, Integer[] value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            goodsSpecificationIdsCriteria.add(new Criterion(condition, value1, value2, "org.linlinjava.litemall.db.mybatis.JsonIntegerArrayTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || goodsSpecificationIdsCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(goodsSpecificationIdsCriteria);
            }
            return allCriteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
            allCriteria = null;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsSnIsNull() {
            addCriterion("goods_sn is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSnIsNotNull() {
            addCriterion("goods_sn is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSnEqualTo(String value) {
            addCriterion("goods_sn =", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnNotEqualTo(String value) {
            addCriterion("goods_sn <>", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnGreaterThan(String value) {
            addCriterion("goods_sn >", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnGreaterThanOrEqualTo(String value) {
            addCriterion("goods_sn >=", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnLessThan(String value) {
            addCriterion("goods_sn <", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnLessThanOrEqualTo(String value) {
            addCriterion("goods_sn <=", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnLike(String value) {
            addCriterion("goods_sn like", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnNotLike(String value) {
            addCriterion("goods_sn not like", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnIn(List<String> values) {
            addCriterion("goods_sn in", values, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnNotIn(List<String> values) {
            addCriterion("goods_sn not in", values, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnBetween(String value1, String value2) {
            addCriterion("goods_sn between", value1, value2, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnNotBetween(String value1, String value2) {
            addCriterion("goods_sn not between", value1, value2, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("`number` is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("`number` is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Short value) {
            addCriterion("`number` =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Short value) {
            addCriterion("`number` <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Short value) {
            addCriterion("`number` >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Short value) {
            addCriterion("`number` >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Short value) {
            addCriterion("`number` <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Short value) {
            addCriterion("`number` <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Short> values) {
            addCriterion("`number` in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Short> values) {
            addCriterion("`number` not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Short value1, Short value2) {
            addCriterion("`number` between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Short value1, Short value2) {
            addCriterion("`number` not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andRetailPriceIsNull() {
            addCriterion("retail_price is null");
            return (Criteria) this;
        }

        public Criteria andRetailPriceIsNotNull() {
            addCriterion("retail_price is not null");
            return (Criteria) this;
        }

        public Criteria andRetailPriceEqualTo(BigDecimal value) {
            addCriterion("retail_price =", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceNotEqualTo(BigDecimal value) {
            addCriterion("retail_price <>", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceGreaterThan(BigDecimal value) {
            addCriterion("retail_price >", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("retail_price >=", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceLessThan(BigDecimal value) {
            addCriterion("retail_price <", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("retail_price <=", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceIn(List<BigDecimal> values) {
            addCriterion("retail_price in", values, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceNotIn(List<BigDecimal> values) {
            addCriterion("retail_price not in", values, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("retail_price between", value1, value2, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("retail_price not between", value1, value2, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationValuesIsNull() {
            addCriterion("goods_specification_values is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationValuesIsNotNull() {
            addCriterion("goods_specification_values is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationValuesEqualTo(String value) {
            addCriterion("goods_specification_values =", value, "goodsSpecificationValues");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationValuesNotEqualTo(String value) {
            addCriterion("goods_specification_values <>", value, "goodsSpecificationValues");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationValuesGreaterThan(String value) {
            addCriterion("goods_specification_values >", value, "goodsSpecificationValues");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationValuesGreaterThanOrEqualTo(String value) {
            addCriterion("goods_specification_values >=", value, "goodsSpecificationValues");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationValuesLessThan(String value) {
            addCriterion("goods_specification_values <", value, "goodsSpecificationValues");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationValuesLessThanOrEqualTo(String value) {
            addCriterion("goods_specification_values <=", value, "goodsSpecificationValues");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationValuesLike(String value) {
            addCriterion("goods_specification_values like", value, "goodsSpecificationValues");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationValuesNotLike(String value) {
            addCriterion("goods_specification_values not like", value, "goodsSpecificationValues");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationValuesIn(List<String> values) {
            addCriterion("goods_specification_values in", values, "goodsSpecificationValues");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationValuesNotIn(List<String> values) {
            addCriterion("goods_specification_values not in", values, "goodsSpecificationValues");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationValuesBetween(String value1, String value2) {
            addCriterion("goods_specification_values between", value1, value2, "goodsSpecificationValues");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationValuesNotBetween(String value1, String value2) {
            addCriterion("goods_specification_values not between", value1, value2, "goodsSpecificationValues");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationIdsIsNull() {
            addCriterion("goods_specification_ids is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationIdsIsNotNull() {
            addCriterion("goods_specification_ids is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationIdsEqualTo(Integer[] value) {
            addGoodsSpecificationIdsCriterion("goods_specification_ids =", value, "goodsSpecificationIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationIdsNotEqualTo(Integer[] value) {
            addGoodsSpecificationIdsCriterion("goods_specification_ids <>", value, "goodsSpecificationIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationIdsGreaterThan(Integer[] value) {
            addGoodsSpecificationIdsCriterion("goods_specification_ids >", value, "goodsSpecificationIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationIdsGreaterThanOrEqualTo(Integer[] value) {
            addGoodsSpecificationIdsCriterion("goods_specification_ids >=", value, "goodsSpecificationIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationIdsLessThan(Integer[] value) {
            addGoodsSpecificationIdsCriterion("goods_specification_ids <", value, "goodsSpecificationIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationIdsLessThanOrEqualTo(Integer[] value) {
            addGoodsSpecificationIdsCriterion("goods_specification_ids <=", value, "goodsSpecificationIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationIdsLike(Integer[] value) {
            addGoodsSpecificationIdsCriterion("goods_specification_ids like", value, "goodsSpecificationIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationIdsNotLike(Integer[] value) {
            addGoodsSpecificationIdsCriterion("goods_specification_ids not like", value, "goodsSpecificationIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationIdsIn(List<Integer[]> values) {
            addGoodsSpecificationIdsCriterion("goods_specification_ids in", values, "goodsSpecificationIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationIdsNotIn(List<Integer[]> values) {
            addGoodsSpecificationIdsCriterion("goods_specification_ids not in", values, "goodsSpecificationIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationIdsBetween(Integer[] value1, Integer[] value2) {
            addGoodsSpecificationIdsCriterion("goods_specification_ids between", value1, value2, "goodsSpecificationIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationIdsNotBetween(Integer[] value1, Integer[] value2) {
            addGoodsSpecificationIdsCriterion("goods_specification_ids not between", value1, value2, "goodsSpecificationIds");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNull() {
            addCriterion("pic_url is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(String value) {
            addCriterion("pic_url =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(String value) {
            addCriterion("pic_url <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(String value) {
            addCriterion("pic_url >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pic_url >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(String value) {
            addCriterion("pic_url <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(String value) {
            addCriterion("pic_url <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLike(String value) {
            addCriterion("pic_url like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotLike(String value) {
            addCriterion("pic_url not like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<String> values) {
            addCriterion("pic_url in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<String> values) {
            addCriterion("pic_url not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(String value1, String value2) {
            addCriterion("pic_url between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(String value1, String value2) {
            addCriterion("pic_url not between", value1, value2, "picUrl");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table litemall_order_goods
     *
     * @mbg.generated do_not_delete_during_merge Tue Mar 20 00:11:33 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_order_goods
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private LitemallOrderGoodsExample example;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_order_goods
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        protected Criteria(LitemallOrderGoodsExample example) {
            super();
            this.example = example;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_order_goods
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public LitemallOrderGoodsExample example() {
            return this.example;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_order_goods
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        /**
         * This interface was generated by MyBatis Generator.
         * This interface corresponds to the database table litemall_order_goods
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public interface ICriteriaAdd {
            /**
             * This method was generated by MyBatis Generator.
             * This method corresponds to the database table litemall_order_goods
             *
             * @mbg.generated
             * @project https://github.com/itfsw/mybatis-generator-plugin
             */
            Criteria add(Criteria add);
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table litemall_order_goods
     *
     * @mbg.generated Tue Mar 20 00:11:33 CST 2018
     */
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