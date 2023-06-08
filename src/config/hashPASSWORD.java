/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
/**
 *
 * @author COLLEGE17
 */
public class hashPASSWORD {
    public static String hashPassword(String password)throws NoSuchAlgorithmException{
        MessageDigest md= MessageDigest.getInstance("MD5");
        byte[]hashbytes= md.digest(password.getBytes());
        String encoded= Base64.getEncoder().encodeToString(hashbytes);
        return encoded;
}
}
