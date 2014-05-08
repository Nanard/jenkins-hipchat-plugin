package jenkins.plugins.hipchat;

import org.junit.Test;

public class StandardHipChatServiceTest {

    /**
     * Publish should generally not rethrow exceptions, or it will cause a build job to fail at end.
     */
    @Test
    public void publishWithBadHostShouldNotRethrowExceptions() {
        StandardHipChatService service = new StandardHipChatService("token", "room", "from", true);
        service.setHost("hostvaluethatwillcausepublishtofail");
        service.publish("message");
    }
}
