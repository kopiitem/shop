package org.kopiitem.web;

import org.kopiitem.domain.Category;
import org.kopiitem.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by DonnyLies on 7/25/2016.
 */
@RestController
@RequestMapping("/notification")
public class NotificationController {

    @Autowired
    NotificationService notificationService;

    @RequestMapping("/getCategoryByName")
    String getCategoryByName() {
        return notificationService.getProductServiceClient().getCategoryByName("fish");
    }
}


