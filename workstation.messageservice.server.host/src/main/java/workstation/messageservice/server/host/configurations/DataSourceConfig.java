package workstation.messageservice.server.host.configurations;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

/**
 * 数据库配置
 */

@Configuration
public class DataSourceConfig {

    public static final String MYSQL = "mysql";
    private static final String URL = "datasource.%s.url";
    private static final String USERNAME = "datasource.%s.username";
    private static final String PASSWORD = "datasource.%s.password";
    private static final String DRIVER = "datasource.%s.driverClassName";
    private static final String MAXACTIVE = "datasource.%s.maxActive";
    private static final String MAXIDLE = "datasource.%s.maxIdle";
    private static final String MINIDLE = "datasource.%s.minIdle";
    private static final String MAXWAIT = "datasource.%s.maxWait";
    private static final String REMOVE_ABANDONED = "datasource.%s.removeAbandoned";
    private static final String REMOVE_ABANDONED_TIMEOUT = "datasource.%s.removeAbandonedTimeout";
    private static final String LOG_ABANDONED = "datasource.%s.logAbandoned";
    private static final String MIN_E_IDLE_TIMEMILLIS = "datasource.%s.minEvictableIdleTimeMillis";
    private static final String TIME_BETWEEN_E_RUNSMILLIS = "datasource.%s.timeBetweenEvictionRunsMillis";
    private static final String NUM_TEST_PER_E_RUN = "datasource.%s.numTestsPerEvictionRun";

    @Autowired
    private Environment env;

    public static String CURRENT_DATASOURCE_TYPE;

    @Value("${current.datasource}")
    public void setCurrentDataSourceType(String type) {
        CURRENT_DATASOURCE_TYPE = type;
    }

    /**
     * MYSQL 数据源
     *
     * @return
     */
    @Bean(name = MYSQL)
    public DataSource mySqlDataSource() {
        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setUrl(env.getProperty(String.format(URL, MYSQL)));
        dataSource.setUsername(env.getProperty(String.format(USERNAME, MYSQL)));
        dataSource.setPassword(env.getProperty(String.format(PASSWORD, MYSQL)));
        dataSource.setDriverClassName(env.getProperty(String.format(DRIVER, MYSQL)));
        dataSource.setMaxActive(Integer.parseInt(env.getProperty(String.format(MAXACTIVE, MYSQL))));
        dataSource.setMaxIdle(Integer.parseInt(env.getProperty(String.format(MAXIDLE, MYSQL))));
        dataSource.setMinIdle(Integer.parseInt(env.getProperty(String.format(MINIDLE, MYSQL))));
        dataSource.setMaxWait(Long.parseLong(env.getProperty(String.format(MAXWAIT, MYSQL))));
        dataSource.setRemoveAbandoned(Boolean.parseBoolean(env.getProperty(String.format(REMOVE_ABANDONED, MYSQL))));
        dataSource.setRemoveAbandonedTimeout(Integer.parseInt(env.getProperty(String.format(REMOVE_ABANDONED_TIMEOUT, MYSQL))));
        dataSource.setLogAbandoned(Boolean.parseBoolean(env.getProperty(String.format(LOG_ABANDONED, MYSQL))));
        dataSource.setMinEvictableIdleTimeMillis(Long.parseLong(env.getProperty(String.format(MIN_E_IDLE_TIMEMILLIS, MYSQL))));
        dataSource.setTimeBetweenEvictionRunsMillis(Long.parseLong(env.getProperty(String.format(TIME_BETWEEN_E_RUNSMILLIS, MYSQL))));
        dataSource.setNumTestsPerEvictionRun(Integer.parseInt(env.getProperty(String.format(NUM_TEST_PER_E_RUN, MYSQL))));

        return dataSource;
    }
}
