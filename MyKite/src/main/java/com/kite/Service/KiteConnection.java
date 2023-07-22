package com.kite.Service;

import java.io.IOException;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;

import com.zerodhatech.kiteconnect.KiteConnect;
import com.zerodhatech.kiteconnect.kitehttp.exceptions.KiteException;
import com.zerodhatech.models.Profile;
import com.zerodhatech.models.User;

public class KiteConnection {

	@Autowired
	KiteConnect kiteconnect;
	
	@Autowired
	Profile profile;

	public void stepUpConnection(String apiKey,String secKey) {
		String req_token="CODE FROM PREVIOUS STEP" ;  
		kiteconnect = new KiteConnect(apiKey);
		kiteconnect.setUserId("LP8865");
		User users = null;
		try {
			users = kiteconnect.generateSession(req_token, secKey);
		}  catch (IOException ex) {
			ex.printStackTrace();
		} catch (KiteException ex) { 
			ex.printStackTrace();
		} catch (JSONException ex) {
			ex.printStackTrace();
		}
		kiteconnect.setAccessToken(users.accessToken);
		kiteconnect.setPublicToken(users.publicToken);
		try {
			profile=kiteconnect.getProfile();
			System.out.println(profile.userName);
		} catch (JSONException | IOException | KiteException e) {
			e.printStackTrace();
		}
	}
	
	

}
