package org.kopiitem.client;

import org.kopiitem.domain.Category;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

/**
 * Created by DonnyLies on 7/25/2016.
 */

@FeignClient(name = "product-service")
public interface ProductsServiceClient {

    @RequestMapping(method = RequestMethod.GET, value = "/categories/search/by-name?name={name}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    Collection<Category> getCategoryByName(@PathVariable("name") String name);

}

