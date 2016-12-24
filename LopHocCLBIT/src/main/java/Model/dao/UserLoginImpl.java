/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author DatNguyen
 */
public class UserLoginImpl implements UserLogin {
    
    @Override
    public boolean checkLogin(String username, String password) {
        Connection conn =  ConnectionUtil.getConnection();
        
        String s1 = "select * from account";
        try{
            Statement stm = conn.createStatement();
            ResultSet rs =  stm.executeQuery(s1);
            while(rs.next()){
                String name = rs.getString("name");
                String pass = rs.getString("pass");
                if(name.equals(username) && pass.equals(password)){
                    return true;
                }
            }
            
        }catch(Exception e){
            
        } 
        return false;
    }   
}
