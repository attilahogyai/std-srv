package org.hoa.service.version;

import org.springframework.stereotype.Component;

@Component
public class Version {

    private final String version;

    public Version(String version) {
        this.version = version;
    }

    public String version() {
        return this.version;
    }
}