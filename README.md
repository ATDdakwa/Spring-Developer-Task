### Developer Task 1 

* You will receive instructions from Cassava Smartech on what's required.



1. Added new dependency in POM 
<!-- https://mvnrepository.com/artifact/javax.xml/webservices-api -->
<dependency>
    <groupId>javax.xml</groupId>
    <artifactId>webservices-api</artifactId>
    <version>2.1-b16</version>
</dependency>

2. return INCreditResponse
 @Override
    public INCreditResponse creditSubscriberAccount(final INCreditRequest inCreditRequest) {
        final CreditRequest creditRequest = MessageConverters.convert(inCreditRequest);
        return new INCreditResponse();
        		//MessageConverters.convert(intelligentNetworkService.creditSubscriberAccount(creditRequest));

3. return INBalanceResponse
  @Override
    public INBalanceResponse enquireBalance(final String partnerCode, final String msisdn) {
        return new INBalanceResponse();
        	//MessageConverters.convert(intelligentNetworkService.enquireBalance(partnerCode, msisdn));
			
4. Created missing methods like below

	public String getNarrative() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getMsisdn() {
		// TODO Auto-generated method stub
		return null;
	}

	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getResponseCode() {
		// TODO Auto-generated method stub
		return null;
    
5.		created objects and instantiated them like
MobileNumberUtils p = new MobileNumberUtils();	
        return enquiriesService.enquire(partnerCode, p.formatMobileToInternationalMode(msisdn));

