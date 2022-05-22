package by.paramonov.warehousev3.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = {
        "by.paramonov.warehousev3.service.impl",
        "by.paramonov.warehousev3.mapper"
})
@EnableTransactionManagement
@Import(DaoConfig.class)
public class ServiceConfig {
}
