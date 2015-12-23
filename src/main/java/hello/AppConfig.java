package hello;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Created by joeyang on 12/23/15.
 */
@Configuration
@MapperScan("hello.mapper")
public class AppConfig {
    @Bean
    public DataSource getDataSource() {
        PooledDataSource ds = new PooledDataSource();
        ds.setDriver("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/test0");
        ds.setUsername("root");
        ds.setPassword("");
        return ds;
    }

    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(getDataSource());
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(getDataSource());
        return sessionFactory.getObject();
    }

}
