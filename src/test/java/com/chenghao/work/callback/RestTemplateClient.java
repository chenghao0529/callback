package com.chenghao.work.callback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
public class RestTemplateClient {
    private static final Logger log = LoggerFactory.getLogger(RestTemplateClient.class);
    private static final int connectTimeout= 5000;
    private static final int readTimeOut=5000;
    private RestTemplate restTemplate;
    public RestTemplateClient(){
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(connectTimeout);
        requestFactory.setReadTimeout(readTimeOut);
        restTemplate = new RestTemplate(requestFactory);    }
    public String executePost(String url, String base64Tdf){
        String result = null;
        HttpEntity<String>request = new HttpEntity<String>(base64Tdf);
        try{
            result=restTemplate.postForObject(url, request, String.class);
        }catch(RestClientException ex){
            ex.printStackTrace();
            log.info("call post interface error: " + ex.getMessage());
        }                    return result;    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String url = "http://169.8.160.201:8080/xx/Webservice/Submit";
        String base64Tdf = "MS4wMToxMzIdMS4wMjowMjAxHTEuMDM6MR8wMR4yHzAwHTEuMDQ6SVJRHTEuMDU6MjAxNjA1MDQdMS4wNjoxHTEuMDc6Q09HRU5UHTEuMDg6VEhBSUxBTkQdMS4wOTpTRVFVRU5DRU5PMTIzNB0xLjExOjE5LjY5HTEuMTI6MTkuNjkcMi4wMDE6MzEdMi4wMDI6MDAdMi4xNzY6MDA3MDA5HA==";
        RestTemplateClient client = new RestTemplateClient();
        String result=client.executePost(url, base64Tdf);
        System.out.println(result);
    }        }

