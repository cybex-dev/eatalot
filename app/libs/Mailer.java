package libs;

import controllers.Application.AppTags;
import org.apache.commons.mail.EmailAttachment;
import play.Environment;
import play.Logger;
import play.api.Play;
import play.libs.mailer.Email;
import play.libs.mailer.MailerClient;

import javax.activation.FileDataSource;
import javax.annotation.Nullable;
import javax.inject.Inject;
import java.io.File;
import java.util.Arrays;

public class Mailer {

    private MailerClient mailerClient;

    public Mailer(MailerClient mailerClient){
        this.mailerClient = mailerClient;
    }

    public String sendVerification(String email_address, String verificationUrl, @Nullable File image) {
        try {
            Email email = new Email()
                    .setTo(Arrays.asList(email_address))
                    .setFrom("Admin@" + AppTags.General.SITEDOMAIN.toString())
                    .setSubject(AppTags.General.SITENAME.toString() + ": Account Verification")
                    .setBodyText("Cannot display HTML message in your client!")
                    .setBodyHtml("Welcome " +
                            "<br/><br/>Please verified your account using the link provided below:" +
                            "<br/><br/><i><a style=\"color:blue;font-size:2em;\" href=\"" + verificationUrl + "\"/>Verify Account</i>" +
                            "<br/><br/>If you have not created an account at " + AppTags.General.SITENAME.toString() + " then ignore this email" +
                            "<br/><br/>Regards," +
                            "<br/>The " + AppTags.General.SITENAME.toString() + " Team")
                    .addAttachment("Eatalot Logo", image, "Eatalot Logo", EmailAttachment.INLINE);
            MailerClient mailer = mailerClient;
            String send = mailer.send(email);
            return send;
        }
        catch (Exception x){
            x.printStackTrace();
            throw x;
        }
    }

    public void sendWelcome(String name, String email_address, String token) {
        // TODO implement this
//        Email email = new Email()
//                .setSubject("Simple email")
//                .setFrom("Mister FROM <from@email.com>")
//                .addTo("Miss TO <to@email.com>")
//                // adds attachment
//                .addAttachment("attachment.pdf", new File("/some/path/attachment.pdf"))
//                // adds inline attachment from byte array
//                .addAttachment("data.txt", "data".getBytes(), "text/plain", "Simple data", EmailAttachment.INLINE)
//                // adds cid attachment
//                .addAttachment("image.jpg", new File("/some/path/image.jpg"), cid)
//                // sends text, HTML or both...
//                .setBodyText("A text message")
//                    .setBodyHtml("<html><body><p>An <b>html</b> message with cid <img src=\"cid:" + cid + "\"></p></body></html>");
//        mailerClient.send(email);
    }

    public void sendPasswordReset(String name, String email_address, String token) {
        // TODO implement this
//        Email email = new Email()
//                .setSubject("Simple email")
//                .setFrom("Mister FROM <from@email.com>")
//                .addTo("Miss TO <to@email.com>")
//                // adds attachment
//                .addAttachment("attachment.pdf", new File("/some/path/attachment.pdf"))
//                // adds inline attachment from byte array
//                .addAttachment("data.txt", "data".getBytes(), "text/plain", "Simple data", EmailAttachment.INLINE)
//                // adds cid attachment
//                .addAttachment("image.jpg", new File("/some/path/image.jpg"), cid)
//                // sends text, HTML or both...
//                .setBodyText("A text message")
//                .setBodyHtml("<html><body><p>An <b>html</b> message with cid <img src=\"cid:" + cid + "\"></p></body></html>");
//        mailerClient.send(email);
    }
}
