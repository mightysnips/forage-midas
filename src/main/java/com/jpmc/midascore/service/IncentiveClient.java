package com.jpmc.midascore.service;

import com.jpmc.midascore.foundation.IncentiveRequest;
import com.jpmc.midascore.foundation.IncentiveResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class IncentiveClient {

    private static final String INCENTIVE_URL =
            "http://localhost:8081/incentive";

    @Autowired
    private RestTemplate restTemplate;

    public float getIncentive(IncentiveRequest request) {
        IncentiveResponse response =
                restTemplate.postForObject(
                        INCENTIVE_URL,
                        request,
                        IncentiveResponse.class
                );
        return response != null ? response.getIncentive() : 0f;
    }
}