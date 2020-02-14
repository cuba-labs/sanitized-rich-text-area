package com.example.demo.web.util;

import org.owasp.html.PolicyFactory;
import org.owasp.html.Sanitizers;

public class DefaultSanitizer {

    private static PolicyFactory policy = Sanitizers.FORMATTING
            .and(Sanitizers.LINKS)
            .and(Sanitizers.BLOCKS)
            .and(Sanitizers.IMAGES)
            .and(Sanitizers.STYLES)
            .and(Sanitizers.TABLES);

    public static String sanitize(String html) {
        return policy.sanitize(html);
    }

}
