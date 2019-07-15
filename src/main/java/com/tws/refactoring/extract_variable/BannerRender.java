package com.tws.refactoring.extract_variable;

public class BannerRender {
    String renderBanner(String platform, String browser) {
        boolean ie = browser.toUpperCase().contains("IE");
        boolean mac = platform.toUpperCase().contains("MAC");
        if (mac && ie) {
            return "IE on Mac?";

        }
        return "banner";

    }
}
