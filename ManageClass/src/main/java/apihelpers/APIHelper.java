/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apihelpers;

import configs.Contant;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

/**
 *
 * @author Hau
 */
public class APIHelper {

    private APIUser apiUser;

    private Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(Contant.APIURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public static APIHelper _sharePointer = new APIHelper();

    public static APIHelper getInstance() {
        return _sharePointer;
    }

    private APIHelper() {
        apiUser = retrofit.create(APIUser.class);
    }

    public APIUser getApiUser() {
        return apiUser;
    }
    
    
}
