package project.security;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import io.jsonwebtoken.security.Keys;
//
//import java.security.Key;
//import java.security.SignatureException;
//
//public class JwtValidator {
//
//    private static final Key secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS256);
//
//    public static Claims validateToken(String token) throws SignatureException {
//        try {
//            Claims claims = Jwts.parserBuilder().setSigningKey(secretKey).build().parseClaimsJws(token).getBody();
//            return claims;
//        } catch (Exception e) {
//            // Handle signature exception
//            throw new SignatureException("JWT signature verification failed");
//        }
//    }
//}
