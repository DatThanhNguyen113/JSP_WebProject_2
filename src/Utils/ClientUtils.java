package Utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.UserInfo;

public class ClientUtils {
	 private static final String ATT_NAME_USER_NAME = "ATTRIBUTE_FOR_STORE_USER_NAME_IN_COOKIE";
	 private static final String ATT_NAME_USER_ID = "ATTRIBUTE_FOR_STORE_USER_ID_IN_COOKIE";
	 
	 
    public static void storeUserCookie(HttpServletResponse response, UserInfo user) {
        System.out.println("Store user cookie");
        Cookie cookieUserName = new Cookie(ATT_NAME_USER_NAME, user.getUserName());
        cookieUserName.setMaxAge(24 * 60 * 60);
        response.addCookie(cookieUserName);
        
        Cookie cookieUserID = new Cookie(ATT_NAME_USER_ID, String.valueOf(user.getUserID()));
        cookieUserID.setMaxAge(24 * 60 * 60);
        response.addCookie(cookieUserID);
    }
    
    public void deleteCookie(HttpServletResponse response) {
        Cookie cookieUserName = new Cookie(ATT_NAME_USER_NAME, null);
        cookieUserName.setMaxAge(0);
        response.addCookie(cookieUserName);
        
        Cookie cookieUserID = new Cookie(ATT_NAME_USER_ID, null);
        cookieUserID.setMaxAge(24 * 60 * 60);
        response.addCookie(cookieUserID);
    }
    
    public static String getUserNameInCookie(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (ATT_NAME_USER_NAME.equals(cookie.getName())) {
                    return cookie.getValue();
                }
            }
        }
        return null;
    }
}
