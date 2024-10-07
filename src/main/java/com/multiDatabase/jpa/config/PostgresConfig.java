//package com.multiDatabase.jpa.config;
//
//import jakarta.persistence.EntityManagerFactory;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.PlatformTransactionManager;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableJpaRepositories(
//        basePackages = "com.multiDatabase.jpa",
//        entityManagerFactoryRef = "postgresEntityManagerFactory",
//        transactionManagerRef = "postgresTransactionManager"
//)
//public class PostgresConfig {
//
//    @Primary
//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSource postgresDataSource(){
//        return DataSourceBuilder.create().build();
//    }
//
//    @Primary
//    @Bean
//    public LocalContainerEntityManagerFactoryBean postgresEntityManagerFactory
//            (EntityManagerFactoryBuilder builder){
//        return builder
//                .dataSource(postgresDataSource())
//                .packages("com.multiDatabase.jpa")
//                .persistenceUnit("postgres")
//                .build();
//    }
//
//    @Primary
//    @Bean
//    public PlatformTransactionManager postgresTransactionManager(
//            @Qualifier("postgresEntityManagerFactory") EntityManagerFactory entityManagerFactory){
//        return new JpaTransactionManager(entityManagerFactory);
//    }
//}
