

import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.util.Arrays;

import javax.xml.bind.DatatypeConverter;


public class HashF {
  public static void main(String[] args) throws Exception {

String path = "/Users/DD/policy.png";
MessageDigest md = MessageDigest.getInstance("MD5");
md.update(Files.readAllBytes(Paths.get(path)));
byte[] digest = md.digest();



String digestInHex = DatatypeConverter.printHexBinary(digest).toUpperCase();
System.out.println(digestInHex);
  
  }
}
