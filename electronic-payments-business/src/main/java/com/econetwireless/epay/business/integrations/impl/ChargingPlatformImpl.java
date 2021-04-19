package com.econetwireless.epay.business.integrations.impl;

import com.econetwireless.epay.business.integrations.api.ChargingPlatform;

import com.econetwireless.epay.business.utils.MessageConverters;
import com.econetwireless.in.webservice.CreditRequest;
import com.econetwireless.epay.business.config.IntelligentNetworkService;
import com.econetwireless.utils.pojo.INBalanceResponse;
import com.econetwireless.utils.pojo.INCreditRequest;
import com.econetwireless.utils.pojo.INCreditResponse;

/**
 * Created by tnyamakura on 17/3/2017.
 */
public class ChargingPlatformImpl implements ChargingPlatform{

    private IntelligentNetworkService intelligentNetworkService;

    public ChargingPlatformImpl(IntelligentNetworkService intelligentNetworkService) {
        this.intelligentNetworkService = intelligentNetworkService;
    }

    @Override
    public INBalanceResponse enquireBalance(final String partnerCode, final String msisdn) {
        return new INBalanceResponse();
        	//MessageConverters.convert(intelligentNetworkService.enquireBalance(partnerCode, msisdn));
    }

    @Override
    public INCreditResponse creditSubscriberAccount(final INCreditRequest inCreditRequest) {
        final CreditRequest creditRequest = MessageConverters.convert(inCreditRequest);
        return new INCreditResponse();
        		//MessageConverters.convert(intelligentNetworkService.creditSubscriberAccount(creditRequest));
    }
}
