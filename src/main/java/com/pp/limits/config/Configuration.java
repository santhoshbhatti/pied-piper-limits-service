package com.pp.limits.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@ConfigurationProperties("limits-service")
@Setter @Getter
public class Configuration {
	private int minimum;
	private int maximum;
}
