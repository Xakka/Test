import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Test {
        public static void main(String args[]) throws NoSuchAlgorithmException {
            System.out.println(getMD5("test"));
            // 098f6bcd4621d373cade4e832627b4f6
        }
        public static String getMD5(String s) throws NoSuchAlgorithmException {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.reset();
            md5.update(s.getBytes());
            BigInteger bigInt = new BigInteger(1,md5.digest());
            String hashtext = bigInt.toString(16);
            while(hashtext.length() < 32 ){
                hashtext = "0"+hashtext;
            }
            return hashtext;
        }
}