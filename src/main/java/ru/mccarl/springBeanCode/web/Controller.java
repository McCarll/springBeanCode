package ru.mccarl.springBeanCode.web;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vrudometkin on 24/11/2017.
 */
@RestController
@Configuration
@RequestMapping(produces = "application/json")
public class Controller {

    @ApiOperation(value = "Резервирование счета")
    @RequestMapping(value = "/getInfo", method = RequestMethod.GET)
    public ResponseEntity getInfo(){
        return ResponseEntity
                .ok("{\"Body\":\"Just response Entity\"}");
    }


}
