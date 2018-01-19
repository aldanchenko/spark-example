package ua.opengrok.plugin;

import org.junit.Test;

/**
 * Simple test for Copy OpenGrokUrl plugin.
 */
public class CopyOpenGrokUrlTest {

    @Test
    public void testCopyOpenGrokUrl() {
        String openGrokUrl1 = "https://opengrok.com/xref/foo/bar.java?r=c20ccf8c#7";

        String openGrokUrl2 = "https://opengrokdomain.com/xref/reponame/foo.java?r=ade35edb&ln=123";

        String openGrokUrl3 = "https://opengrok.com/xref/reponame/foo.java?r=ade35edb&ln=123";

        String notOpenGrokUrl = "google.com";
    }
}
