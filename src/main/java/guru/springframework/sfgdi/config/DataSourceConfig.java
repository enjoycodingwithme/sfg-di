package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.exampleBeans.FakeDataSource;
import guru.springframework.sfgdi.exampleBeans.FakeJmsSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
////@PropertySource("classpath:datasource.properties")
//@PropertySources({
//        @PropertySource("classpath:dataSource.properties"),
//        @PropertySource("classpath:jsm.properties")
//})
public class DataSourceConfig {

    @Value("${test.user}")
    private String user;

    @Value("${test.password}")
    private String password;

    @Value("${test.dburl}")
    private String url;

    @Value("${test.jsm.username}")
    private String jsmUsername;

    @Value("${test.jsm.password}")
    private String jsmPassword;

    @Value("${test.jsm.url}")
    private String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource dataSource = new FakeDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(password);
        dataSource.setUrl(url);
        return dataSource;
    }

    @Bean
    public FakeJmsSource jmsSource() {
        FakeJmsSource jmsSource = new FakeJmsSource();
        jmsSource.setUsername(jsmUsername);
        jmsSource.setPassword(jsmPassword);
        jmsSource.setUrl(jmsUrl);
        return jmsSource;
    }

//    @Bean
//    public static PropertySourcesPlaceholderConfigurer properties() {
//        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =
//                new PropertySourcesPlaceholderConfigurer();
//        return propertySourcesPlaceholderConfigurer;
//    }

}
