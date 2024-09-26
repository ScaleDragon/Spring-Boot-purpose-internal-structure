package ru.netology.homework_spring_boot_purpose_internal_structure_v1.javaConfig;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.homework_spring_boot_purpose_internal_structure_v1.devProfile.DevProfile;
import ru.netology.homework_spring_boot_purpose_internal_structure_v1.productionProfile.ProductionProfile;
import ru.netology.homework_spring_boot_purpose_internal_structure_v1.systemProfile.SystemProfile;

@Configuration
public class JavaConfig {
    @Bean
    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
