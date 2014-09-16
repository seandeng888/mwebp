package org.seandeng.persist.jdbc;

import org.hibernate.Query;
import org.hibernate.Session;
import org.sonatype.mavenbook.weather.model.Location;
import org.sonatype.mavenbook.weather.model.Weather;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SeandengDAO extends JdbcDaoSupport {

    public SeandengDAO() {}

    public void load() {
        List<Map> list = this.getJdbcTemplate().queryForList("SELECT ID FROM SEANDENG");
        for (Map map:list) {
            String xx = (String)map.get("ID");
            System.out.println(xx);
        }
    }


}