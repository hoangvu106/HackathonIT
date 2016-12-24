/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        post("/login", (request, response) -> {
            
            String account = request.queryParams("account");
            String password = request.queryParams("password");
            System.out.println(account + " " + password);
            
            response.type("application/json");
            if(account.equals("hauchu1196")&&password.equals("123456")){
                return "{\"code\":\"1\"}";
            }
            return  "{\"code\":\"0\"}";
        });
    }
}
