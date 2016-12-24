/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenters;

import apihelpers.APIHelper;
import models.BaseResult;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import views.LoginView;

/**
 *
 * @author Hau
 */
public class LoginPresenterImpl implements LoginPresenter{

    private LoginView loginView;
    
    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
    }
    
    @Override
    public void login(String account, String password) {
        APIHelper.getInstance()
                .getApiUser()
                .login(account, password)
                .enqueue(new Callback<BaseResult>() {
            @Override
            public void onResponse(Call<BaseResult> call, Response<BaseResult> response) {
                if (response.body().getCode() == 1) {
                    loginView.loginSuccess();
                } else {
                    loginView.loginFail();
                }
            }

            @Override
            public void onFailure(Call<BaseResult> call, Throwable t) {
                t.printStackTrace(System.out);
            }
        });
    }
    
}
