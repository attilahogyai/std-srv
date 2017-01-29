package org.hoa.service.version;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(VersionProperties.class)
public class VersionConfiguration {
    @Bean
    public Version version(VersionProperties properties) {
        return new Version(properties.getVersion());
    }
}