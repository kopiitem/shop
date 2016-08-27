package org.kopiitem.client;

import org.kopiitem.domain.Category;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by DonnyLies on 8/27/2016.
 */

@Component
public class ProductsServiceClientImpl implements ProductsServiceClient {
    @Override
    public String getCategoryByName(@PathVariable("name") String name) {
        return "";//new ArrayList<>();
    }
}
