package org.kopiitem.service;

import org.kopiitem.client.ProductsServiceClient;
import org.kopiitem.client.ProductsServiceClientImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by DonnyLies on 7/26/2016.
 */
@Service
public class NotificationService {
    @Autowired
    private ProductsServiceClient productServiceClient;

    public ProductsServiceClient getProductServiceClient() {
        return productServiceClient;
    }
    @Autowired
    public void setProductServiceClient(ProductsServiceClient productServiceClient) {
        this.productServiceClient = productServiceClient;
    }
}
