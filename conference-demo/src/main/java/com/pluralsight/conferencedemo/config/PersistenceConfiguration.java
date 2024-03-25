/*package com.pluralsight.conferencedemo.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.*;

@Configuration
public class PersistenceConfiguration {

	@Bean
	public DataSource dataSource() {
		DataSourceBuilder builder = DataSourceBuilder.create();
		builder.url("jdbc:mysql://localhost:3306/conference_demo");
		
		System.out.println("My custon datasource has been inizialited and set");
		return builder.build();

}
*/