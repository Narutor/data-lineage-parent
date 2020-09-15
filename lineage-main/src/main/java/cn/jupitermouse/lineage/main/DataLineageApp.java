package cn.jupitermouse.lineage.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.kafka.annotation.EnableKafka;


/**
 * <p>
 * 启动类
 * </p>
 *
 * @author JupiterMouse 2020/09/09
 * @since 1.0
 */
@SpringBootApplication(
        scanBasePackages = {"cn.jupitermouse.lineage"}
)
@EnableNeo4jRepositories(basePackages = {"cn.jupitermouse.lineage.graph.repository"})
// soved not a valid entity class. Please check the entity mapping
@EntityScan(basePackages = "cn.jupitermouse.lineage.graph.entity")
@EnableKafka
public class DataLineageApp {

    public static void main(String[] args) {
        SpringApplication.run(DataLineageApp.class, args);
    }

}
