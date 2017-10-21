package libs;

import controllers.Application.AppTags;
import org.apache.commons.mail.EmailAttachment;
import play.Environment;
import play.api.Play;
import play.libs.mailer.Email;
import play.libs.mailer.MailerClient;

import javax.inject.Inject;
import java.io.File;
import java.util.Arrays;

public class Mailer {

    @Inject
    MailerClient mailerClient;
    @Inject
    Environment environment;

    public Mailer() {
        mailerClient = Play.current().injector().instanceOf(MailerClient.class);
        environment = Play.current().injector().instanceOf(Environment.class);
    }

    /**
     * Call with CompletableFuture.supplyAsync(() -> Mailer.SendWelcome("New User", c.getEmail()), httpExecutionContext.current());
     * @param name
     * @param email_address
     * @return
     */
    public static boolean SendWelcome(String name, String email_address) {
        Email email = Mailer.StandardEmail()
                .setTo(Arrays.asList(email_address))
                .setSubject(AppTags.General.SITENAME.toString() + ": Welcome")
                .setBodyHtml("Welcome, " + name +
                        "<br/><br/>We hope you enjoy using this service:" +
                        "<br/><br/>Regards," +
                        "<br/>The " + AppTags.General.SITENAME.toString() + " Team");
        return new Mailer().sendEmail(email);
    }

    public static boolean SendVerificationEmail(String email_address, String token) {
        String verificationUrl = "http://localhost:8080/User/Verify/" + token;
        Email verificationEmail = Mailer.StandardEmail()
                .setTo(Arrays.asList(email_address))
                .setSubject(AppTags.General.SITENAME.toString() + ": Account Verification")
                .setBodyHtml("Welcome to " + AppTags.General.SITENAME.toString() +
                        "<br/><br/>Please verify your account using hyperlink below:" +
                        "<br/><br/><i><a style=\"color:blue;font-size:2em;\" href=\"" + verificationUrl + "\">Verify Account</i></a>" +
                        "<br/><br/>or visiting the URL below:" +
                        "<br/><br/><a href=\"" + verificationUrl + "\">" + verificationUrl + "</a>" +
                        "<br/><br/>If you have not created an account at " + AppTags.General.SITENAME.toString() + " then ignore this email" +
                        "<br/><br/>Regards," +
                        "<br/>The " + AppTags.General.SITENAME.toString() + " Team");
        return new Mailer().sendEmail(verificationEmail);
    }

    public static boolean SendPasswordChange(String fullName, String email_address, String date) {
        Email email = Mailer.StandardEmail()
                .setTo(Arrays.asList(email_address))
                .setSubject(AppTags.General.SITENAME.toString() + ": Password Change")
                .setBodyHtml("Hi, " + fullName +
                        "<br/><br/>Notifying you of a password change at " + date +
                        "<br/><br/>Regards," +
                        "<br/>The " + AppTags.General.SITENAME.toString() + " Team");
        return new Mailer().sendEmail(email);
    }

    public static boolean sendPasswordReset(String name, String email_address, String token) {
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
        return false;
    }




    public boolean sendEmail(Email email) {
        try {
            MailerClient mailer = mailerClient;
            mailer.send(email);
            return true;
        } catch (Exception x) {
            x.printStackTrace();
            return false;
        }
    }

    private static Email StandardEmail() {
        File logo = new Mailer().getLogo();
        return new Email()
                .setFrom("Admin@" + AppTags.General.SITEDOMAIN.toString())
                .setBodyText("Cannot display HTML message in your client!")
                .addAttachment(AppTags.General.SITENAME.toString() + " Logo", logo, AppTags.General.SITENAME.toString() + " Logo", EmailAttachment.INLINE);
    }

    private File getFile(String s) {
        return environment.getFile(s);
    }

    private File getLogo() {
        return environment.getFile("public/images/logo.png");
    }
}
