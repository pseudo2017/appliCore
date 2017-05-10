package com.lmg;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "lmg.config")
public class corePropertiesConfiguration {

    private String param_assumed_role;
    private String param_region;
    private String param_queue_name;
    private String param_queue_url;
    private String param_queue_name_new;
    private String param_sName = "Q1";
    private String param_proxyHost ="165.225.76.40" ;
//    private String param_proxyHost = null ;
    private String param_proxyPort = "9400";
    private String param_proxyUserName = "fabrice.ladoue@taores.fr";
    private String param_proxyPassWord = "TOTOmathis27";
    
    
    
	public String getParam_assumed_role() {
		return param_assumed_role;
	}
	public void setParam_assumed_role(String param_assumed_role) {
		this.param_assumed_role = param_assumed_role;
	}
	public String getParam_region() {
		return param_region;
	}
	public void setParam_region(String param_region) {
		this.param_region = param_region;
	}
	public String getParam_queue_name() {
		return param_queue_name;
	}
	public void setParam_queue_name(String param_queue_name) {
		this.param_queue_name = param_queue_name;
	}
	public String getParam_queue_url() {
		return param_queue_url;
	}
	public void setParam_queue_url(String param_queue_url) {
		this.param_queue_url = param_queue_url;
	}
	public String getParam_queue_name_new() {
		return param_queue_name_new;
	}
	public void setParam_queue_name_new(String param_queue_name_new) {
		this.param_queue_name_new = param_queue_name_new;
	}
	public String getParam_proxyHost() {
		return param_proxyHost;
	}
	public void setParam_proxyHost(String param_proxyHost) {
		this.param_proxyHost = param_proxyHost;
	}
	public String getParam_proxyPort() {
		return param_proxyPort;
	}
	public void setParam_proxyPort(String param_proxyPort) {
		this.param_proxyPort = param_proxyPort;
	}
	public String getParam_proxyUserName() {
		return param_proxyUserName;
	}
	public void setParam_proxyUserName(String param_proxyUserName) {
		this.param_proxyUserName = param_proxyUserName;
	}
	public String getParam_proxyPassWord() {
		return param_proxyPassWord;
	}
	public void setParam_proxyPassWord(String param_proxyPassWord) {
		this.param_proxyPassWord = param_proxyPassWord;
	}
	public String getParam_sName() {
		return param_sName;
	}
	public void setParam_sName(String param_sName) {
		this.param_sName = param_sName;
	}	
	public void affiche()
	{
		
		System.out.println("----------------------x----------------------");
		System.out.println("param_assumed_role->" + param_assumed_role);
		System.out.println("param_region->" + param_region);
		System.out.println("param_sName->" + param_sName);
		System.out.println("param_queue_name->" + param_queue_name);
		System.out.println("param_queue_url->" + param_queue_url);
		System.out.println("param_queue_name_new->" + param_queue_name_new) ;	
		System.out.println("--------------------------------------------");
		System.out.println("param_proxyHost->" + param_proxyHost) ;	
		System.out.println("param_proxyPort->" + param_proxyPort) ;	
		System.out.println("param_proxyUserName->" + param_proxyUserName) ;	
		System.out.println("param_proxyPassWord->" + param_proxyPassWord) ;	
		System.out.println("--------------------------------------------");
	}
}
