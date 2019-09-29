package com.weibo.dip.analysisql.dsl.filter.relational;

import com.weibo.dip.analysisql.dsl.filter.Filter;

/** EqStringRelationalFilter. */
public class EqStringRelationalFilter extends StringRelationalFilter {
  public EqStringRelationalFilter() {}

  public EqStringRelationalFilter(String name, String value) {
    super(Filter.EQ, name, value);
  }
}
