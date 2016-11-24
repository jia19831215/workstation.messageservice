package workstation.messageservice.server.host.configurations;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;
import workstation.core.exceptions.SystemException;
import workstation.spring.util.SpringContextUtil;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
public class MyBatisConfig implements TransactionManagementConfigurer {

    @Autowired
    @Qualifier(DataSourceConfig.MYSQL)
    DataSource dataSource;

    @Bean
    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return new DataSourceTransactionManager(this.dataSource);
    }

    @Bean
    public SqlSessionFactory sqlSessionFactoryBean() {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();

        // TODO：SqlSessionFactory 初始化

        try {
            return bean.getObject();
        } catch (Exception ce) {
            throw new SystemException("SqlSessionFactory init", ce);
        }
    }
}