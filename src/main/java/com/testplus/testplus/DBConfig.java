package com.testplus.testplus;


//@Configuration
public class DBConfig {

    //@Bean
    //@Profile("test")// essa é uma opção de configuração, porém o SpringBootTest já idenfica automaticamente h2 no pom.xml e configura tudo
    //para nós automaticamente, não tendo a necessidade da configuração abaixo.
   /* public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:mem:testdb");
        dataSource.setUsername("sa");
        dataSource.setPassword("password");

        return dataSource;
    }*/
}
