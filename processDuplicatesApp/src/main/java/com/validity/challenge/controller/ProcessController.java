package com.validity.challenge.controller;


import com.validity.challenge.Service.MetaPhoneService;

import com.validity.challenge.Pojo.Person;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


@Controller
public class ProcessController {

    private final static Logger LOG = LoggerFactory.getLogger(ProcessController.class);

    @Autowired
    MetaPhoneService metaPhoneService;


    @GetMapping("/")
    public String upload() {
        return "uploadFile";
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String home(Model model, @RequestParam MultipartFile file)
            throws IOException {
        LOG.info("Entered upload logic");
        String fileName = file.getOriginalFilename();
        String suffix = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
        String path = System.getProperty("user.dir") + "/files";
        if (!suffix.equals("csv")) {
            LOG.error("Please upload csv file only");
            return "error";
        } else {
            file.transferTo(new File(path, fileName));
        }
        final String SAMPLE_CSV_FILE_PATH = path + "/" + fileName;
        Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
        CsvToBean<Person> DataList = new CsvToBeanBuilder(reader).withType(Person.class).withIgnoreLeadingWhiteSpace(true).build();
        List<Person> personList = DataList.parse();

        model= metaPhoneService.processFile(personList,metaPhoneService,LOG,model);

        return "results";

    }
}
