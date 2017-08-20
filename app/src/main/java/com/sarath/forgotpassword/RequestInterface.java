package com.sarath.forgotpassword;



import com.sarath.forgotpassword.models.ServerRequest;
import com.sarath.forgotpassword.models.ServerResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RequestInterface {

    @POST("learn2crack-login-register/")
    Call<ServerResponse> operation(@Body ServerRequest request);

}
