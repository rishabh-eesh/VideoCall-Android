package com.twiliovideo;

import org.springframework.stereotype.Component;

import com.twilio.jwt.accesstoken.AccessToken;
import com.twilio.jwt.accesstoken.VideoGrant;

@Component
public class TokenGenerator {

	public String generateToken(String identity) {

		
		
		 // Required for all types of tokens
	    String twilioAccountSid = "AC06babf7f00f99e6a84cd8400782679d8";
	    String twilioApiKey = "SKdfa785cf43c26230ed8951617507d824";
	    String twilioApiSecret = "HiuAz7Hap1GLB3TWfCJdIKWZLlJLDOYe";

	    // Required for Video
//	    String identity = "Rishabh"; /////commented newly

	    // Create Video grant
	    VideoGrant grant = new VideoGrant().setRoom("");//cool room

	    // Create access token
	    AccessToken token = new AccessToken.Builder(
	      twilioAccountSid,
	      twilioApiKey,
	      twilioApiSecret
	    ).identity(identity).grant(grant).build();

	    System.out.println(token.toJwt());
		
		return token.toJwt();
	}
}

