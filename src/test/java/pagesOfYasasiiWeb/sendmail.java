package pagesOfYasasiiWeb;

import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.sql.DataSource;

import org.openqa.selenium.WebDriver;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class sendmail extends PageFactoryInitYasasiiWeb{

	public sendmail(WebDriver driver) {
	
		super(driver);
	}
	
	
	public void reportmailing()
	{
		  // instance of Properties class
	      Properties p = new Properties();
	      // configure host server
	      p.put("mail.smtp.host", "smtp.yahoo.com");
	      // configure socket port p.put("mail.smtp.socketFactory.port", "529");
	      // configure socket factory
	      p.put ("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
	      // configure true authentication p.put("mail.smtp.auth", "true");
	      // configure smtp port
	      p.put("mail.smtp.port", "465");
	      // authentication with Session class
	      Session s= Session.getDefaultInstance(p, new javax.mail.Authenticator() {
	         protected PasswordAuthentication getPasswordAuthentication() {
	            return new PasswordAuthentication("mail id", "password");
	         }
	      });
	     // try {
	         // instance of MimeMessage
	         Message m = new MimeMessage(s);
	         // address of Form
	//         m.setFrom(new InternetAddress ("test12@yahoo.com"));
	         //address of recipient 
//	         m.setRecipients(Message.RecipientType.TO,InternetAddress.parse("test13@yahoo.com"));
	         // email subject text
	//         m.setSubject("Email Report");
	//         // configure multi-media email
	         BodyPart b = new MimeBodyPart();
	         // email body text
	//         b.setText("Overall Selenium Test Report");
	//         // configure multi-media email for another text 
	         BodyPart b1 = new MimeBodyPart();
	         // name of file to be attached to email
	         String s1 = "";
	         // pass filename
	 //        DataSource sr= new FileDataSource(s1);
	         // set the handler
	//         b2.setDataHandler(new DataHandler(sr));
	         // configure file
	//         b2.setFileName(s1);
	         // instance of class MimeMultipart
	         Multipart mm = new MimeMultipart();
	         // adding body texts
	   //      mm.addBodyPart(b1);
	  //       mm.addBodyPart(b);
	         // add email content
	  //       m.setContent(mm);
	         // email sending
	   //      System.out.println("MAIL TRIGGERED");

	} //catch (MessagingException e) {

	//	throw new RuntimeException(e);

	}

//}

//		

