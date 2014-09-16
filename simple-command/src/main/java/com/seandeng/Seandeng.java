package com.seandeng;

import org.apache.log4j.PropertyConfigurator;
import org.seandeng.persist.jdbc.SeandengDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Seandeng {

    public SeandengDAO getSeandengDAO() {
        return seandengDAO;
    }

    public void setSeandengDAO(SeandengDAO seandengDAO) {
        this.seandengDAO = seandengDAO;
    }

    private SeandengDAO seandengDAO;

	public static void main(String[] args) throws Exception {
		// Configure Log4J
		PropertyConfigurator.configure(Seandeng.class.getClassLoader().getResource(
				"log4j.properties"));

		ApplicationContext context = new ClassPathXmlApplicationContext(
					new String[] {"classpath:applicationContext-jdbc.xml",
                            "classpath:applicationContext-persist.xml"  });

        Seandeng main = new Seandeng();
        main.seandengDAO = (SeandengDAO) context.getBean("seandengDAO");
        main.seandengDAO.load();

	}

}
