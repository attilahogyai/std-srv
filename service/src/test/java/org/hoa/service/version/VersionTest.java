package org.hoa.service.version;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest("version.version=1.0.0")
public class VersionTest {

    @Autowired
    private Version version;

    @Test
    public void contextLoads() {
        assertThat(version.version()).isNotNull();
    }

    @SpringBootApplication
    @Import(VersionConfiguration.class)
    static class TestConfiguration {
    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
}